package edu.java.review11;

// 직사각형(sub class)은 도형(super class)이다.
public class Ractangle extends Shape {
	private double width; // 가로
	private double height; // 세로
	
	public Ractangle(double width, double height) {
		super("직사각형");
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}

	@Override
	public double perimeter() {
		return 2 * (width + height);
	}

}
