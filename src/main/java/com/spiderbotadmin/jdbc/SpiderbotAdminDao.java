package com.spiderbotadmin.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spiderbotadmin.domain.SpiderConfig;

@Component
public class SpiderbotAdminDao implements SpiderbotAdminJDBC {

	
	JdbcTemplate jdbcTemplate;

	@Autowired
	public SpiderbotAdminDao(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}
		
	private final String UPDATECONFIG_SQL = "UPDATE public.spiderconfig SET spiderconfigname = :spiderconfigname, spiderconfigstatus = :spiderconfigstatus"; 
	
	
	@Override
	public SpiderConfig updateConfig(SpiderConfig spiderConfig) {
		// TODO Auto-generated method stub
		try {
			jdbcTemplate.update(UPDATECONFIG_SQL,spiderConfig.getConfigName(),spiderConfig.getSpiderConfigStatus());
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println("it worked lol");
		return spiderConfig;
		
	}

}
