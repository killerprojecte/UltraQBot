package dev.rgbmc.ultraqbot.events;


import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UltraEvent extends Event {

    public UltraEvent() {
        super(true);
    }
    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
