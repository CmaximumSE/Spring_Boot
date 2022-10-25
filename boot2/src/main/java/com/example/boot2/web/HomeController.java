package com.example.boot2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j // console log를 사용하기 위해서 
@Controller // Spring context에 controller로 등록 -> DispatcherServlet이 호출할 수 있음.
public class HomeController {

	@GetMapping("/") // GET 방식의 요청 주소 "/"를 처리하는 controller method
	public String home() {
		log.info("home() 호출");
		return "index"; // View Template(HTML)의 이름.
	}
	
} // end of class
