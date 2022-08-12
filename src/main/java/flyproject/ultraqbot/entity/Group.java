package flyproject.ultraqbot.entity;

import com.xbaimiao.mirai.entity.MemberFriend;
import com.xbaimiao.mirai.message.component.BaseComponent;
import flyproject.ultraqbot.utils.QPermission;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Group {
    private final String name;
    private final long id;
    private final QPermission permission;
    private final com.xbaimiao.mirai.entity.Group group;

    public Group(com.xbaimiao.mirai.entity.Group group){
        this.name = group.getName();
        this.id = group.getId();
        this.permission = QPermission.valueOf(group.getPermission().name());
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public QPermission getPermission() {
        return permission;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message){
        group.sendMessage(message);
    }

    public void sendMessage(BaseComponent message){
        group.sendMessage(message);
    }

    public void sendQuoteMessage(BaseComponent base,String quote){
        group.quoteMessage(base,quote);
    }

    public CompletableFuture<List<MemberFriend>> getMembers(){
        return group.getMembers();
    }
}
