package com.javaex.ex01;

public class Point {

	//fields
	private int x;
	private int y;
	
	//constructors
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	//method g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//method
		@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
