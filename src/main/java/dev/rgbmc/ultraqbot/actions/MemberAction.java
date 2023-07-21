package dev.rgbmc.ultraqbot.actions;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.entity.MemberFriend;
import com.xbaimiao.mirai.message.component.BaseComponent;

public class MemberAction extends TargetableAction {
    private final MemberFriend member;

    public MemberAction(MemberFriend member) {
        this.member = member;
    }

    @Override
    public void sendMessage(BaseComponent baseComponent) {
        member.sendMessage(baseComponent);
    }

    public MemberFriend getMember() {
        return member;
    }

    public Group getGroup() {
        return member.getGroup();
    }
}
