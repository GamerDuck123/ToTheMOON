package com.gamerduck.ttm.api.events;

import org.bukkit.Location;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.gamerduck.ttm.api.objects.Planet;
import com.gamerduck.ttm.api.objects.PlayerRocket;

public class RocketLandEvent extends Event implements Cancellable {

	PlayerRocket rocket;
	Location loc;
	Planet planet;
	boolean cancel;
	
	public RocketLandEvent(PlayerRocket rocket, Location loc, Planet planet) {
		this.rocket = rocket;
		this.loc = loc;
		this.planet = planet;
	}
	
	public PlayerRocket getRocket() {
		return rocket;
	}
	
	public Location getLocation() {
		return loc;
	}
	
	public Planet getPlanet() {
		return planet;
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
