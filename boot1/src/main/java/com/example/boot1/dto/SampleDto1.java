package com.example.boot1.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString // toString() overridew
@NoArgsConstructor // 기본 생성자(argument를 갖지 않는 생성자)
//@AllArgsConstructor // final이 아닌 모든 멤버 변수들을 argument로 갖는 생성자. 
//@RequiredArgsConstructor // final로 선언된 멤버 변수들만 argument로 갖는 생성자.
public class SampleDto1 {
	
//	private final int id;
	private int age;
	private String name;
	
//	public SampleDto(int id) {
//		this.id = id;
//	}
	
//	public SampleDto(int age, String name) {
//		this.age = age;
//		this.name =name;
//	}
		
} // end of class
