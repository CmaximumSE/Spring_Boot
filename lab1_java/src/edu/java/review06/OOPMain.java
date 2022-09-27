package edu.java.review06;

/*
  OOP(Object-Oriented Programming) : 객체 지향 프로그래밍
  객체(Object) : 프로그램에서 만들려고 하는 대상. 속성(데이터)와 기능을 가질 수 있음.
  클래스(class) : 객체를 만들기 위해서 프로그래밍 언어로 작성하는 코드.
  	- 객체를 만들기 위한 설계도
  	- 필드(field, 속성 property, 멤버변수) + 생성자(constructor) + 메서드(method)
  	- 클래스는 데이터 타입. 변수 선언에서 사용.
  인스턴스(instance) : 클래스를 사용해서 메모리에 생성된 객체.
  
  클래스 선언(정의) : 
  [수식어] class 클래스 이름 { ... } // [] : 생략 가능
 */

public class OOPMain {

	public static void main(String[] args) {
		// Employee 타입 변수 선언, 객체 생성, 객체 생성(생성자 호출 : new 클래스이름();)
		// 객체가 생성될 떄, 객체의 속성들이 초기화 됨
		Employee emp1 = new Employee(); // 우측 Employee : 생성자  // 기본 생성자 호출

		System.out.println("사번 : " + emp1.empNo);
		System.out.println("이름 : " + emp1.empName);
		System.out.println("급여 : " + emp1.salary);
		System.err.println();
//		emp1.	<= '.'(참조연산자 reference) : (그 주소로 찾아 간다.)

		// argument를 갖는 생성자를 사용해서 객체를 생성
		// argument : 함수(생성자, 메서드)를 호출할 때, 그 함수에게 전달하는 값(들).
		Employee emp2 = new Employee(101, "홍길동", 100);
		
		System.out.println("사번 : " + emp2.empNo);
		System.out.println("이름 : " + emp2.empName);
		System.out.println("급여 : " + emp2.salary);
		System.err.println();
		
		Employee emp3 = new Employee(201);
		
		System.out.println("사번 : " + emp3.empNo);
		System.out.println("이름 : " + emp3.empName);
		System.out.println("급여 : " + emp3.salary);
		System.err.println();
				
	} // end of main

}
