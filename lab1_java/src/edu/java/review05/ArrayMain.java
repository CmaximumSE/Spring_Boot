package edu.java.review05;

public class ArrayMain {

	public static void main(String[] args) {
		// 배열(arrary) : 
		int[] numbers = {1, 2, 3, 4, 5};
		numbers[2] = 100;
		for(int i = 0; i < numbers.length; i++) {
			
		}
		
		System.out.println();
		
		// 문자열들을 저장하는 배열
		String[] names = {"Scott", "Tiger", "King"};
		System.out.println(names);
		
		// 향상된 for 문장(enhanced for statement, for-each 문장);
		// for(변수 선언 :  배열) { 반복할 문장들; }
		for(String s : names) {
			System.out.println(s);
			
		}
		
		// 정수 5개를 저장할 수 있는 배열, 선언, 생성
		// 타입[] 변수이름 = new 타입[원소 개수];
		int[] intArray = new int[5]; // 5개의 값이 모두 0인 정수 배열이 생성됨.
		
		for (int x : intArray) {
			System.out.print(x + ", ");
		}
		System.out.println();

	}

}
