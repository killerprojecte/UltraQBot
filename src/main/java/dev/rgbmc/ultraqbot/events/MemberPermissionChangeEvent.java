package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MemberFriend;

public class MemberPermissionChangeEvent extends UltraEvent {
    private final com.xbaimiao.mirai.event.MemberPermissionChangeEvent origin;
    private final MemberFriend member;
    private final String current;
    private final String stringOrigin;

    public MemberPermissionChangeEvent(com.xbaimiao.mirai.event.MemberPermissionChangeEvent event) {
        super();
        this.origin = event;
        this.member = event.getMember();
        this.current = event.getCurrent();
        this.stringOrigin = event.getOrigin();
    }
}
