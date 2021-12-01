package com.gamerduck.ttm.storage;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.bukkit.plugin.Plugin;

public class Database {
	 private Connection connection;

	    public Database(Plugin main) throws Exception {
	        Class.forName("org.sqlite.JDBC").newInstance();
	        connection = DriverManager.getConnection("jdbc:sqlite:" + new File(main.getDataFolder(), "database.db"));
	        
	        createTable("CREATE TABLE IF NOT EXISTS playerdata (UUID VARCHAR(36) UNIQUE);");
	        createTable("CREATE TABLE IF NOT EXISTS rocketdata (UUID VARCHAR(36) UNIQUE);");
	    }

	    public Database(Plugin main, boolean reconnect, String host, String database, String username, String password, int port) throws Exception {
	        Properties info = new Properties();
	        info.setProperty("useSSL", "true");

	        if (reconnect) {
	            info.setProperty("autoReconnect", "true");
	        }
	        info.setProperty("trustServerCertificate", "true");
	        info.setProperty("user", username);
	        info.setProperty("password", password);

	        Class.forName("com.mysql.jdbc.Driver").newInstance();
	        connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, info);

	        createTable("CREATE TABLE IF NOT EXISTS playerdata (UUID VARCHAR(36) UNIQUE);");
	        createTable("CREATE TABLE IF NOT EXISTS rocketdata (UUID VARCHAR(36) UNIQUE);");
	    }

	    public void createTable(String sqlURL) throws SQLException {
	        try (PreparedStatement statement = connection.prepareStatement(sqlURL)) {
	            statement.executeUpdate();
	        }
	    }
	    
	    public Connection connection() {return connection;}
	    
	    public void close() {
	        try {
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	    public boolean hasData(String UUID, String table) {
	    	try (PreparedStatement select = connection.prepareStatement("SELECT UUID FROM " + table + " WHERE UUID = ?")) {
	            select.setString(1, UUID);
	            try (ResultSet result = select.executeQuery()) {
	                return result.next();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false;
	    } 
}
