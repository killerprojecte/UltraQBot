package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import dev.rgbmc.ultraqbot.hook.MiraiHttp;
import dev.rgbmc.ultraqbot.utils.MemberCache;

import java.util.ArrayList;

public class BotInvitedJoinGroupRequestEvent extends UltraEvent {
    private final com.xbaimiao.mirai.event.BotInvitedJoinGroupRequestEvent origin;
    public BotInvitedJoinGroupRequestEvent(com.xbaimiao.mirai.event.BotInvitedJoinGroupRequestEvent origin) {
        super();
        this.origin = origin;
        MiraiHttp.bot.getGroups().thenAcceptAsync(groups -> {
            MiraiHttp.bot.setGroupCache(new ArrayList<>(groups));
        });
        MemberCache.refresh();
    }

    public Group getGroup() {
        return MiraiHttp.bot.getGroup(origin.getGroupId());
    }

    public String getMessage() {
        return origin.getMessage();
    }

    public long getInvitor() {
        return origin.getFromId();
    }

    public String getNick() {
        return origin.getNick();
    }

    public com.xbaimiao.mirai.event.BotInvitedJoinGroupRequestEvent getOrigin() {
        return origin;
    }
}
