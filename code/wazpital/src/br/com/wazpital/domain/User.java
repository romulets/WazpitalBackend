package br.com.wazpital.domain;

import java.util.Date;

public class User {

	private String name;

	private Date birthDate;

	private String email;

	private String password;

	public User(String name, Date birthDate, String email, String password) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
