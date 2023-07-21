package dev.rgbmc.ultraqbot.actions;

import com.xbaimiao.mirai.entity.Friend;
import com.xbaimiao.mirai.message.component.BaseComponent;

public class FriendAction extends TargetableAction {
    private final Friend friend;

    public FriendAction(Friend friend) {
        this.friend = friend;
    }

    @Override
    public void sendMessage(BaseComponent baseComponent) {
        friend.sendMessage(baseComponent);
    }

    public Friend getFriend() {
        return friend;
    }
}
