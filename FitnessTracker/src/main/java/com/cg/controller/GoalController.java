package com.cg.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cg.model.Goal;

@Controller
@SessionAttributes("goal")
public class GoalController {

	@RequestMapping(value="addGoal",method=RequestMethod.GET)
	public String addGoal(Model model) {
		Goal goal = new Goal();
		goal.setMinutes(10);
		model.addAttribute("goal",goal);
		System.out.println("In Get");
		return "addGoal";
	}
	@RequestMapping(value="addGoal",method=RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal,BindingResult result) {
		System.out.println("Goal has errors ? :- "+result.hasErrors());
		System.out.println("Minutes updated : "+goal.getMinutes());
		//return "addGoal";
		if(result.hasErrors()) {
			return "addGoal";
		}
		return "redirect:addMinutes";
	}
}
