package com.suresh.demos.aop.annotations;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class KeyAspects {

	@Before("execution(* com.suresh.demos.aop.annotations.OpenDoorImpl.openDoorWithKey(..))")
	public void insertKey(JoinPoint joinpoint) {
		System.out.println("Insert Key working for " + joinpoint.getSignature().getName());
		System.out.println("key of insertKey is " + joinpoint.getArgs()[0]);
	}

	@After("execution(* com.suresh.demos.aop.annotations.OpenDoorImpl.openDoorWithKey(..))")
	public void removeKey() {
		System.out.println("Remove Key");
	}

}
