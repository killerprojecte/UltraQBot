package dev.rgbmc.ultraqbot.events;

import com.xbaimiao.mirai.entity.Group;
import com.xbaimiao.mirai.packet.impl.group.MemberJoinRequestResponsePacket;
import dev.rgbmc.ultraqbot.hook.MiraiHttp;
import dev.rgbmc.ultraqbot.utils.MemberCache;

import java.util.ArrayList;

public class MemberJoinRequestEvent extends UltraEvent {
    private final com.xbaimiao.mirai.event.MemberJoinRequestEvent origin;

    public MemberJoinRequestEvent(com.xbaimiao.mirai.event.MemberJoinRequestEvent origin) {
        super();
        this.origin = origin;
        MiraiHttp.bot.getGroups().thenAcceptAsync(groups -> {
            MiraiHttp.bot.setGroupCache(new ArrayList<>(groups));
        });
        MemberCache.refresh();
    }

    public String getMessage() {
        return origin.getMessage();
    }

    public String getNick() {
        return origin.getNick();
    }

    public Group getGroup() {
        return MiraiHttp.bot.getGroup(origin.getGroupId());
    }

    public long getMemberId() {
        return origin.getFromId();
    }

    public com.xbaimiao.mirai.event.MemberJoinRequestEvent getOrigin() {
        return origin;
    }

    public void accept(String response) {
        operate(response, MemberJoinRequestResponsePacket.Operate.ACCEPT);
    }

    public void deny(String response) {
        deny(response, false);
    }

    public void deny(String response, boolean block) {
        if (block) {
            operate(response, MemberJoinRequestResponsePacket.Operate.DENY_AND_BLOCK);
        } else {
            operate(response, MemberJoinRequestResponsePacket.Operate.DENY);
        }
    }

    public void ignore(String response) {
        ignore(response, false);
    }

    public void ignore(String response, boolean block) {
        if (block) {
            operate(response, MemberJoinRequestResponsePacket.Operate.IGNORE_AND_BLOCK);
        } else {
            operate(response, MemberJoinRequestResponsePacket.Operate.IGNORE);
        }
    }

    public void operate(String response, MemberJoinRequestResponsePacket.Operate operate) {
        new MemberJoinRequestResponsePacket(origin, response, operate).send().thenAcceptAsync(packet -> {
        });
    }
}
