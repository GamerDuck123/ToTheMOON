package com.gamerduck.ttm.api.enums;

public enum RocketType {
	SOLID_FUELED(FuelType.SOLID),
	LIQUID_FUELED(FuelType.LIQUID),
	ION_ROCKET(FuelType.ION),
	PLASMA_ROCKET(FuelType.PLASMA);
	
	FuelType fuel;
	
	RocketType(FuelType fuel) {
		this.fuel = fuel;
	}
	
	public FuelType getFuelType() {
		return fuel;
	}
}
