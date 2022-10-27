package com.example.boot2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Entity, ID>를 상속하는 인터페이스를 선언.
// -> 스프링 컨텍스트에 Repository 컴퍼넌트로 등록 - 객체로 생성, 관리.

//Repository Component : 
// DB 테이블에서 CRUD(Create, Read, Update, Delete) 작업을 할 수 있는 메서드들을 갖고 있는 객체.
// create - insert, read - select, update - update, delete - delete

public interface PostRepository extends JpaRepository<Post, Long>{
	
} // end of class
