package com.spiderbotadmin.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SpiderConfigStatusTest {

	private SpiderConfig spiderConfig;
	
	public static String SPIDERCONFIG_JSON = "{\"configName\" : \"RespondWithMeme\" ,\"spiderConfigStatus\" : \"ON\"}";
	
	@BeforeEach
	public void setUp() throws JsonMappingException, JsonProcessingException {
		;
		  spiderConfig = new ObjectMapper()
			      .readerFor(SpiderConfig.class)
			      .readValue(SPIDERCONFIG_JSON);
			    
	}
	@Test
	public void testSpiderConfigCreation() {
		
		assertEquals(spiderConfig.getConfigName(),"RespondWithMeme");
		assertEquals(spiderConfig.getSpiderConfigStatus(),SpiderConfigStatus.ON);
		
	}
	
	
}
