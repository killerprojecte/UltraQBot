package flyproject.ultraqbot.hook

import com.xbaimiao.mirai.event.FriendMessageEvent
import com.xbaimiao.mirai.event.GroupMessageEvent
import com.xbaimiao.mirai.eventbus.SubscribeHandler
import com.xbaimiao.mirai.eventbus.SubscribeListener
import com.xbaimiao.mirai.packet.impl.websocket.WebSocketBot
import com.xbaimiao.mirai.packet.impl.websocket.WsInfo
import flyproject.ultraqbot.UltraQBot
import org.bukkit.Bukkit

object MiraiHttp {
    lateinit var listener: MessageListener
    lateinit var bot: WebSocketBot
    fun run() {
        listener = MessageListener()
        val wsInfo = WsInfo(UltraQBot.instance.config.getString("url")!!,
            UltraQBot.instance.config.getLong("qq"),
            UltraQBot.instance.config.getString("authKey")!!)
        bot = WebSocketBot(wsInfo).connect()
        bot.join()
        bot.eventChancel.subscribe(listener)
        Bukkit.getScheduler().runTaskTimerAsynchronously(UltraQBot.instance,
            Runnable {
                bot.eventChancel.unsubscribe(listener)
                bot.disable()
                if (UltraQBot.instance.config.getBoolean("reconnect_notify")){
                    println("UltraQBot 已重新连接服务器")
                }
                bot = WebSocketBot(wsInfo).connect()
                bot.join()
                bot.eventChancel.subscribe(listener)
            },20L * UltraQBot.instance.config.getLong("autoReconnect"),20L * UltraQBot.instance.config.getLong("autoReconnect"))
    }
}