package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TraceableAspect {

	@Around("@annotation(Traceable)")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("Input :\n" + joinPoint.getArgs()[0]);

		HttpServletRequest servletRequest = (HttpServletRequest) joinPoint.getArgs()[1];
		
		System.out.println(servletRequest.getRemoteAddr());

		Object result = joinPoint.proceed();

		System.out.println(result);

		return result;
	}

}
