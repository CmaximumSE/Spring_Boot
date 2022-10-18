package com.example.boot1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 클래스를 스프링부트 앱의 컨트롤러 객체로 등록.
public class ExampleController {
	
	@GetMapping("/ex1") // 요청 주소 "/ex1"의 GET 방식 요청을 처리하는 메서드.
	public String ex1() {
		return "/example/ex1";
	}
	
}// end of class
