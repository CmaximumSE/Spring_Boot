package com.example.boot2.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드들을 argument로 갖는 생성자.
@Builder // all-args 생성자를 이용한 Builder 패턴 클래서/메서드
@Getter // 모든 필드들의 getter 메서
@Entity(name = "USERS") // DB 테이블 엔터티 - name 속성 : 테이블 이름
public class User {

	@Id // 테이블의 고유키(Primary key) -> unique, not null
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; // 글 번호 
	
	
	@Column(nullable = false, unique = true) // 컬럼 제약 조건
	private String username;
	
	@Column(nullable = false) // not null 제약 조건
	private String password;
	
	@Column(nullable = false)
	private String email;
	
	
	
} //end of class

