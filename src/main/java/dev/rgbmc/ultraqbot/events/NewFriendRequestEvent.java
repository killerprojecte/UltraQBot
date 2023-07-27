package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.packet.impl.group.NewFriendRequestResponsePacket;

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

    public void accept(String response) {
        operate(response, NewFriendRequestResponsePacket.Operate.ACCEPT);
    }

    public void deny(String response) {
        deny(response, false);
    }

    public void deny(String response, boolean block) {
        if (block) {
            operate(response, NewFriendRequestResponsePacket.Operate.DENY_AND_BLOCK);
        } else {
            operate(response, NewFriendRequestResponsePacket.Operate.DENY);
        }
    }

    public void operate(String response, NewFriendRequestResponsePacket.Operate operate) {
        new NewFriendRequestResponsePacket(origin, response, operate).send().thenAcceptAsync(packet -> {
        });
    }
}
