package com.suresh.demos.injection;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class MyCollections {
	public Map<Integer, String> employeeMap;
	public List<String> courses;
	public MyCollections() {
		employeeMap = new HashMap();
		courses = new ArrayList();
		
		employeeMap.put(101, "Ram");
		employeeMap.put(102, "Shiva");
		employeeMap.put(103, "Krishna");
		
		courses.add("HTML");
		courses.add("CSS");
		courses.add("JS");
		
		
		
		
	}
}
