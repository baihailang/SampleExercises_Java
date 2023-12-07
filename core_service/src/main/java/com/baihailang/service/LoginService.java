package com.baihailang.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 *
 */
@RestController 
public class LoginService {
	
	 @RequestMapping("/") 
     String  home(){ 
         return "你好世界A1！22222222222233332";
     } 

}
