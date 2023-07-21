package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import dev.rgbmc.ultraqbot.hook.MiraiHttp;
import dev.rgbmc.ultraqbot.utils.MemberCache;

import java.util.ArrayList;

public class MemberJoinRequestEvent extends UltraEvent {
    private final com.xbaimiao.mirai.event.MemberJoinRequestEvent origin;

    public MemberJoinRequestEvent(com.xbaimiao.mirai.event.MemberJoinRequestEvent origin) {
        super();
        this.origin = origin;
        MiraiHttp.bot.getGroups().thenAcceptAsync(groups -> {
            MiraiHttp.bot.setGroupCache(new ArrayList<>(groups));
        });
        MemberCache.refresh();
    }

    public String getMessage() {
        return origin.getMessage();
    }

    public String getNick() {
        return origin.getNick();
    }

    public Group getGroup() {
        return MiraiHttp.bot.getGroup(origin.getGroupId());
    }

    public long getMemberId() {
        return origin.getFromId();
    }

    public com.xbaimiao.mirai.event.MemberJoinRequestEvent getOrigin() {
        return origin;
    }
}
