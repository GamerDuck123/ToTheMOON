package com.gamerduck.ttm.api.objects;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.gamerduck.ttm.api.enums.FuelType;
import com.gamerduck.ttm.api.enums.RocketTier;
import com.gamerduck.ttm.api.enums.RocketType;

public class Rocket {
	Player owner;
	ArrayList<Player> passengers;
	RocketID id;
	Location loc;
	RocketType type;
	RocketTier tier;
	public Rocket(RocketType type, RocketTier tier, double maxfuel) {
		this.type = type;
		this.tier = tier;
	} 
	public Player getOwner() {return owner;}
	public ArrayList<Player> getPassengers() {return passengers;}
	public RocketID getRocketID() {return id;}
	public FuelType getFuelType() {return type.getFuelType();}
	public RocketType getType() {return type;}
	public RocketTier getTier() {return tier;}
}
