package com.example.boot2.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.boot2.dto.PostReadDto;
import com.example.boot2.repository.Post;
import com.example.boot2.service.PostService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j // console log를 사용하기 위해서 
@RequiredArgsConstructor // 생성자에 final 필드 초기화(의존성 주입).
@Controller // Spring context에 controller로 등록 -> DispatcherServlet이 호출할 수 있음.
public class HomeController {
	
	private final PostService postService; // 생성자에 의한 의존성 주입.

	@GetMapping("/") // GET 방식의 요청 주소 "/"를 처리하는 controller method
	public String home(Model model) {
		log.info("home() 호출");
		
		// 서비스 객체에 메서드를 사용해서, DB에 저장된 포스트 글들의 목록을 읽어옴.
		List<PostReadDto> list = postService.read();
		log.info("# of Post list = {}", list.size());
		
		// Model 객체에 리스트를 (속성으로) 추가 ->View(HTML)까지 전달.
		model.addAttribute("postList", list);
		
		return "index"; // View Template(HTML)의 이름.
	}
	
	@GetMapping("/post/create")
	public String newPostPage() {
		log.info("newPostPage() 호출");
		return "/post/create"; // view : templates/post/create.html
	}
	
	@GetMapping("/post/read/{id}")
	public String readPostPage(@PathVariable Long id, Model model) {
		//@PathVariable : 요청 주소(path)에 포함된 변수의 값을 읽어서 선언된 파라미터에 전달.
		log.info("readPostPage(id={}) 호출", id);
		
		// postService 메서드를 호출해서 view에 표현할 Post 객체를 읽어옴.
		Post entity = postService.read(id);
		// Post 타입 객체를 model에 (속성으로) 추가해서, view로 전달.
		model.addAttribute("post", entity);
		
		return "/post/read"; // view 이름	
	}
	
	@GetMapping("/post/modify/{id}")
	public String modifyPostPage(@PathVariable Long id, Model model) {
		log.info("modifyPostPage(id={}) 호출", id);
		
		// 수정 전의 데이터를 DB에서 검색
		Post entity = postService.read(id);
		// view에 전달
		model.addAttribute("post", entity);
		
		return "/post/modify";
	}
	
} // end of class







