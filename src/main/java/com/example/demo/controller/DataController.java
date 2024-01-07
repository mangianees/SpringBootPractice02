package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.data.MyData;

import jakarta.servlet.http.HttpSession;

@Controller
public class DataController {
	
//	@GetMapping("home")
//	public String home(@RequestParam("name") String name,@RequestParam("fname") String fname, HttpSession session)
//	{
//		session.setAttribute("name", name);
//		session.setAttribute("fname", fname);
//		return "home";
//	}

//	@GetMapping("home")
//	public ModelAndView home(@RequestParam("name") String name,@RequestParam("fName") String fName)
//	{
//		ModelAndView mv= new ModelAndView();
//		mv.addObject("name", name);
//		mv.addObject("fName", fName);
//		mv.setViewName("home");
//		return mv;
//	}


	@GetMapping("home")
	public ModelAndView home(MyData obj)
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("obj", obj);
		mv.setViewName("home");
		return mv;
	}



}
