package com.example.boot2.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot2.dto.PostCreateDto;
import com.example.boot2.service.PostService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor // final 필드에 대해서 의존성 주입이 될 수 있도록 하기 위해서.
@RequestMapping("/api/post") // -> 모든 컨트롤러 메소드들의 맵핑 주소는 "/api/post"로 시작.
@RestController // 스프링 컨텍스트에 RESTcontroller로 등록 -> DispacherServlet이 호출할 수 있음.
// REST Controller : 메서드가 리턴하는 값은 View의 이름이 아니라, 클라이언트로 직접 응답되는 값.

public class PostRestController {
	
	private final PostService postService; // -> 생성에 의한 의존성 주입.
	
	@PostMapping // POST 방식의 "/api/post" 요청 주소를 처리.
	public Long createPost(@RequestBody PostCreateDto dto) {
		// @RequestBody : DispatcherServlet이 Ajax 요청에 포함된 데이터(JSON 형삭의 문자열)를 분석해서 자바 클래스 타입의 객체로 
		// 변환하고, 메소드를 호출할 때 argument로 전달해줌.
		log.info("createPost({})", dto);
		
		return postService.create(dto); // 클라이언트로 직접 응답되는 값. 
	}
	
	@DeleteMapping("/{id}") // "/api/ppst/{id} 요청 주소의 DELETE 방식의 요청을 처리하는 메서드
	public Long DeletePost(@PathVariable Long id) {
		log.info("deletePost(id={})", id);
		
		// postService 객체의 메서드를 호출해서, DB테이블에서 데이터 삭제하고 그 결과를 리턴.
		return postService.delete(id); // -> Ajax 요청의 콜백 함수의 데이터가 됨.
	}
	
} // end of controller









