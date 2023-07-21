package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MiraiMessageTransmittable;
import com.xbaimiao.mirai.event.Cancellable;
import com.xbaimiao.mirai.message.MessageSource;
import com.xbaimiao.mirai.message.component.BaseComponent;

public class MessageEvent extends UltraEvent {
    private final com.xbaimiao.mirai.event.MessageEvent origin;
    private final BaseComponent message;
    private final MessageSource messageSource;
    private final MiraiMessageTransmittable sender;

    public MessageEvent(com.xbaimiao.mirai.event.MessageEvent event) {
        super();
        this.origin = event;
        this.message= event.getMessage();
        this.messageSource= event.getMessageSource();
        this.sender= event.getSender();
    }
    public void setCancelled(boolean b){
        this.origin.setCancelled(b);
    }
    public boolean getCancelled(){
        return this.origin.getCancelled();
    }
    public com.xbaimiao.mirai.event.MessageEvent getOrigin() {
        return origin;
    }

    public BaseComponent getMessage() {
        return message;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public MiraiMessageTransmittable getSender() {
        return sender;
    }
}
