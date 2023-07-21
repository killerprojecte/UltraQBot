package dev.rgbmc.ultraqbot.actions;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.message.component.BaseComponent;

public class GroupAction extends TargetableAction {
    private final Group group;

    public GroupAction(Group group) {
        this.group = group;
    }

    @Override
    public void sendMessage(BaseComponent baseComponent) {
        group.sendMessage(baseComponent);
    }

    public Group getGroup() {
        return group;
    }
}
