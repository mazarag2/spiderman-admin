package com.spiderbotadmin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spiderbotadmin.domain.SpiderConfig;
import com.spiderbotadmin.service.SpiderbotAdminServiceImpl;

@Validated
@RestController
@RequestMapping("/admin")
public class SpiderAdminController {
	
	@Autowired
	private SpiderbotAdminServiceImpl spiderService;
	
	@RequestMapping(method = RequestMethod.PATCH,value = "/SpiderConfig",consumes = MediaType.APPLICATION_JSON_VALUE)
	public SpiderConfig updateSpiderConfig(@RequestBody SpiderConfig config) {
		return spiderService.updateConfig(config);
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/test")
	public String testThisDude() {
		
		return "test boi";
	}
}
