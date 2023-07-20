package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Friend;
import com.xbaimiao.mirai.message.MessageSource;
import com.xbaimiao.mirai.message.component.BaseComponent;
import com.xbaimiao.mirai.message.component.impl.PlainText;
import com.xbaimiao.mirai.packet.impl.group.MessageRecallPacket;

public class FriendMessageEvent extends UltraEvent {
    private final Friend friend;

    private final BaseComponent message;

    private final com.xbaimiao.mirai.event.FriendMessageEvent origin;

    public FriendMessageEvent(com.xbaimiao.mirai.event.FriendMessageEvent event) {
        super();
        this.friend = event.getSender();
        this.message = event.getMessage();
        this.origin = event;
    }

    public Friend getSender() {
        return friend;
    }

    public MessageSource getMessageSource() {
        return origin.getMessageSource();
    }

    public String getMessage() {
        return message.contentToString();
    }

    public void response(String text) {
        friend.sendMessage(new PlainText(text));
    }

    public void response(BaseComponent message) {
        friend.sendMessage(message);
    }

    public void recall() {
        MessageRecallPacket packet = new MessageRecallPacket(origin.getSender().getId(), origin.getMessageSource().getMessageId());
        packet.send().thenAcceptAsync(messageRecallPacket -> {});
    }

    public BaseComponent getRawMessage() {
        return message;
    }

    public com.xbaimiao.mirai.event.FriendMessageEvent getOrigin() {
        return origin;
    }
}
