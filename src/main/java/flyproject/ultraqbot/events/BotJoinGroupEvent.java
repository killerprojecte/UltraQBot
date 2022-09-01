package flyproject.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;

public class BotJoinGroupEvent extends UltraEvent{
    private final com.xbaimiao.mirai.event.BotJoinGroupEvent origin;

    public BotJoinGroupEvent(com.xbaimiao.mirai.event.BotJoinGroupEvent event){
        this.origin = event;
    }

    public Group getGroup(){
        return origin.getGroup();
    }

    public MemberFriend getInvitor(){
        return origin.getInvitor();
    }

    public com.xbaimiao.mirai.event.BotJoinGroupEvent getOrigin() {
        return origin;
    }
}
