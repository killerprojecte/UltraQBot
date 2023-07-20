package dev.rgbmc.ultraqbot.actions;

import com.xbaimiao.mirai.entity.Friend;
import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;
import com.xbaimiao.mirai.entity.MiraiMessageTransmittable;
import com.xbaimiao.mirai.message.MessageSource;
import com.xbaimiao.mirai.message.component.BaseComponent;
import com.xbaimiao.mirai.message.component.impl.PlainText;
import dev.rgbmc.ultraqbot.hook.MiraiHttp;
import dev.rgbmc.ultraqbot.utils.MemberCache;

public class Action {
    public static void sendGroupMessage(Group group, BaseComponent component) {
        group.sendMessage(component);
    }

    public static void sendGroupMessage(long group, BaseComponent component) {
        getGroup(group).sendMessage(component);
    }

    public static void sendGroupMessage(Group group, String message) {
        group.sendMessage(message);
    }

    public static void sendGroupMessage(long group, String message) {
        getGroup(group).sendMessage(message);
    }

    public static Group getGroup(long id) {
        return MiraiHttp.bot.getGroup(id);
    }

    public static MemberFriend getMember(Group group, long id) {
        return MemberCache.getMemberFriend(group, id);
    }

    public static MemberFriend getMember(long group, long id) {
        return MemberCache.getMemberFriend(group, id);
    }

    public static Friend getFriend(long id) {
        return MiraiHttp.bot.getFriend(id);
    }

    public static void sendFriendMessage(Friend friend, BaseComponent component) {
        friend.sendMessage(component);
    }

    public static void sendFriendMessage(long id, BaseComponent component) {
        getFriend(id).sendMessage(component);
    }

    public static void sendFriendMessage(Friend friend, String message) {
        friend.sendMessage(new PlainText(message));
    }

    public static void sendFriendMessage(long id, String message) {
        getFriend(id).sendMessage(new PlainText(message));
    }

    public static PlainText toPlainText(String text) {
        return new PlainText(text);
    }

    public static void sendQuote(MiraiMessageTransmittable target, BaseComponent message, MessageSource source) {
        target.quoteMessage(message, String.valueOf(source.getMessageId()));
    }
}
