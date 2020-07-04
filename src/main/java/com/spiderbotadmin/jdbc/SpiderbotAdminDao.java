package com.spiderbotadmin.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spiderbotadmin.domain.SpiderConfig;
import com.spiderbotadmin.rowmapper.SpiderConfigRowMapper;

@Repository("postgresql")
public class SpiderbotAdminDao implements SpiderbotAdminJDBC {

	
	JdbcTemplate jdbcTemplate;

	@Autowired
	public SpiderbotAdminDao(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}
		
	private final String UPDATECONFIG_SQL = "UPDATE public.spiderconfig SET configname = ?, spiderConfigStatus = ?"; 
	private final String GETALLCONFIG_SQL = "SELECT * FROM public.spiderconfig";
	private final String GETCONFIG_SQL = "SELECT * FROM public.spiderconfig WHERE configname = ?";
	
	@Override
	public SpiderConfig updateConfig(SpiderConfig spiderConfig) {
		// TODO Auto-generated method stub
		try {
			jdbcTemplate.update(UPDATECONFIG_SQL,spiderConfig.getConfigName(),spiderConfig.getSpiderConfigStatus().toString());
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		return spiderConfig;
		
	}

	@Override
	public SpiderConfig getAllConfig() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public SpiderConfig getConfig(String name) {
		SpiderConfig config = null ;
		try {
			config = jdbcTemplate.queryForObject(GETCONFIG_SQL, new Object[] {name},new SpiderConfigRowMapper());
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return config;
		
	}

}
