package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;
import dev.rgbmc.ultraqbot.hook.MiraiHttp;
import dev.rgbmc.ultraqbot.utils.MemberCache;

import java.util.ArrayList;

public class BotJoinGroupEvent extends UltraEvent {
    private final com.xbaimiao.mirai.event.BotJoinGroupEvent origin;

    public BotJoinGroupEvent(com.xbaimiao.mirai.event.BotJoinGroupEvent event) {
        super();
        this.origin = event;
        MiraiHttp.bot.getGroups().thenAcceptAsync(groups -> {
            MiraiHttp.bot.setGroupCache(new ArrayList<>(groups));
        });
        MemberCache.refresh();
    }

    public Group getGroup() {
        return origin.getGroup();
    }

    public MemberFriend getInvitor() {
        return origin.getInvitor();
    }

    public com.xbaimiao.mirai.event.BotJoinGroupEvent getOrigin() {
        return origin;
    }
}
