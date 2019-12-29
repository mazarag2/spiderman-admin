package com.spiderbotadmin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spiderbotadmin.domain.SpiderConfig;

@Controller
@RequestMapping("/admin")
public class SpiderAdminController {
	
	@RequestMapping(method = RequestMethod.PATCH,value = "/SpiderConfig")
	public SpiderConfig updateSpiderConfig(@RequestBody SpiderConfig config) {
		return config;
	}

}
