package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;
import dev.rgbmc.ultraqbot.hook.MiraiHttp;
import dev.rgbmc.ultraqbot.utils.MemberCache;

import java.util.ArrayList;

public class MemberJoinEvent extends UltraEvent {
    private final com.xbaimiao.mirai.event.MemberJoinEvent origin;
    public MemberJoinEvent(com.xbaimiao.mirai.event.MemberJoinEvent origin) {
        super();
        this.origin = origin;
        MiraiHttp.bot.getGroups().thenAcceptAsync(groups -> {
            MiraiHttp.bot.setGroupCache(new ArrayList<>(groups));
        });
        MemberCache.refresh();
    }

    public MemberFriend getMember() {
        return origin.getMember();
    }

    public Group getGroup() {
        return origin.getGroup();
    }

    public MemberFriend getInvitor() {
        return origin.getInvitor();
    }

    public com.xbaimiao.mirai.event.MemberJoinEvent getOrigin() {
        return origin;
    }
}
