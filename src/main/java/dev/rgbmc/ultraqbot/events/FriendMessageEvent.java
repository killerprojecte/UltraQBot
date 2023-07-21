package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Friend;

public class FriendMessageEvent extends MessageEvent<com.xbaimiao.mirai.event.FriendMessageEvent> {
    private final Friend friend;

    public FriendMessageEvent(com.xbaimiao.mirai.event.FriendMessageEvent event) {
        super(event);
        friend = event.getSender();
    }

    @Override
    public Friend getSender() {
        return friend;
    }
}
