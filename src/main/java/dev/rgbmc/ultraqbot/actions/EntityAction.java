package dev.rgbmc.ultraqbot.actions;

import com.xbaimiao.mirai.entity.Friend;
import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;
import dev.rgbmc.ultraqbot.hook.MiraiHttp;
import dev.rgbmc.ultraqbot.utils.MemberCache;

public class EntityAction {

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
}
