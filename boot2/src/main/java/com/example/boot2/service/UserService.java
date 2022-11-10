package com.example.boot2.service;

import org.springframework.stereotype.Service;

import com.example.boot2.dto.UserSignUpDto;
import com.example.boot2.repository.User;
import com.example.boot2.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor // 파이널 필드를 초기화 하는 생성자.
@Service // 스프링 부트에서 서비스 컴포넌트로 생성하고 관리 - 필요한 곳에서 의존성 주입.
public class UserService {
	
	private final UserRepository userRepository; // 생성자에 의한 의존성 주입.
	
	public Long registerUser(UserSignUpDto dto) {
		log.info("registerUserDto({})", dto);
		
		// DB의 USERS 테이블에 Entity를 저장.
		User user = userRepository.save(dto.toEntity());
		
		return user.getId(); // 테이블에 insert될 때 생성된 id(고유키)를 리턴.
	}
	
} // end of service
