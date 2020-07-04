package com.spiderbotadmin.jdbc;

import org.springframework.stereotype.Component;

import com.spiderbotadmin.domain.SpiderConfig;

@Component
public interface SpiderbotAdminJDBC {

	public SpiderConfig updateConfig(SpiderConfig spiderConfig);
	public SpiderConfig getAllConfig();
	public SpiderConfig getConfig(String name);
}
