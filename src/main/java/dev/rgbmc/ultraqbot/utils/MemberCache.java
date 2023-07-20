package dev.rgbmc.ultraqbot.utils;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;
import dev.rgbmc.ultraqbot.hook.MiraiHttp;

import java.util.HashMap;
import java.util.Map;

public class MemberCache {
    public static Map<Long, Map<Long, MemberFriend>> members = new HashMap<>();

    public static void refresh() {
        members.clear();
        for (Group group : MiraiHttp.bot.getGroupCache()) {
            Map<Long, MemberFriend> groupCache = new HashMap<>();
            group.getMembers().thenAcceptAsync(members -> {
                for (MemberFriend memberFriend : members) {
                    groupCache.put(memberFriend.getId(), memberFriend);
                }
            });
            members.put(group.getId(), groupCache);
        }
    }

    public static MemberFriend getMemberFriend(Group group, long id) {
        return members.get(group.getId()).get(id);
    }

    public static MemberFriend getMemberFriend(long group, long id) {
        return members.get(group).get(id);
    }
}
