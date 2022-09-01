package flyproject.ultraqbot.hook

import com.xbaimiao.mirai.event.BotJoinGroupEvent
import com.xbaimiao.mirai.event.FriendMessageEvent
import com.xbaimiao.mirai.event.GroupMessageEvent
import com.xbaimiao.mirai.eventbus.SubscribeHandler
import com.xbaimiao.mirai.eventbus.SubscribeListener
import org.bukkit.Bukkit

class MessageListener(): SubscribeListener {
    @SubscribeHandler
    fun onGroup(event: GroupMessageEvent){
        Bukkit.getPluginManager()
            .callEvent(flyproject.ultraqbot.events.GroupMessageEvent(event))
    }

    @SubscribeHandler
    fun onPrivate(event: FriendMessageEvent){
        Bukkit.getPluginManager().callEvent(flyproject.ultraqbot.events.FriendMessageEvent(event))
    }

    @SubscribeHandler
    fun onBotJoinGroup(event: BotJoinGroupEvent){
        Bukkit.getPluginManager().callEvent(flyproject.ultraqbot.events.BotJoinGroupEvent(event))
    }
}