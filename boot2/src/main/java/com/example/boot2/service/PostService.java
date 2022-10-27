package com.example.boot2.service;

import org.springframework.stereotype.Service;

import com.example.boot2.dto.PostCreateDto;
import com.example.boot2.repository.Post;
import com.example.boot2.repository.PostRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor // final로 선언된 필드를 파라미터로 갖는 생성자.
@Service
// -> 스프링 컨텍스트에서 Service 컴포넌트 객체로 생성, 관리됨. -> 필요로 하는 클래스에 주입.
public class PostService {
	
	// Service 계층의 클래스는 Repository 계층의 클래스를 사용.
	// -> 의존성 주입 : (1) 필드 주입 @AutoWired, (2) 생성자 주입 - final field + 생성자
	// @Autowired private PostRepository postRepository; // 필드 주입
	private final PostRepository postRepository; // 생성자 주입
	
	public Long create(PostCreateDto dto) {
		log.info("create({})", dto);
		
		// PostDto 객체를 Post 엔터티 객체로 변환
		Post entity = dto.toEntity();
		log.info("DB save 전 entity = {}", entity);
		
		postRepository.save(entity); //DB posts 테이블에 엔터티를 저장(insert SQL).
		log.info("DB save 후 id = {}", entity.getId());
		
		return entity.getId(); // DB 테이블에 insert된 글(Post)의 글번호를 리턴.
	}
	
}// end of Service Class
