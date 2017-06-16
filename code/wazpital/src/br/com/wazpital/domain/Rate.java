package br.com.wazpital.domain;

import java.util.Date;

public class Rate {

	private int overflowingLevel;

	private int attendanceSpeed;

	private int attendanceRate;

	private String comment;

	private Date date;

	public Rate(int overflowingLevel, int attendanceSpeed, int attendanceRate, String comment, Date date) {
		super();
		this.overflowingLevel = overflowingLevel;
		this.attendanceSpeed = attendanceSpeed;
		this.attendanceRate = attendanceRate;
		this.comment = comment;
		this.date = date;
	}

	public int getOverflowingLevel() {
		return overflowingLevel;
	}

	public void setOverflowingLevel(int overflowingLevel) {
		this.overflowingLevel = overflowingLevel;
	}

	public int getAttendanceSpeed() {
		return attendanceSpeed;
	}

	public void setAttendanceSpeed(int attendanceSpeed) {
		this.attendanceSpeed = attendanceSpeed;
	}

	public int getAttendanceRate() {
		return attendanceRate;
	}

	public void setAttendanceRate(int attendanceRate) {
		this.attendanceRate = attendanceRate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
