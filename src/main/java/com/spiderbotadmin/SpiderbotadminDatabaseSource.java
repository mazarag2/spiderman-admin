package com.spiderbotadmin;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


@Configuration
public class SpiderbotadminDatabaseSource {
     
	@Bean
	public DataSource getDataSource() { 
	    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create(); 
	    return dataSourceBuilder.build(); 
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}
}