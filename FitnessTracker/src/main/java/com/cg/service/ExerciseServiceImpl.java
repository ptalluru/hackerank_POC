package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.model.Activity;

@Service
public class ExerciseServiceImpl implements ExerciseService {

	/* (non-Javadoc)
	 * @see com.cg.service.ExerciseService#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<>();
		Activity run = new Activity();
		run.setDesc("Run");
		Activity bike = new Activity();
		bike.setDesc("Bike");
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(run);
		activities.add(bike);
		activities.add(swim);
		return activities;
	}
}
