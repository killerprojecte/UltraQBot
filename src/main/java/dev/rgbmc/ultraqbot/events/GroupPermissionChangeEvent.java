package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;

public class GroupPermissionChangeEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.GroupPermissionChangeEvent origin;
    private final Group group;
    private final String current;
    private final String stringOrigin;

    public GroupPermissionChangeEvent(com.xbaimiao.mirai.event.GroupPermissionChangeEvent event) {
        super();
        this.origin = event;
        this.group=event.getGroup();
        this.current=event.getCurrent();
        this.stringOrigin=event.getOrigin();
    }

    public com.xbaimiao.mirai.event.GroupPermissionChangeEvent getOrigin() {
        return origin;
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
