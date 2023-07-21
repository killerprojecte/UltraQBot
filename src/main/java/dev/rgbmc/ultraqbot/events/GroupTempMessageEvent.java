package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class GroupTempMessageEvent extends MessageEvent<com.xbaimiao.mirai.event.GroupTempMessageEvent> {
    private final MemberFriend friend;

    private final com.xbaimiao.mirai.event.GroupTempMessageEvent origin;

    public GroupTempMessageEvent(com.xbaimiao.mirai.event.GroupTempMessageEvent event) {
        super(event);
        this.friend = event.getSender();
        this.origin = event;
    }

    @Override
    public MemberFriend getSender() {
        return friend;
    }

    public Group getGroup() {
        return origin.getGroup();
    }
}
