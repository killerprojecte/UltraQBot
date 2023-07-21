package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class BotLeaveEventDisband extends UltraEvent{
    private final com.xbaimiao.mirai.event.BotLeaveEventDisband origin;
    private final MemberFriend operator;
    private final Group group;

    public BotLeaveEventDisband(com.xbaimiao.mirai.event.BotLeaveEventDisband event) {
        this.origin = event;
        this.operator= event.getOperator();
        this.group= event.getGroup();
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
