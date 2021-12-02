package com.gamerduck.ttm.api.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.gamerduck.ttm.api.objects.PlayerRocket;

public class RocketBreakEvent extends Event implements Cancellable {

	PlayerRocket rocket;
	Location loc;
	Player breaker;
	boolean cancel;
	
	public RocketBreakEvent(PlayerRocket rocket, Location loc, Player breaker) {
		this.rocket = rocket;
		this.loc = loc;
		this.breaker = breaker;
	}
	
	public PlayerRocket getRocket() {
		return rocket;
	}
	
	public Location getLocation() {
		return loc;
	}
	
	public Player getWhoBroke() {
		return breaker;
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
