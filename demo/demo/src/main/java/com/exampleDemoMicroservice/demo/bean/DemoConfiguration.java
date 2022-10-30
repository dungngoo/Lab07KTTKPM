package com.exampleDemoMicroservice.demo.bean;

public class DemoConfiguration {
	private int maximum;  
	private int minimum;  
	//no-argument constructor  
	protected DemoConfiguration()  
	{  
	}  
	//generating getters  
	public int getMaximum()   
	{  
	return maximum;  
	}  
	public int getMinimum()   
	{  
	return minimum;  
	}  
	//genetrating constructor using fields  
	public DemoConfiguration(int maximum, int minimum)   
	{  
	super();  
	this.maximum = maximum;  
	this.minimum = minimum;  
	}  
}
