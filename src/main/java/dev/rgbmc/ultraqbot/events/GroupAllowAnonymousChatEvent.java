package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class GroupAllowAnonymousChatEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.GroupAllowAnonymousChatEvent origin;
    private final MemberFriend operator;
    private final Group group;
    private final boolean current;
    private final boolean booleanOrigin;

    public GroupAllowAnonymousChatEvent(com.xbaimiao.mirai.event.GroupAllowAnonymousChatEvent event) {
        this.origin = event;
        this.operator= event.getOperator();
        this.group= event.getGroup();
        this.current= event.getCurrent();
        this.booleanOrigin= event.getOrigin();
    }

    public com.xbaimiao.mirai.event.GroupAllowAnonymousChatEvent getOrigin() {
        return origin;
    }

    public MemberFriend getOperator() {
        return operator;
    }

    public Group getGroup() {
        return group;
    }

    public boolean isCurrent() {
        return current;
    }

    public boolean isBooleanOrigin() {
        return booleanOrigin;
    }
}
