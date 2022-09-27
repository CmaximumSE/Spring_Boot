package edu.java.review06;

public class Employee {
	// 필드(field, 속성 property)
	int empNo; // 사번
	String empName; // 이름
	double salary; // 급여

	// 생성자 : 객체를 만드는(생성하는) 함수. 생성자의 이름은 클래스의 이름과 동일.
	// [ 수식어 ] 클래스이름([파라미터 선언]) { ... }
	
	// 기본 생성자(default constructor)
	// argument를 갖지 않으면서, 모든 필드들의 값을 그 타입의 기본값으로 초기화하는 생성자.
	// 기본값 : 정수 타입 = 0, 실수 타입 = 0.0, boolean 타입 = false, 참조타입 = null(없음).
	// 클래스에서 생성자가 1개도 선언되어 있지 않은면, 자바 컴파일러가 기본 생성자를 자동으로 만들어 줌.
	// (주의) 다른 생성자를 1개 이상 정의하면, 자바 컴파일러는 기본 생성자를 만들어 주지 않는다.
	public Employee() { }
	
	// argument를 갖는 생성자
	// parameter(파라미터) : argument를 저장하기 위해서 함수 선언 부분에서 선언하는 변수.
	public Employee(int empNo, String empName, double salary) { 
		// this : 메모리에 생성된 객체(인스턴스) 클래스의 멤버(변수, 메서드)를 참조할 때 사용.
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	} 
	
	public Employee(int empNo) { 
//		this.empNo = empNo;
//		this.empName = null;
//		this.salary = 0;
		this(empNo, null, 0);
		// this : 클래스에서 정의된 다른 생성자를 호출
	}
	
}
