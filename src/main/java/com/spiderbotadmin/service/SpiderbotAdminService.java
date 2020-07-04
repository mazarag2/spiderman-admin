package com.spiderbotadmin.service;

import com.spiderbotadmin.domain.SpiderConfig;

public interface SpiderbotAdminService {

	public SpiderConfig updateConfig(SpiderConfig spiderConfig);
	public SpiderConfig getAllconfig();
	public SpiderConfig getConfig(String name); 
	
}
