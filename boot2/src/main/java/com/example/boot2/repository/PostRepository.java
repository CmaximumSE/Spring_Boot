package com.example.boot2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Entity, ID>를 상속하는 인터페이스를 선언.
// -> 스프링 컨텍스트에 Repository 컴퍼넌트로 등록 - 객체로 생성, 관리.

//Repository Component : 
// DB 테이블에서 CRUD(Create, Read, Update, Delete) 작업을 할 수 있는 메서드들을 갖고 있는 객체.
// create - insert, read - select, update - update, delete - delete

public interface PostRepository extends JpaRepository<Post, Long>{
	
	// POSTS 테이블에 모든 컬럼을 검색, 검색 결과를 ID 컬럼의 내림차순으로 정렬.
	// select * from POSTS order by ID desc;
	// 인터페이스에서 메소드 이름을 정의할 때, Spring-JPA에서 사용하는 상용구를 이용하면 
	// 메소드 body가 자동으로 생성됨.
	List<Post> findByOrderByIdDesc();
	
} // end of interface
