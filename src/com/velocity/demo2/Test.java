package com.velocity.demo2;

public class Test {

	public static void main(String[] args) {
		Engine TataEng=new Engine();
		Engine HyundaiEng=new Engine();
		
		
		Car car = new Car(TataEng);
		car.drive();

	}

}
