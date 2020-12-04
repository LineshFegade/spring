package com.spring.model;

public class EducationalDetails {
	private String Qualification;
	private String result;
	private int yearPassing;
	public EducationalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EducationalDetails(String qualification, String result, int yearPassing) {
		super();
		Qualification = qualification;
		this.result = result;
		this.yearPassing = yearPassing;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getYearPassing() {
		return yearPassing;
	}
	public void setYearPassing(int yearPassing) {
		this.yearPassing = yearPassing;
	}
	@Override
	public String toString() {
		return "EducationalDetails [Qualification=" + Qualification + "\n, result=" + result + "\n, yearPassing="
				+ yearPassing + "\n]";
	}
	
	
}
