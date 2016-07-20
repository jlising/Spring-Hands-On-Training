package com.trainings.rest_paging.config;

import com.trainings.commons.entities.Student;
import com.trainings.rest_paging.dto.StudentInfo;
import com.trainings.rest_paging.service.DataMapper;
import ma.glasnost.orika.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class Mappings {
	@Autowired
    private DataMapper dataMapper;

    @PostConstruct
    public void init() {

        MapperFactory mapperFactory = dataMapper.getMapperFactory();

        mapperFactory.classMap(Student.class, StudentInfo.class)
                     //.exclude("product")
        			 //.field("address", "address")//If in case fields are not the same
                     .byDefault()
                     .register();
    }

}
