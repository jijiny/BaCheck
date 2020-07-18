package com.basang.BaCheck.dto;

public class Test {
	private String id;
	private String password;
	
	@Override
	public String toString() {
		return "Test [id=" + id + ", password=" + password + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
