package dev.rgbmc.ultraqbot.hook

import com.xbaimiao.mirai.packet.impl.websocket.WebSocketBot
import com.xbaimiao.mirai.packet.impl.websocket.WsInfo
import dev.rgbmc.ultraqbot.UltraQBot
import org.bukkit.Bukkit

object MiraiHttp {
    lateinit var listener: MessageListener
    lateinit var bot: WebSocketBot
    fun run() {
        listener = MessageListener()
        val wsInfo = WsInfo(
            UltraQBot.instance.config.getString("bot.url")!!,
            UltraQBot.instance.config.getLong("bot.qq"),
            UltraQBot.instance.config.getString("bot.authKey")!!
        )
        bot = WebSocketBot(wsInfo).connect()
        bot.join()
        bot.eventChancel.subscribe(listener)
        Bukkit.getScheduler().runTaskTimerAsynchronously(
            UltraQBot.instance,
            Runnable {
                bot.eventChancel.unsubscribe(listener)
                bot.disable()
                if (UltraQBot.instance.config.getBoolean("reconnect_notify")) {
                    println("UltraQBot 已重新连接服务器")
                }
                bot = WebSocketBot(wsInfo).connect()
                bot.join()
                bot.eventChancel.subscribe(listener)
            },
            20L * UltraQBot.instance.config.getLong("autoReconnect"),
            20L * UltraQBot.instance.config.getLong("autoReconnect")
        )
    }
}