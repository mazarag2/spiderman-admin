package com.spiderbotadmin.controllers;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import com.spiderbotadmin.domain.SpiderConfig;
import com.spiderbotadmin.domain.SpiderConfigStatus;
import com.spiderbotadmin.domain.SpiderConfigStatusTest;

@WebMvcTest(SpiderAdminController.class)
@WithMockUser("mike")
public class SpiderAdminControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	private SpiderConfig spiderConfig;
	
	
	@BeforeEach
	public void setUp() {
		
		spiderConfig = new SpiderConfig("RespondWithMeme", SpiderConfigStatus.ON);
		
	}
	@Test
	public void testSpiderAdminController() throws Exception {
		
		mockMvc.perform(patch("/admin/SpiderConfig").contentType(MediaType.APPLICATION_JSON)
				.content(SpiderConfigStatusTest.SPIDERCONFIG_JSON).with(csrf())).
				andExpect(status().is2xxSuccessful());
	}
	
}
