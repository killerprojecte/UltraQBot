package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MessageSubject;

public class NudgeEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.NudgeEvent origin;
    private final String action ;
    private final long fromId ;
    private final MessageSubject subject ;
    private final long target ;
    private final String suffix ;


    public NudgeEvent(com.xbaimiao.mirai.event.NudgeEvent event) {
        super();
        this.origin = event;
        this.action = event.getAction();
        this.fromId = event.getFromId();
        this.subject = event.getSubject();
        this.target = event.getTarget();
        this.suffix = event.getSuffix();
    }

    public com.xbaimiao.mirai.event.NudgeEvent getOrigin() {
        return origin;
    }

    public String getAction() {
        return action;
    }

    public long getFromId() {
        return fromId;
    }

    public MessageSubject getSubject() {
        return subject;
    }

    public long getTarget() {
        return target;
    }

    public String getSuffix() {
        return suffix;
    }
}
