package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class GroupAllowMemberInviteEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.GroupAllowMemberInviteEvent origin;
    private final MemberFriend operator;
    private final Group group;
    private final boolean current;
    private final boolean booleanOrigin;

    public GroupAllowMemberInviteEvent(com.xbaimiao.mirai.event.GroupAllowMemberInviteEvent event) {
        this.origin = event;
        this.group=event.getGroup();
        this.current=event.getCurrent();
        this.booleanOrigin=event.getOrigin();
        this.operator=event.getOperator();
    }

    public com.xbaimiao.mirai.event.GroupAllowMemberInviteEvent getOrigin() {
        return origin;
    }

    public MemberFriend getOperator() {
        return operator;
    }

    public Group getGroup() {
        return group;
    }

    public boolean isCurrent() {
        return current;
    }

    public boolean isBooleanOrigin() {
        return booleanOrigin;
    }
}
