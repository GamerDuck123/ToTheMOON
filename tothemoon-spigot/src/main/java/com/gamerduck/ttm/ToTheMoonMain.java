package com.gamerduck.ttm;

import org.bukkit.plugin.java.JavaPlugin;

import com.gamerduck.ttm.api.ToTheMoonAPI;

public class ToTheMoonMain extends JavaPlugin {
	ToTheMoonAPI api;
	static ToTheMoonMain instance;
	@Override
	public void onEnable() {
		instance = this;
		api = new ToTheMoonAPI(this);
	}
	public ToTheMoonMain instance() {return instance;}
	public ToTheMoonAPI	api() {return api;}
}
