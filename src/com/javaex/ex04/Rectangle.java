package com.javaex.ex04;

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
	public int area() {
		return width*height;
	}
	
	public boolean equals(Object obj) {
		if(this.area() == ((Rectangle)obj).area() && this.area() == ((Rectangle)obj).area()) {
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
