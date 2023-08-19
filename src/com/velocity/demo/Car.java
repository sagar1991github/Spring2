package com.velocity.demo;

public class Car extends Engine {
	
	public void drive() {
		
		int i=super.start();
		if(i==1) {
			System.out.println("car started..............");
		}
	}

}
