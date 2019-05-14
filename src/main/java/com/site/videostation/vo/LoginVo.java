package com.site.videostation.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.site.videostation.validator.IsMobile;

public class LoginVo {
	
	@NotNull
	private String name;
	
	@NotNull
	@Length(min=6)
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginVo [name=" + name + ", password=" + password + "]";
	}
}
