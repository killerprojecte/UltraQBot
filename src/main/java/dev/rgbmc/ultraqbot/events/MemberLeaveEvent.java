package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MemberFriend;
import dev.rgbmc.ultraqbot.utils.MemberCache;

public abstract class MemberLeaveEvent<T> extends UltraEvent {

    public MemberLeaveEvent() {
        super();
        MemberCache.refresh();
    }

    public abstract MemberFriend getMember();

    public abstract T getOrigin();

    public abstract LeaveType getEventType();

    enum LeaveType {
        KICK,
        QUIT
    }
}
