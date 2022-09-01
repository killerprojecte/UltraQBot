package flyproject.ultraqbot.events;

import com.xbaimiao.mirai.entity.Friend;
import com.xbaimiao.mirai.message.component.BaseComponent;
import com.xbaimiao.mirai.message.component.impl.PlainText;

public class FriendMessageEvent extends UltraEvent{
    private final Friend friend;

    private final BaseComponent message;

    private final com.xbaimiao.mirai.event.FriendMessageEvent origin;

    public FriendMessageEvent(com.xbaimiao.mirai.event.FriendMessageEvent event){
        this.friend = event.getSender();
        this.message = event.getMessage();
        this.origin = event;
    }

    public Friend getFriend() {
        return friend;
    }

    public String getMessage() {
        return message.contentToString();
    }

    public void response(String text){
        friend.sendMessage(new PlainText(text));
    }

    public void response(BaseComponent message){
        friend.sendMessage(message);
    }

    public BaseComponent getRawMessage(){return message;}

    public com.xbaimiao.mirai.event.FriendMessageEvent getOrigin(){
        return origin;
    }
}
