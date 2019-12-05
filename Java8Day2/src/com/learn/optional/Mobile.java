package com.learn.optional;

import java.util.Optional;

public class Mobile {

	private long id;
	private String brand;
	private String name;
	private Optional<DisplayFeatures> displayFeatures;
	private Optional<MobileBattery> mobileBattery;
	// Likewise we can see Memory Features, Camera Features etc.
	
	public Mobile(long id, String brand, String name, Optional<DisplayFeatures> displayFeatures,
			Optional<MobileBattery> mobileBattery) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.displayFeatures = displayFeatures;
		this.mobileBattery = mobileBattery;
	}

		public long getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public Optional<DisplayFeatures> getDisplayFeatures() {
		return displayFeatures;
	}

	public Optional<MobileBattery> getMobileBattery() {
		return mobileBattery;
	}

	public void setMobileBattery(Optional<MobileBattery> mobileBattery) {
		this.mobileBattery = mobileBattery;
	}
	
}
