package com.sasi.springboot.IndiaStateCapital.controller;

public class StateDetails {
	
	private String stateName;
	private String capitalName;
	
	
	public StateDetails(String stateName, String capitalName) {
		super();
		this.stateName = stateName;
		this.capitalName = capitalName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCapitalName() {
		return capitalName;
	}
	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	
	

}
