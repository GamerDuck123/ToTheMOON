package com.gamerduck.ttm.storage;

import org.bukkit.configuration.file.FileConfiguration;

public class values {
	
	public static Boolean MYSQL_ENABLED, MYSQL_AUTORECONNECT;
	public static String MYSQL_HOST, MYSQL_DATABASE, MYSQL_USERNAME, MYSQL_PASSWORD;
	public static Integer MYSQL_PORT;
	
	private static FileConfiguration config;
	
	public static void load(FileConfiguration cf) {
		config = cf;
		MYSQL_ENABLED = getBoolean("MySQL.Enabled");
		MYSQL_AUTORECONNECT = getBoolean("MySQL.AutoReconnect");
		MYSQL_HOST = getString("MySQL.Host");
		MYSQL_DATABASE = getString("MySQL.Database");
		MYSQL_USERNAME = getString("MySQL.Username");
		MYSQL_PASSWORD = getString("MySQL.Password");
		MYSQL_PORT = getInteger("MySQL.Port");
	}
	
	private static String getString(String s) {return config.getString(s);}
	private static Boolean getBoolean(String s) {return config.getBoolean(s);}
	private static Integer getInteger(String s) {return config.getInt(s);}
//	private static Double getDouble(String s) {return config.getDouble(s);}
//	private static List<String> getStringList(String s) {return config.getStringList(s);}

}
