package com.miu.post.aspect;

import com.miu.post.service.CommentService;
import com.miu.post.service.LoggerService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Autowired
    private  LoggerService loggerService;
    @Pointcut("execution( * com.miu.post.controller.*.*(..))")
    public void logMe() {

    }

    @Around("logMe()")
    public void logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String log = "BEFORE Log around: " + proceedingJoinPoint.getSignature().getClass() +" -> "+ proceedingJoinPoint.getSignature().getName();
//        loggerService.save(log);

        proceedingJoinPoint.proceed();

        log = "AFTER Log around: " + proceedingJoinPoint.getSignature().getClass() +" -> "+ proceedingJoinPoint.getSignature().getName();
//        loggerService.save(log);
    }


}
