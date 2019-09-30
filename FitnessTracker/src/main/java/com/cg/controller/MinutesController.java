package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cg.model.Activity;
import com.cg.model.Exercise;
import com.cg.service.ExerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	private ExerciseService exerciseService;

	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		System.out.println("excercise : "+exercise.getMinutes());
		System.out.println("Excercise Activity : "+exercise.getActivity());
		return "addMinutes";
		//return "forward:addMoreMinutes.html";
		//return "redirect:addMoreMinutes";
	}
	
	@RequestMapping(value="/activities",method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		return exerciseService.findAllActivities();
	}
//	@RequestMapping(value="/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
//		System.out.println("excercising : "+exercise.getMinutes());
//		return "addMinutes";
//	}
}
