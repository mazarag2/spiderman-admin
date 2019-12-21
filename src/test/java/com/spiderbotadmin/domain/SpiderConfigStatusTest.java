package com.spiderbotadmin.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SpiderConfigStatusTest {

	private SpiderConfig spiderConfig;
	
	
	@BeforeEach
	public void setUp() throws JsonMappingException, JsonProcessingException {
		String json = "{\"configName\" : \"RespondWithMeme\" ,\"spiderConfigStatus\" : \"ON\"}";
		  spiderConfig = new ObjectMapper()
			      .readerFor(SpiderConfig.class)
			      .readValue(json);
			    
	}
	@Test
	public void testSpiderConfigCreation() {
		
		assertEquals(spiderConfig.getConfigName(),"RespondWithMeme");
		assertEquals(spiderConfig.getSpiderConfigStatus(),SpiderConfigStatus.ON);
		
	}
	
	
}
