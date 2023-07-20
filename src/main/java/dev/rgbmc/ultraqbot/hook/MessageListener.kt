package dev.rgbmc.ultraqbot.hook

import com.xbaimiao.mirai.event.*
import com.xbaimiao.mirai.eventbus.SubscribeHandler
import com.xbaimiao.mirai.eventbus.SubscribeListener
import org.bukkit.Bukkit

class MessageListener : SubscribeListener {
    @SubscribeHandler
    fun onGroup(event: GroupMessageEvent) {
        Bukkit.getPluginManager()
            .callEvent(dev.rgbmc.ultraqbot.events.GroupMessageEvent(event))
    }

    @SubscribeHandler
    fun onPrivate(event: FriendMessageEvent) {
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.FriendMessageEvent(event))
    }

    @SubscribeHandler
    fun onBotJoinGroup(event: BotJoinGroupEvent) {
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.BotJoinGroupEvent(event))
    }

    @SubscribeHandler
    fun onBotInvitedJoinGroupRequest(event: BotInvitedJoinGroupRequestEvent) {
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.BotInvitedJoinGroupRequestEvent(event))
    }

    @SubscribeHandler
    fun onMemberJoin(event: MemberJoinEvent) {
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.MemberJoinEvent(event))
    }

    @SubscribeHandler
    fun onMemberJoinRequest(event: MemberJoinRequestEvent) {
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.MemberJoinRequestEvent(event))
    }

    @SubscribeHandler
    fun onMemberKickLeave(event: MemberLeaveEventKick) {
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.MemberKickLeaveEvent(event))
    }

    @SubscribeHandler
    fun onMemberQuitLeave(event: MemberLeaveEventQuit) {
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.MemberQuitLeaveEvent(event))
    }

    @SubscribeHandler
    fun onGroupTempMessage(event: GroupTempMessageEvent) {
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.GroupTempMessageEvent(event))
    }
}