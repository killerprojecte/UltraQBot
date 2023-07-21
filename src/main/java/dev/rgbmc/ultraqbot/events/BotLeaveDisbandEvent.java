package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class BotLeaveDisbandEvent extends UltraEvent {
    private final com.xbaimiao.mirai.event.BotLeaveEventDisband origin;
    private final MemberFriend operator;
    private final Group group;

    public BotLeaveDisbandEvent(com.xbaimiao.mirai.event.BotLeaveEventDisband event) {
        super();
        this.origin = event;
        this.operator = event.getOperator();
        this.group = event.getGroup();
    }


    public Group getGroup() {
        return group;
    }

    public com.xbaimiao.mirai.event.BotLeaveEventDisband getOrigin() {
        return origin;
    }

    public MemberFriend getOperator() {
        return operator;
    }
}
