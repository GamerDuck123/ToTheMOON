package com.gamerduck.ttm.api.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.gamerduck.ttm.api.objects.Rocket;

public class RocketPlaceEvent extends Event implements Cancellable {

	Rocket rocket;
	Location loc;
	Player placer;
	boolean cancel;
	
	public RocketPlaceEvent(Rocket rocket, Location loc, Player placer) {
		this.rocket = rocket;
		this.loc = loc;
		this.placer = placer;
	}
	
	public Rocket getRocket() {
		return rocket;
	}
	
	public Location getLocation() {
		return loc;
	}
	
	public Player getWhoPlaced() {
		return placer;
	}
	
	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

    private static final HandlerList handlers = new HandlerList();

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
