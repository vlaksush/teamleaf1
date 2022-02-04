package com.suresh.demos;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.suresh.demos.courses.CourseConfig;
import com.suresh.demos.items.ItemConfig;

@Configuration
@Import({ItemConfig.class,CourseConfig.class})
public class SpringConfig {

}
