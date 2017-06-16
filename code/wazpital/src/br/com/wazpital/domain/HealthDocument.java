package br.com.wazpital.domain;

import java.util.Date;

public class HealthDocument {

	private String name;

	private String path;

	private Date date;

	public HealthDocument(String name, String path, Date date) {
		super();
		this.name = name;
		this.path = path;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
