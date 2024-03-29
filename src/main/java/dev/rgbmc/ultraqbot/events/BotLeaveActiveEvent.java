package dev.rgbmc.ultraqbot.events;


import com.xbaimiao.mirai.entity.Group;

public class BotLeaveActiveEvent extends UltraEvent {
    private final com.xbaimiao.mirai.event.BotLeaveEventActive origin;
    private final Group group;

    public BotLeaveActiveEvent(com.xbaimiao.mirai.event.BotLeaveEventActive event) {
        super();
        this.origin = event;
        this.group = event.getGroup();
    }

    public Group getGroup() {
        return group;
    }

    public com.xbaimiao.mirai.event.BotLeaveEventActive getOrigin() {
        return origin;
    }
}
