package com.cognizant.deepskilling_week_2.spring_core_and_maven.LIbraryManagement.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();

        System.out.println(
                joinPoint.getSignature().getName()
                        + " executed in "
                        + (end - start)
                        + " ms"
        );

        return result;
    }
}