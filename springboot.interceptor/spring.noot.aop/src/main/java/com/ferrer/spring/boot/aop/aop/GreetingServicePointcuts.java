package com.ferrer.spring.boot.aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingServicePointcuts {

	@Pointcut("execution(String com.ferrer.spring.boot.aop.services.GreetingService.sayHello(..))")
	public void greetingLoggerPointCut() {}
	
	@Pointcut("execution(String com.ferrer.spring.boot.aop.services.GreetingService.sayHello(..))")
	public void greetingFooLoggerPointCut() {}
	
	
}
