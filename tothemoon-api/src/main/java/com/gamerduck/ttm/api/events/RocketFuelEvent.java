package com.gamerduck.ttm.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.gamerduck.ttm.api.enums.FuelType;
import com.gamerduck.ttm.api.objects.Rocket;

public class RocketFuelEvent extends Event implements Cancellable {

	Rocket rocket;
	FuelType fuel;
	Double fuelamount;
	Player fueler;
	boolean cancel;
	
	public RocketFuelEvent(Rocket rocket, FuelType fuel, Double fuelamount, Player fueler) {
		this.rocket = rocket;
		this.fuel = fuel;
		this.fuelamount = fuelamount;
		this.fueler = fueler;
	}
	
	public Rocket getRocket() {
		return rocket;
	}
	
	public FuelType getFuelType() {
		return fuel;
	}
	
	public Double getFuelAmount() {
		return fuelamount;
	}
	
	public Player getWhoFueled() {
		return fueler;
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
