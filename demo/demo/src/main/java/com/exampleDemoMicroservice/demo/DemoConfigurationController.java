package com.exampleDemoMicroservice.demo;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
import com.exampleDemoMicroservice.demo.bean.DemoConfiguration;

@RestController
public class DemoConfigurationController {
	@GetMapping("/limits")  
	public DemoConfiguration retriveLimitsFromConfigurations()  
	{  
	return new DemoConfiguration(1000, 1);  
	}  
	}  

