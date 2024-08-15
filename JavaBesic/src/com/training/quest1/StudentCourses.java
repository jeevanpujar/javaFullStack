package com.training.quest1;

public class StudentCourses implements Institute {

	@Override
	public String[] showCourses() {
		return new String[]{"python", "java", "angular", "spring"};
	}

}
