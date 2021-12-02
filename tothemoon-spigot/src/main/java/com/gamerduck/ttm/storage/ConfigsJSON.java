package com.gamerduck.ttm.storage;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import com.gamerduck.ttm.api.enums.PlanetTier;
import com.gamerduck.ttm.api.enums.PlanetType;
import com.gamerduck.ttm.api.enums.RocketTier;
import com.gamerduck.ttm.api.enums.RocketType;
import com.gamerduck.ttm.api.objects.Planet;
import com.gamerduck.ttm.api.objects.Rocket;

public class ConfigsJSON {
	Plugin pl;
	private File ion_rocket;
	private File liquid_fuel_rocket;
	private File plasma_rocket;
	private File solid_fuel_rocket;
	private File rocket_folder;
	private File earth_planet;
	private File mars_planet;
	private File planet_folder;
	
	public ConfigsJSON(Plugin pl) {
		String sep = File.separator;
		this.pl = pl;
		if (!pl.getDataFolder().exists()) pl.getDataFolder().mkdirs();
		
		rocket_folder = new File(pl.getDataFolder() + sep + "rockets");
		if (!rocket_folder.exists()) {
			rocket_folder.mkdirs();
			loadDefaultRockets();
		}
		
		for (File rocket : rocket_folder.listFiles()) {
			Rocket l = new Rocket(RocketType.ION_ROCKET, RocketTier.ONE, 100.0);
		}
		
		planet_folder = new File(pl.getDataFolder() + sep + "planets");
		if (!planet_folder.exists()) {
			planet_folder.mkdirs();	
			loadDefaultPlanets();
		}
		
		for (File planet : planet_folder.listFiles()) {
			Planet pla = new Planet(Bukkit.getWorld(""), PlanetType.CUSTOM, PlanetTier.ONE);
		}
	}
	
	private void loadDefaultRockets() {
		ion_rocket = new File("rockets/ion_rocket.json");
		if (!ion_rocket.exists()) pl.saveResource("rockets/ion_rocket.json", false);
		
		liquid_fuel_rocket = new File("rockets/liquid_fuel_rocket.json");
		if (!liquid_fuel_rocket.exists()) pl.saveResource("rockets/liquid_fuel_rocket.json", false);
		
		plasma_rocket = new File("rockets/plasma_rocket.json");
		if (!plasma_rocket.exists()) pl.saveResource("rockets/plasma_rocket.json", false);
		
		solid_fuel_rocket = new File("rockets/solid_fuel_rocket.json");
		if (!solid_fuel_rocket.exists()) pl.saveResource("rockets/solid_fuel_rocket.json", false);
	}
	
	private void loadDefaultPlanets() {
		earth_planet = new File("planets/earth.json");
		if (!earth_planet.exists()) pl.saveResource("planets/earth.json", false);
		
		mars_planet = new File("planets/mars.json");
		if (!mars_planet.exists()) pl.saveResource("planets/mars.json", false);
	}
}
