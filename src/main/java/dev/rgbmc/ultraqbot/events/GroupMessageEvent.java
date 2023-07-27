package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;
import com.xbaimiao.mirai.message.component.BaseComponent;


public class GroupMessageEvent extends MessageEvent<com.xbaimiao.mirai.event.GroupMessageEvent> {

    private final Group group;
    private final com.xbaimiao.mirai.event.GroupMessageEvent origin;

    public GroupMessageEvent(com.xbaimiao.mirai.event.GroupMessageEvent event) {
        super(event);
        this.group = event.getGroup();
        this.origin = event;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public void response(String text) {
        group.sendMessage(text);
    }

    @Override
    public void response(BaseComponent message) {
        group.sendMessage(message);
    }

    @Override
    public void recall() {
        origin.recall();
    }

    @Override
    public MemberFriend getSender() {
        return origin.getSender();
    }
}
