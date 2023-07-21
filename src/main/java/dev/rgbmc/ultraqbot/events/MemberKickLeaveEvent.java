package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MemberFriend;
import com.xbaimiao.mirai.event.MemberLeaveEventKick;

public class MemberKickLeaveEvent extends MemberLeaveEvent<MemberLeaveEventKick> {
    private final MemberLeaveEventKick origin;

    public MemberKickLeaveEvent(MemberLeaveEventKick origin) {
        super();
        this.origin = origin;
    }

    @Override
    public MemberFriend getMember() {
        return origin.getMember();
    }

    public MemberFriend getOperator() {
        return origin.getOperator();
    }

    @Override
    public MemberLeaveEventKick getOrigin() {
        return origin;
    }

    @Override
    public LeaveType getEventType() {
        return LeaveType.KICK;
    }
}
