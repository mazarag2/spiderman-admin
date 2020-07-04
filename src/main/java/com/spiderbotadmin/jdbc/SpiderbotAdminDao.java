package com.spiderbotadmin.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spiderbotadmin.domain.SpiderConfig;

@Repository("postgresql")
public class SpiderbotAdminDao implements SpiderbotAdminJDBC {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	public SpiderbotAdminDao(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}
		
	private final String UPDATECONFIG_SQL = "UPDATE public.spiderconfig SET configname = ?, spiderConfigStatus = ?"; 
	
	
	@Override
	public SpiderConfig updateConfig(SpiderConfig spiderConfig) {
		// TODO Auto-generated method stub
		try {
			System.out.println(spiderConfig.getConfigName() + spiderConfig.getSpiderConfigStatus());
			jdbcTemplate.update(UPDATECONFIG_SQL,spiderConfig.getConfigName(),spiderConfig.getSpiderConfigStatus().toString());
			System.out.println("it worked lol");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		return spiderConfig;
		
	}

}
