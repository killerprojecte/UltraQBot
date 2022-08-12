package flyproject.ultraqbot.events;

import com.xbaimiao.mirai.message.component.BaseComponent;
import flyproject.ultraqbot.entity.Group;

public class GroupMessageEvent extends UltraEvent {

    private final Group group;

    private final BaseComponent message;

    public GroupMessageEvent(Group group, BaseComponent message){
        this.group = group;
        this.message = message;
    }

    public Group getGroup() {
        return group;
    }

    public String getMessage() {
        return message.contentToString();
    }

    public void response(String text){
        group.sendMessage(text);
    }

    public BaseComponent getRawMessage(){return message;}
}
