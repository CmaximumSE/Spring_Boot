package com.example.boot1.dto;

// DTO(Data Transfer Object) : 데이터를 전달하기 위해서 사용하는 객체
// - 메서드를 호출할 때 argument로 전달되는 객체
// - 메서드가 리털할 때 리턴값으로 사용되는 객체
// 특별한 기능(메서드) 없이, 필드/생성자/getter/setter/toString 정도를 갖는 데이터 클래스.
public class UserDto {
	// 필드
	private String userId;
	private String pwd;
	
	// 기본 생성자
	public UserDto() {}
	
	// argument를 갖는 생성자
	public UserDto(String userId, String pwd) {
		this.userId = userId;
		this.pwd = pwd;
	}

	// getter/setter
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return String.format("UserDto(userId=%s, pwd=%s)", userId, pwd);
	}
	
	
}// end of DTO class
