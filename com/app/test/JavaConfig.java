package com.app.test;

//package com.app.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
@Bean
	public Address addr()
	{
	Address a=new Address();
	a.setAddrId(1000);
	a.setLoc("Pune");
	return a;
	}

@Bean
	public Employee empObj()
	{
		Employee e= new Employee();
			e.setId(10);
			e.setName("Pratik");
			e.setAddr(addr());
		return e;
	}
}
