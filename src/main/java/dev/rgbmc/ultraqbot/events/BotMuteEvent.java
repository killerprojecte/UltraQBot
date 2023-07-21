package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class BotMuteEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.BotMuteEvent origin;
    private final MemberFriend operator;
    private final Group group;
    private final int durationSeconds;

    public BotMuteEvent(com.xbaimiao.mirai.event.BotMuteEvent event) {
        this.origin = event;
        this.operator= event.getOperator();
        this.group= event.getGroup();
        this.durationSeconds=event.getDurationSeconds();
    }

    public com.xbaimiao.mirai.event.BotMuteEvent getOrigin() {
        return origin;
    }

    public MemberFriend getOperator() {
        return operator;
    }

    public Group getGroup() {
        return group;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }
}
