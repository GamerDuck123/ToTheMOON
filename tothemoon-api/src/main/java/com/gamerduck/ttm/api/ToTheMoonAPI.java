package com.gamerduck.ttm.api;

import org.bukkit.plugin.Plugin;

public class ToTheMoonAPI {
	static ToTheMoonAPI instance;
	Plugin plug;
	public ToTheMoonAPI(Plugin plug) {
		instance = this;
		this.plug = plug;
	}
	public static ToTheMoonAPI instance() {return instance;}
	public Plugin getPlugin() {return plug;}
}
