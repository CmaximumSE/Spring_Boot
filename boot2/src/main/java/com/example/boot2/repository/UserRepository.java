package com.example.boot2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA Repository 인터페이스를 상속하는 인터페이스를 선언.
// 스프링 부트에서 bean(객체)으로 관리, 기본적인 DB CRUD 작업에 필요한 메서드들도 자동으로 구현.
public interface UserRepository extends JpaRepository<User, Long> {
	
} // end of interface
