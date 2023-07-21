package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MemberFriend;

public class MemberUnMuteEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.MemberUnMuteEvent origin;
    private final MemberFriend operator;
    private final MemberFriend member;

    public MemberUnMuteEvent(com.xbaimiao.mirai.event.MemberUnMuteEvent event) {
        super();
        this.origin = event;
        this.operator= event.getOperator();
        this.member= event.getMember();
    }

    public com.xbaimiao.mirai.event.MemberUnMuteEvent getOrigin() {
        return origin;
    }

    public MemberFriend getOperator() {
        return operator;
    }

    public MemberFriend getMember() {
        return member;
    }
}
