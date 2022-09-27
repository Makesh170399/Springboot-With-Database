package com.example.springinbuiltdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

	@Autowired
	UserDAO userdao;
	
	@RequestMapping("hello")
	
	public String home() {
		return "index";
	}
	
	@RequestMapping("addUser")
	public String addUser(UserDetails user) {
		userdao.save(user);
		return "index";
	}
	@RequestMapping("findUser")
	
	public ModelAndView findUser(@RequestParam int Id) {
		ModelAndView mav=new ModelAndView("showUser");
		UserDetails user=userdao.findById(Id).orElse(new UserDetails());
		mav.addObject("inform",user);
		return mav; 
	}
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int Id) {
		ModelAndView mav=new ModelAndView("deleteUser");
		UserDetails usermakesh=userdao.findById(Id).orElse(new UserDetails());
		userdao.deleteById(Id);
		mav.addObject("plane",usermakesh);
		return mav; 	
	}
	}
