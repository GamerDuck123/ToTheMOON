package com.gamerduck.ttm.api.objects;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class PlayerRocket {
	Player owner;
	ArrayList<Player> passengers;
	RocketID id;
	Location loc;
	Rocket rocket;
	public PlayerRocket(Player owner, ArrayList<Player> passengers, RocketID id, Location loc, Rocket rocket) {
		this.owner = owner;
		this.passengers = passengers;
		this.id = id;
		this.loc = loc;
		this.rocket = rocket;
	} 
	public Player getOwner() {return owner;}
	public ArrayList<Player> getPassengers() {return passengers;}
	public RocketID getRocketID() {return id;}
	public Rocket getRocket() {return rocket;}
}
