package com.gamerduck.ttm.api.objects;

import org.bukkit.World;

import com.gamerduck.ttm.api.enums.PlanetTier;
import com.gamerduck.ttm.api.enums.PlanetType;

public class Planet {
	World world;
	PlanetType type;
	PlanetTier tier;
	public Planet(World world, PlanetType type, PlanetTier tier) {
		this.world = world;
		this.type = type;
		this.tier = tier;
	}
	public World getWorld() {return world;}
	public PlanetType getType() {return type;}
	public PlanetTier getTier() {return tier;}
}
