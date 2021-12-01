package com.gamerduck.ttm;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.gamerduck.ttm.api.ToTheMoonAPI;
import com.gamerduck.ttm.storage.ConfigYAML;
import com.gamerduck.ttm.storage.Database;
import com.gamerduck.ttm.storage.values;

public class ToTheMoonMain extends JavaPlugin {
	ToTheMoonAPI api;
	static ToTheMoonMain instance;
    ConfigYAML configyaml;
	FileConfiguration config;
	Database db;
	@Override
	public void onEnable() {
		instance = this;
		api = new ToTheMoonAPI(this);
		configyaml = new ConfigYAML(this);
		config = configyaml.getConfig();
		values.load(config);
		if (values.MYSQL_ENABLED) {
			try {db = new Database(this, 
					values.MYSQL_AUTORECONNECT,
					values.MYSQL_HOST,
					values.MYSQL_DATABASE,
					values.MYSQL_USERNAME,
					values.MYSQL_PASSWORD,
					values.MYSQL_PORT);
			} catch (Exception e) {e.printStackTrace();}
		} else {
			try {db = new Database(this);
			} catch (Exception e) {e.printStackTrace();}
		}
	}
	public ToTheMoonMain instance() {return instance;}
	public ToTheMoonAPI	api() {return api;}
	public FileConfiguration getConfig() {return config;}
	public void reloadConfig() {configyaml.reloadConfig();}
	public void saveConfig() {configyaml.saveConfig();}
	public Database getDatabase() {return db;}
}
