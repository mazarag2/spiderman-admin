package com.spiderbotadmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spiderbotadmin.domain.SpiderConfig;
import com.spiderbotadmin.jdbc.SpiderbotAdminDao;

@Service
public class SpiderbotAdminServiceImpl implements SpiderbotAdminService {


	private SpiderbotAdminDao spiderJdbc;
	
	@Autowired
	public SpiderbotAdminServiceImpl(SpiderbotAdminDao spiderJdbc) {
		this.spiderJdbc = spiderJdbc;
	}
	
	
	@Override
	public SpiderConfig updateConfig(SpiderConfig spiderConfig) {
		
		return spiderJdbc.updateConfig(spiderConfig);
	}

	
	
	
	
}
