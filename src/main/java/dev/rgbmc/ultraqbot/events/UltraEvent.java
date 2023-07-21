package dev.rgbmc.ultraqbot.events;


import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UltraEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    public UltraEvent() {
        super(true);
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
