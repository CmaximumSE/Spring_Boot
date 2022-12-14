package edu.java.review11;

// 동그라미(sub class)는 도형(super class)이다.
public class Circle extends Shape{
	private double radius; //원의 반지름.
	
	public Circle(double radius) {
		super("동그라미"); // 상위 클래스에서 기본 생성자가 없기 때문에, 다른 생성자를 반드시 명시적으로 호출해야 함.
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
}// end of class
