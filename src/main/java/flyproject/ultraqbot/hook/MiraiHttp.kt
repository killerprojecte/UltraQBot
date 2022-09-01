package flyproject.ultraqbot.hook;

import com.xbaimiao.mirai.event.FriendMessageEvent;
import com.xbaimiao.mirai.event.GroupMessageEvent;
import com.xbaimiao.mirai.eventbus.SubscribeHandler;
import com.xbaimiao.mirai.eventbus.SubscribeListener;
import com.xbaimiao.mirai.packet.impl.websocket.WebSocketBot;
import com.xbaimiao.mirai.packet.impl.websocket.WsInfo;
import flyproject.ultraqbot.entity.Group;
import org.bukkit.Bukkit;

public class MiraiHttp {
    public static void run(){
        WsInfo wsInfo = new WsInfo("http://127.0.0.1:8099/", 123456789, "AccessKey");
        WebSocketBot bot = new WebSocketBot(wsInfo).connect();
        bot.join();
        bot.getEventChancel().subscribe(new SubscribeListener() {
            @SubscribeHandler
            public void onGroup(GroupMessageEvent event){
                Bukkit.getPluginManager().callEvent(new flyproject.ultraqbot.events.GroupMessageEvent(new Group(event.getGroup()),event.getMessage()));
            }

            @SubscribeHandler
            public void onPrivate(FriendMessageEvent event){

            }
        });
    }
}
