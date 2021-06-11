package com.javaex.ex03;

public class Rectangle {

	//fields
	private int width;
	private int height;
	
	//constructors
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	//method g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//method
	public boolean equals(Object obj) {
		
		if(this.width == ((Rectangle)obj).width && this.height == ((Rectangle)obj).height) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
}
