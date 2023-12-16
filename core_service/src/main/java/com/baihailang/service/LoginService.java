package com.baihailang.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 *
 */
@RestController 
public class LoginService {
	
	
	private static final Logger log = LoggerFactory.getLogger(LoginService.class);
	@RequestMapping("/") 
	public String  home(){ 
		log.info("你好世界");
		return "你好世界A1！22222222222233332";
	} 

}
