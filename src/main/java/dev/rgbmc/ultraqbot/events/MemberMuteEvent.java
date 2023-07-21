package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MemberFriend;

public class MemberMuteEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.MemberMuteEvent origin;
    private final MemberFriend operator;
    private final MemberFriend member;
    private final int durationSeconds;

    public MemberMuteEvent(com.xbaimiao.mirai.event.MemberMuteEvent event) {
        super();
        this.origin = event;
        this.operator= event.getOperator();
        this.member= event.getMember();
        this.durationSeconds=event.getDurationSeconds();
    }

    public com.xbaimiao.mirai.event.MemberMuteEvent getOrigin() {
        return origin;
    }

    public MemberFriend getOperator() {
        return operator;
    }

    public MemberFriend getMember() {
        return member;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }
}
