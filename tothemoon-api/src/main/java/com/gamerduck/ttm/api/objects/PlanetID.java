package com.gamerduck.ttm.api.objects;

import java.util.UUID;

public class PlanetID {
	UUID id;
	public PlanetID(UUID id) {
		this.id = id;
	}
	public PlanetID(String id) {
		this.id = UUID.fromString(id);
	}
	public PlanetID() {
		this.id = UUID.randomUUID();
	}
	
	public UUID getID() {
		return id;
	}
}
