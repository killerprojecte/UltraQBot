package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MemberFriend;
import com.xbaimiao.mirai.event.MemberLeaveEventQuit;
import dev.rgbmc.ultraqbot.utils.MemberCache;

public class MemberQuitLeaveEvent extends UltraEvent {
    private final MemberLeaveEventQuit origin;
    public MemberQuitLeaveEvent(MemberLeaveEventQuit origin) {
        super();
        this.origin = origin;
        MemberCache.refresh();
    }

    public MemberFriend getMember() {
        return origin.getMember();
    }

    public MemberLeaveEventQuit getOrigin() {
        return origin;
    }
}
