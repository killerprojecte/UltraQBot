package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MiraiMessageTransmittable;
import com.xbaimiao.mirai.message.MessageSource;
import com.xbaimiao.mirai.message.component.BaseComponent;
import com.xbaimiao.mirai.message.component.impl.PlainText;
import com.xbaimiao.mirai.packet.impl.group.MessageRecallPacket;

public abstract class MessageEvent<T extends com.xbaimiao.mirai.event.MessageEvent> extends UltraEvent {
    private final T origin;
    private final BaseComponent message;
    private final MessageSource messageSource;
    private final MiraiMessageTransmittable sender;

    public MessageEvent(T event) {
        super();
        this.origin = event;
        this.message = event.getMessage();
        this.messageSource = event.getMessageSource();
        this.sender = event.getSender();
    }

    public boolean getCancelled() {
        return this.origin.getCancelled();
    }

    public void setCancelled(boolean b) {
        this.origin.setCancelled(b);
    }

    public T getOrigin() {
        return origin;
    }

    public BaseComponent getRawMessage() {
        return message;
    }

    public String getMessage() {
        return message.contentToString();
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public MiraiMessageTransmittable getSender() {
        return sender;
    }

    public void response(String text) {
        sender.sendMessage(new PlainText(text));
    }

    public void response(BaseComponent message) {
        sender.sendMessage(message);
    }

    public void recall() {
        MessageRecallPacket packet = new MessageRecallPacket(origin.getSender().getId(), origin.getMessageSource().getMessageId());
        packet.send().thenAcceptAsync(messageRecallPacket -> {
        });
    }
}
