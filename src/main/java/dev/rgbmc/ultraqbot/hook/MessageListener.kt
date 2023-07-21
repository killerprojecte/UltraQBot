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

    @SubscribeHandler
    fun onNewFriendRequest(event: NewFriendRequestEvent) {
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.NewFriendRequestEvent(event))
    }
    @SubscribeHandler
    fun onBotLeaveEventActive(event: BotLeaveEventActive){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.BotLeaveEventActive(event))
    }

    @SubscribeHandler
    fun onBotLeaveEventDisband(event: BotLeaveEventDisband){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.BotLeaveEventDisband(event))
    }
    @SubscribeHandler
    fun onBotLeaveEventKick(event: BotLeaveEventKick){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.BotLeaveEventKick(event))
    }
    @SubscribeHandler
    fun onBotMute(event: BotMuteEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.BotMuteEvent(event))
    }
    @SubscribeHandler
    fun onBotMute(event: BotUnMuteEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.BotUnMuteEvent(event))
    }
    @SubscribeHandler
    fun onFriendRecall(event: FriendRecallEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.FriendRecallEvent(event))
    }
    @SubscribeHandler
    fun onGroupAllowAnonymousChat(event: GroupAllowAnonymousChatEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.GroupAllowAnonymousChatEvent(event))
    }
    @SubscribeHandler
    fun onGroupAllowConfessTalk(event: GroupAllowConfessTalkEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.GroupAllowConfessTalkEvent(event))
    }
    @SubscribeHandler
    fun onGroupAllowMemberInvite(event: GroupAllowMemberInviteEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.GroupAllowMemberInviteEvent(event))
    }
}