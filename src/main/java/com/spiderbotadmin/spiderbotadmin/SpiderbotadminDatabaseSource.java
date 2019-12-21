package com.spiderbotadmin.spiderbotadmin;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpiderbotadminDatabaseSource {
     
	@Bean
	public DataSource getDataSource() { 
	    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create(); 
	    return dataSourceBuilder.build(); 
	}
}