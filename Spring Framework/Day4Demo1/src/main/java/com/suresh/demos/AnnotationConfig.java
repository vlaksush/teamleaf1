package com.suresh.demos;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.suresh.demos.aop.annotations")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AnnotationConfig {

}
