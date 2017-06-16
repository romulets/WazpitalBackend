package br.com.wazpital.domain;

public class Hospital {

	private String name;

	private int averageOverflowingLevel;

	private int averageAttendanceSpeed;

	private int averageAttendanceRate;

	public Hospital(String name, int averageOverflowingLevel, int averageAttendanceSpeed, int averageAttendanceRate) {
		super();
		this.name = name;
		this.averageOverflowingLevel = averageOverflowingLevel;
		this.averageAttendanceSpeed = averageAttendanceSpeed;
		this.averageAttendanceRate = averageAttendanceRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAverageOverflowingLevel() {
		return averageOverflowingLevel;
	}

	public void setAverageOverflowingLevel(int averageOverflowingLevel) {
		this.averageOverflowingLevel = averageOverflowingLevel;
	}

	public int getAverageAttendanceSpeed() {
		return averageAttendanceSpeed;
	}

	public void setAverageAttendanceSpeed(int averageAttendanceSpeed) {
		this.averageAttendanceSpeed = averageAttendanceSpeed;
	}

	public int getAverageAttendanceRate() {
		return averageAttendanceRate;
	}

	public void setAverageAttendanceRate(int averageAttendanceRate) {
		this.averageAttendanceRate = averageAttendanceRate;
	}

}