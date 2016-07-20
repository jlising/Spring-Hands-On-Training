package com.trainings.jaxb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = {"com.trainings.jaxb"})
public class JaxbConfig {
	
	@Bean
	Jaxb2Marshaller marshaller(){
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
		jaxb2Marshaller.setPackagesToScan("com.trainings.jaxb.dto");
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("jaxb.formatted.output", true);
		
		jaxb2Marshaller.setMarshallerProperties(map);
	    
		return jaxb2Marshaller;
	}
}
