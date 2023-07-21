package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class GroupRecallEvent extends UltraEvent {
    private final com.xbaimiao.mirai.event.GroupRecallEvent origin;
    private final MemberFriend operator;
    private final Group group;
    private final long authorId;
    private final int time;
    private final int messageId;

    public GroupRecallEvent(com.xbaimiao.mirai.event.GroupRecallEvent event) {
        super();
        this.origin = event;
        this.operator = event.getOperator();
        this.authorId = event.getAuthorId();
        this.time = event.getTime();
        this.messageId = event.getMessageId();
        this.group = event.getGroup();
    }

    public com.xbaimiao.mirai.event.GroupRecallEvent getOrigin() {
        return origin;
    }

    public MemberFriend getOperator() {
        return operator;
    }

    public Group getGroup() {
        return group;
    }

    public long getAuthorId() {
        return authorId;
    }

    public int getTime() {
        return time;
    }

    public int getMessageId() {
        return messageId;
    }
}
