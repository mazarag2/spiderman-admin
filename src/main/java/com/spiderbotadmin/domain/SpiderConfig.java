package com.spiderbotadmin.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SpiderConfig {
	
	private String configName;
	private SpiderConfigStatus spiderConfigStatus;
	
	@JsonCreator
	public SpiderConfig(@JsonProperty("configName") String configName,@JsonProperty("spiderConfigStatus") SpiderConfigStatus spiderConfigStatus) {
		
		this.configName = configName;
		this.spiderConfigStatus = spiderConfigStatus;
		
	}
	
	public String getConfigName() {
		return configName;
	}

	public SpiderConfigStatus getSpiderConfigStatus() {
		return spiderConfigStatus;
	}

}
