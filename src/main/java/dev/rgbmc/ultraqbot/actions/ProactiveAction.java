package dev.rgbmc.ultraqbot.actions;

import com.xbaimiao.mirai.packet.impl.group.InviteBotRequestResponsePacket;
import com.xbaimiao.mirai.packet.impl.group.MemberJoinRequestResponsePacket;
import com.xbaimiao.mirai.packet.impl.group.NewFriendRequestResponsePacket;
import dev.rgbmc.ultraqbot.events.BotInvitedJoinGroupRequestEvent;
import dev.rgbmc.ultraqbot.events.MemberJoinRequestEvent;
import dev.rgbmc.ultraqbot.events.NewFriendRequestEvent;

public class ProactiveAction {
    public static void friendAddOperate(NewFriendRequestEvent event, String message, NewFriendRequestResponsePacket.Operate operate) {
        event.operate(message, operate);
    }

    public static void botInviteOperate(BotInvitedJoinGroupRequestEvent event, String message, InviteBotRequestResponsePacket.Operate operate) {
        event.operate(message, operate);
    }

    public static void memberJoinOperate(MemberJoinRequestEvent event, String message, MemberJoinRequestResponsePacket.Operate operate) {
        event.operate(message, operate);
    }
}
