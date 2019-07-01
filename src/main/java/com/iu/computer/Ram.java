package com.iu.computer;

import javax.annotation.PostConstruct;

public class Ram {
	
	private int size;
	private String company;
	
	
	public void initRam() {
		System.out.println("객체가 생성될때 한번 실행");
	}
	
	
	public void destroyRam() {
		System.out.println("객체가 소멸될때 한번 실행");
	}
	
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
