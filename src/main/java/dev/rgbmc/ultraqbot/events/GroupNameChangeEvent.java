package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class GroupNameChangeEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.GroupNameChangeEvent origin;
    private final MemberFriend operator;
    private final Group group;
    private final String current;
    private final String stringOrigin;

    public GroupNameChangeEvent(com.xbaimiao.mirai.event.GroupNameChangeEvent event) {
        this.origin = event;
        this.group=event.getGroup();
        this.current=event.getCurrent();
        this.stringOrigin=event.getOrigin();
        this.operator=event.getOperator();
    }

    public com.xbaimiao.mirai.event.GroupNameChangeEvent getOrigin() {
        return origin;
    }

    public MemberFriend getOperator() {
        return operator;
    }

    public Group getGroup() {
        return group;
    }

    public String getCurrent() {
        return current;
    }

    public String getStringOrigin() {
        return stringOrigin;
    }
}
