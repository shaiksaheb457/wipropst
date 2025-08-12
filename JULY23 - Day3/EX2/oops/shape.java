package com.wipro.oops;

public class shape {
	
	private String color;
    private boolean filled;
    
    
	public shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isFilled() {
		return filled;
	}


	public void setFilled(boolean filled) {
		this.filled = filled;
	}


	@Override
	public String toString() {
		return "shape [color=" + color + ", filled=" + filled + "]";
	}


}
