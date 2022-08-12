package flyproject.ultraqbot.events;


import flyproject.ultraqbot.UltraQBot;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UltraEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
