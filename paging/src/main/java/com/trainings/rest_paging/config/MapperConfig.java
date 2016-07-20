package com.trainings.rest_paging.config;

import com.trainings.rest_paging.service.DataMapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
	@Bean
    public MapperFactory mapperFactory() {
        return new DefaultMapperFactory.Builder().build();
    }

    @Bean
    public DataMapper mapper(MapperFactory mapperFactory) {
        return new DataMapper(mapperFactory);
    }
}
