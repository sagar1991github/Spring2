package com.velocity.demo2;

public class Car  {
	
	private IEngine engine = null; 
	public Car() {
		// todo Auto genrate Constructor
	}
	//type1 : Constructor
	//type2 : Setter Method
	public Car (IEngine eng) {
		this.engine=eng;
	}
	//type2 : Setter Method
	public void setEng(IEngine eng) {
		this.engine=eng;
	}
	
	public void drive() {
		//Engine engine = new Engine();
		
		int i=engine.start();
		if(i==1) {
			System.out.println("car started..............");
		}
	}

}
