package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;

public class GroupAllowConfessTalkEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.GroupAllowConfessTalkEvent origin;
    private final Group group;
    private final boolean current;
    private final boolean booleanOrigin;
    private final boolean byBot;

    public GroupAllowConfessTalkEvent(com.xbaimiao.mirai.event.GroupAllowConfessTalkEvent event) {
        super();
        this.origin = event;
        this.group=event.getGroup();
        this.current=event.getCurrent();
        this.booleanOrigin=event.getOrigin();
        this.byBot=event.getByBot();
    }

    public com.xbaimiao.mirai.event.GroupAllowConfessTalkEvent getOrigin() {
        return origin;
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

    public boolean isByBot() {
        return byBot;
    }
}
