package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class GroupEntranceAnnouncementChangeEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.GroupEntranceAnnouncementChangeEvent origin;
    private final MemberFriend operator;
    private final Group group;
    private final String current;
    private final String stringOrigin;

    public GroupEntranceAnnouncementChangeEvent(com.xbaimiao.mirai.event.GroupEntranceAnnouncementChangeEvent event) {
        this.origin = event;
        this.group=event.getGroup();
        this.current=event.getCurrent();
        this.stringOrigin=event.getOrigin();
        this.operator=event.getOperator();
    }

    public com.xbaimiao.mirai.event.GroupEntranceAnnouncementChangeEvent getOrigin() {
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
