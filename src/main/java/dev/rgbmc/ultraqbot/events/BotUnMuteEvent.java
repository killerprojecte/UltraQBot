package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class BotUnMuteEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.BotUnMuteEvent origin;
    private final MemberFriend operator;
    private final Group group;



    public BotUnMuteEvent(com.xbaimiao.mirai.event.BotUnMuteEvent event) {
        this.origin = event;
        operator= event.getOperator();
        group= event.getGroup();
    }

    public com.xbaimiao.mirai.event.BotUnMuteEvent getOrigin() {
        return origin;
    }

    public MemberFriend getOperator() {
        return operator;
    }

    public Group getGroup() {
        return group;
    }
}
