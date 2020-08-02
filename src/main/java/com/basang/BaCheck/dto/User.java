package com.basang.BaCheck.dto;

public class User {
	private int user_idx;
	private String user_name;
	private String user_code;
	private int user_level;
	
	@Override
	public String toString() {
		return "User [user_idx=" + user_idx + ", user_name=" + user_name + ", user_code=" + user_code + ", user_level="
				+ user_level + "]";
	}

	public int getUser_idx() {
		return user_idx;
	}

	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_code() {
		return user_code;
	}

	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}

	public int getUser_level() {
		return user_level;
	}

	public void setUser_level(int user_level) {
		this.user_level = user_level;
	}
	
	
	
	
}
