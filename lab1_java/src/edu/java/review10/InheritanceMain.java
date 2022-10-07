package edu.java.review10;

/*
 	상속(Inheritance) : 상위 클래스의 멤버들을 확장해서 하위 클래스를 설계하는 방법.
 	상위 클래스(super class), 부모 클래스(parent class), 기본 클래스(base class) - 사람
 	하위 클래스(sub class), 자식 클래스(child class), 유도 클래스(derived class) - 회사원, 학생,...
 	
 	자바의 모든 클래스트 Object를 상속함. 자바의 최상위 클래스는 Object.
 	
 	class 하위클래스이름 extends 상위클래스이름 { ... }
 	자바의 최상위 클래스인 Object만 상속하는 경우에는 extends Object를 생략함.
 	
 */

public class InheritanceMain {

	public static void main(String[] args) {
		// Person 타입 변수 선언, 객체 생성
		Person p1 = new Person();
		System.out.println(p1);
		// println(Object o) 메서드는 Object 타입 객체의 toString() 메서드가 리턴하는 문자열을 콘솔창에 출력해줌.
		System.out.println(p1.getName());
		
		Person p2 = new Person("max");
		System.out.println(p2.getName());
		System.out.println("\n====================================\n");
		
		// BusinessPerson 타입 변수 선언, 객체 생성.
		BusinessPerson p3 = new BusinessPerson();
		System.out.println(p3);
		System.out.println(p3.getName());
		System.out.println("\n====================================\n");
		
		BusinessPerson p4 = new BusinessPerson("max", "a");
		System.out.println(p4.getName());
		System.out.println(p4.getCompany());
		
	}// end of main

} // end of class
