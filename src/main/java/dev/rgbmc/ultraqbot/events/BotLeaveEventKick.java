package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class BotLeaveEventKick extends UltraEvent{
    private final com.xbaimiao.mirai.event.BotLeaveEventKick origin;
    private final MemberFriend operator;
    private final Group group;

    public BotLeaveEventKick(com.xbaimiao.mirai.event.BotLeaveEventKick event) {
        this.origin = event;
        operator= event.getOperator();
        group= event.getGroup();
    }

    public com.xbaimiao.mirai.event.BotLeaveEventKick getOrigin() {
        return origin;
    }

    public Group getGroup() {
        return group;
    }

    public MemberFriend getOperator() {
        return operator;
    }
}
