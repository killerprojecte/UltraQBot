package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.MemberFriend;

public class FriendRecallEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.FriendRecallEvent origin;
    private final MemberFriend operator;
    private final long authorId;
    private final int time;
    private final int messageId;

    public FriendRecallEvent(com.xbaimiao.mirai.event.FriendRecallEvent event) {
        this.origin = event;
        this.operator=event.getOperator();
        this.authorId= event.getAuthorId();
        this.time=event.getTime();
        this.messageId=event.getMessageId();
    }

    public com.xbaimiao.mirai.event.FriendRecallEvent getOrigin() {
        return origin;
    }

    public MemberFriend getOperator() {
        return operator;
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
