package com.selenium.ioc;

public class Airtel implements Sim{
	
	
	@Override
	public void calling() {
		System.out.println("calling airetl sim");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using airtel sim");
		
	}

}
