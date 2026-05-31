package com.service;

public class Service {
	IEngine eng;
	
	public Service(IEngine eng) {
		this.eng=eng;
	}
	public void setEngine(IEngine eng) {
		this.eng=eng;
	}
public void journey() {
	eng.start();
	System.out.println("journety Started..");
}
}
