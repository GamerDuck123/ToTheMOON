package com.gamerduck.ttm.api.objects;

import java.util.UUID;

public class RocketID {
	UUID id;
	public RocketID(UUID id) {
		this.id = id;
	}
	public RocketID(String id) {
		this.id = UUID.fromString(id);
	}
	public RocketID() {
		this.id = UUID.randomUUID();
	}
	
	public UUID getID() {
		return id;
	}
}
