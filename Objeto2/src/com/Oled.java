package com;

public class Oled extends Television{
	
	private boolean led;
	private boolean smart;
	private String color;
	
	
	public Oled() {
		
	}


	public Oled(boolean led, boolean smart, String color) {
		super();
		this.led = led;
		this.smart = smart;
		this.color = color;
	}


	public boolean isLed() {
		return led;
	}


	public void setLed(boolean led) {
		this.led = led;
	}


	public boolean isSmart() {
		return smart;
	}


	public void setSmart(boolean smart) {
		this.smart = smart;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Oled [led=" + led + ", smart=" + smart + ", color=" + color + ", marca=" + marca + ", tamaño=" + tamaño
				+ ", sistema=" + sistema + "]";
	}
	
	
	

}
