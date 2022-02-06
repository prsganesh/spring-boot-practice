package com.springboot.practice.springbootpractice.bean;

public class StudentBean {
	private int rollNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentBean(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	

}
