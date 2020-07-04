package com.spiderbotadmin.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spiderbotadmin.domain.SpiderConfig;
import com.spiderbotadmin.domain.SpiderConfigStatus;

public class SpiderConfigRowMapper implements RowMapper<SpiderConfig> {

	@Override
	public SpiderConfig mapRow(ResultSet arg0, int arg1) throws SQLException {
		
		SpiderConfigStatus configStatus = SpiderConfigStatus.valueOf(arg0.getString("spiderconfigstatus"));
		SpiderConfig config = new SpiderConfig(arg0.getString("configname"), configStatus);
		// TODO Auto-generated method stub
		return config;
	}
	
	

}
