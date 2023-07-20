package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MemberFriend;
import com.xbaimiao.mirai.event.MemberLeaveEventKick;
import dev.rgbmc.ultraqbot.utils.MemberCache;

public class MemberKickLeaveEvent extends UltraEvent {
    private final MemberLeaveEventKick origin;
    public MemberKickLeaveEvent(MemberLeaveEventKick origin) {
        super();
        this.origin = origin;
        MemberCache.refresh();
    }

    public MemberFriend getMember() {
        return origin.getMember();
    }

    public MemberFriend getOperator() {
        return origin.getOperator();
    }

    public MemberLeaveEventKick getOrigin() {
        return origin;
    }
}
