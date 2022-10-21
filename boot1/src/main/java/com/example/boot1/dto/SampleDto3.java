package com.example.boot1.dto;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor // final 필드들을 argument로 갖는 생성자.
public class SampleDto3 {
 
	private int age;
	private final String name;
	
	// final 필드(멤버 변수)는 반드시 초기화해야함!
	// (1) 필드를 선언하는 위치에서 초기화 하거나,
	// (2) 필드를 초기화 할 수 있는 생성사에서 초기화 함.
}
