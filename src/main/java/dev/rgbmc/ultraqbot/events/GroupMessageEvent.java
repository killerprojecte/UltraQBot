package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;
import com.xbaimiao.mirai.message.MessageSource;
import com.xbaimiao.mirai.message.component.BaseComponent;
import com.xbaimiao.mirai.packet.impl.group.MessageRecallPacket;
import dev.rgbmc.ultraqbot.hook.MiraiHttp;

import java.util.concurrent.CompletableFuture;

public class GroupMessageEvent extends UltraEvent {

    private final Group group;

    private final BaseComponent message;

    private final com.xbaimiao.mirai.event.GroupMessageEvent origin;

    public GroupMessageEvent(com.xbaimiao.mirai.event.GroupMessageEvent event) {
        super();
        this.group = event.getGroup();
        this.message = event.getMessage();
        this.origin = event;
    }

    public Group getGroup() {
        return group;
    }

    public String getMessage() {
        return message.contentToString();
    }

    public void response(String text) {
        group.sendMessage(text);
    }

    public void response(BaseComponent message) {
        group.sendMessage(message);
    }

    public void recall() {
        MessageRecallPacket packet = new MessageRecallPacket(getSender().getId(), origin.getMessageSource().getMessageId());
        packet.send().thenAcceptAsync(messageRecallPacket -> {});
    }

    public MessageSource getMessageSource() {
        return origin.getMessageSource();
    }

    public BaseComponent getRawMessage() {
        return message;
    }

    public MemberFriend getSender() {
        return origin.getSender();
    }

    public com.xbaimiao.mirai.event.GroupMessageEvent getOrigin() {
        return origin;
    }
}
