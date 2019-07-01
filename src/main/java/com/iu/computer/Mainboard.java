package com.iu.computer;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Mainboard {
	
	private ArrayList<Ram> rams;

	public ArrayList<Ram> getRams() {
		return rams;
	}

	public void setRams(ArrayList<Ram> rams) {
		this.rams = rams;
	}
	
	

}
