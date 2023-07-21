package dev.rgbmc.ultraqbot.hook

import com.xbaimiao.mirai.event.*
import com.xbaimiao.mirai.eventbus.SubscribeHandler
import com.xbaimiao.mirai.eventbus.SubscribeListener
import dev.rgbmc.ultraqbot.events.BotLeaveActiveEvent
import dev.rgbmc.ultraqbot.events.BotLeaveDisbandEvent
import dev.rgbmc.ultraqbot.events.BotLeaveKickEvent
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
        Bukkit.getPluginManager().callEvent(BotLeaveActiveEvent(event))
    }

    @SubscribeHandler
    fun onBotLeaveEventDisband(event: BotLeaveEventDisband){
        Bukkit.getPluginManager().callEvent(BotLeaveDisbandEvent(event))
    }
    @SubscribeHandler
    fun onBotLeaveEventKick(event: BotLeaveEventKick){
        Bukkit.getPluginManager().callEvent(BotLeaveKickEvent(event))
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
    @SubscribeHandler
    fun onGroupEntranceAnnouncementChange(event: GroupEntranceAnnouncementChangeEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.GroupEntranceAnnouncementChangeEvent(event))
    }
    @SubscribeHandler
    fun onGroupMuteAll(event: GroupMuteAllEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.GroupMuteAllEvent(event))
    }
    @SubscribeHandler
    fun onGroupNameChange(event: GroupNameChangeEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.GroupNameChangeEvent(event))
    }
    @SubscribeHandler
    fun onGroupPermissionChange(event: GroupPermissionChangeEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.GroupPermissionChangeEvent(event))
    }
    @SubscribeHandler
    fun onGroupRecall(event: GroupRecallEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.GroupRecallEvent(event))
    }
    @SubscribeHandler
    fun onMemberMute(event: MemberMuteEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.MemberMuteEvent(event))
    }
    @SubscribeHandler
    fun onMemberUnMute(event: MemberUnMuteEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.MemberUnMuteEvent(event))
    }
    @SubscribeHandler
    fun onMemberPermissionChange(event: MemberPermissionChangeEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.MemberPermissionChangeEvent(event))
    }
    @SubscribeHandler
    fun onMessage(event: MessageEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.MessageEvent(event))
    }
    @SubscribeHandler
    fun onNudge(event: NudgeEvent){
        Bukkit.getPluginManager().callEvent(dev.rgbmc.ultraqbot.events.NudgeEvent(event))
    }
}