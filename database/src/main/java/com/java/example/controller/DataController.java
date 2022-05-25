package com.java.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.java.example.dao.UserDataRepo;
import com.java.example.model.userData;

@RestController
public class DataController {
	
	@Autowired
	UserDataRepo repo;
	
	//Request Mapping
	@RequestMapping("/index")
	public String indexPage() {
		return "index";
	}

	//To save data
	@RequestMapping("/saveData")
	@ResponseBody
	public String saveData(userData userData) {
		repo.save(userData);
		return "sucess";
	}
	
	//To Read/view data
	@RequestMapping("/showData")
	public ModelAndView showData() {
		ModelAndView mv = new ModelAndView();
		List <userData> dataList = repo.findAll();
		mv.addObject("data",dataList);
		mv.setViewName("view");
		return mv;
	}
	
	//To delete data
	@RequestMapping("/deleteData")
	@ResponseBody
	public ModelAndView deleteData(@RequestParam("id") int id) {
		repo.deleteById(id);
		ModelAndView mv = new ModelAndView();
		List <userData> dataList = repo.findAll();
		mv.addObject("data",dataList);
		mv.setViewName("view");
		return mv;
	}

	//To update data
	@RequestMapping("/updateData")
	@ResponseBody
	public String updateData(userData userData) {
		userData myUpdateData = repo.findByName(userData.getName());
		myUpdateData.setCity(userData.getCity());
		repo.save(myUpdateData);
		return "sucess";
		
	}
}
	
	
	
	
	
	
	
	
	
