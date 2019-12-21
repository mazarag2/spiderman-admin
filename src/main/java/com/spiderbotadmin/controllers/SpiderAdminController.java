package com.spiderbotadmin.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spiderbotadmin.domain.SpiderConfig;

@RestController
@RequestMapping("/admin")
public class SpiderAdminController {
	
	@RequestMapping(method = RequestMethod.PATCH,value = "/SpiderConfig")
	public SpiderConfig updateSpiderConfig(SpiderConfig config) {
		return config;
	}
	
	
	

}
