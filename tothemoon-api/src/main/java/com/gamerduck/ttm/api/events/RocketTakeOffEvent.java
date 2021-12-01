package com.gamerduck.ttm.api.events;

import org.bukkit.Location;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.gamerduck.ttm.api.objects.Planet;
import com.gamerduck.ttm.api.objects.Rocket;

public class RocketTakeOffEvent extends Event implements Cancellable {

	Rocket rocket;
	Location oldloc;
	Location newloc;
	Planet oldplanet;
	Planet newplanet;
	boolean cancel;
	
	public RocketTakeOffEvent(Rocket rocket, Location oldloc, Location newloc, Planet oldplanet, Planet newplanet) {
		this.rocket = rocket;
		this.oldloc = oldloc;
		this.newloc = newloc;
		this.oldplanet = oldplanet;
		this.newplanet = newplanet;
	}
	
	public Rocket getRocket() {
		return rocket;
	}
	
	public Location getOldLocation() {
		return oldloc;
	}
	
	public Location getNewLocation() {
		return newloc;
	}
	
	public Planet getOldPlanet() {
		return oldplanet;
	}
	
	public Planet getNewPlanet() {
		return newplanet;
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
