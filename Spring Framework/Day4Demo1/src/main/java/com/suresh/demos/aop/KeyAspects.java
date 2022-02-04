package com.suresh.demos.aop;

import org.aspectj.lang.JoinPoint;


public class KeyAspects {
	public void insertKey(JoinPoint joinpoint) {
		System.out.println("Insert Key working for " + joinpoint.getSignature().getName());
		System.out.println("key of insertKey is " + joinpoint.getArgs()[0]);
	}

	public void removeKey() {
		System.out.println("Remove Key");
	}

	

}
