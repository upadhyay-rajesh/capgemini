package com.facebookweb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FacebookController {
	
	@RequestMapping("register.capgemini")
	public ModelAndView createProfile(@RequestParam("n1") String name,@RequestParam("n2") String pass,@RequestParam("n3") String email,@RequestParam("n4") String address) {
		
		String str="Registration Fail";
		
		if(name.equals("Rajesh")) {
			str="Registration Success";
		}
		ModelAndView mv=new ModelAndView();
		mv.addObject("result", str);
		mv.setViewName("rr.jsp");
		return mv;
	}
	

}
