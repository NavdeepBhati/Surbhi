package com.learn.optional;

public class MobileBattery {
	
	private boolean isFlashChargeable;
	private int chargePrice;
	
	public MobileBattery(boolean isFlashChargeable, int chargePrice) {
		super();
		this.isFlashChargeable = isFlashChargeable;
		this.chargePrice = chargePrice;
	}
	public boolean isFlashChargeable() {
		return isFlashChargeable;
	}
	public void setFlashChargeable(boolean isFlashChargeable) {
		this.isFlashChargeable = isFlashChargeable;
	}
	public int getChargePrice() {
		return chargePrice;
	}
	public void setChargePrice(int chargePrice) {
		this.chargePrice = chargePrice;
	}
}
