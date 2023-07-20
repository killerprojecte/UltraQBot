package dev.rgbmc.ultraqbot.events;

public class NewFriendRequestEvent extends UltraEvent {
    private final com.xbaimiao.mirai.event.NewFriendRequestEvent origin;

    public NewFriendRequestEvent(com.xbaimiao.mirai.event.NewFriendRequestEvent origin) {
        super();
        this.origin = origin;
    }

    public long getEventId() {
        return origin.getEventId();
    }

    public long getSender() {
        return origin.getFromId();
    }

    public long getGroup() {
        return origin.getGroupId();
    }

    public String getMessage() {
        return origin.getMessage();
    }

    public String getNick() {
        return origin.getNick();
    }

    public com.xbaimiao.mirai.event.NewFriendRequestEvent getOrigin() {
        return origin;
    }
}
