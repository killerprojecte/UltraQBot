package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;
import com.xbaimiao.mirai.message.MessageSource;
import com.xbaimiao.mirai.message.component.BaseComponent;
import com.xbaimiao.mirai.message.component.impl.PlainText;
import com.xbaimiao.mirai.packet.impl.group.MessageRecallPacket;

public class GroupTempMessageEvent extends UltraEvent {
    private final MemberFriend friend;

    private final BaseComponent message;

    private final com.xbaimiao.mirai.event.GroupTempMessageEvent origin;

    public GroupTempMessageEvent(com.xbaimiao.mirai.event.GroupTempMessageEvent event) {
        super();
        this.friend = event.getSender();
        this.message = event.getMessage();
        this.origin = event;
    }

    public MemberFriend getSender() {
        return friend;
    }

    public Group getGroup() {
        return origin.getGroup();
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

    public com.xbaimiao.mirai.event.GroupTempMessageEvent getOrigin() {
        return origin;
    }
}
