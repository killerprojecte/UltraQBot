package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MemberFriend;
import com.xbaimiao.mirai.event.MemberLeaveEventQuit;

public class MemberQuitLeaveEvent extends MemberLeaveEvent<MemberLeaveEventQuit> {
    private final MemberLeaveEventQuit origin;

    public MemberQuitLeaveEvent(MemberLeaveEventQuit origin) {
        super();
        this.origin = origin;
    }

    @Override
    public MemberFriend getMember() {
        return origin.getMember();
    }

    @Override
    public MemberLeaveEventQuit getOrigin() {
        return origin;
    }

    @Override
    public LeaveType getEventType() {
        return LeaveType.QUIT;
    }
}
