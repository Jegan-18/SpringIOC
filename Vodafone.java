package com.selenium.ioc;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		System.out.println("calling vodafone sim");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using vodafone sim");
		
	}

}
