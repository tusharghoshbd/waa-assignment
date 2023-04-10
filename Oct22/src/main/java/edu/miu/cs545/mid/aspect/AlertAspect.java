package edu.miu.cs545.mid.aspect;

import edu.miu.cs545.mid.entity.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Aspect
@Component
public class AlertAspect {
    @Pointcut("execution(java.util.List<edu.miu.cs545.mid.entity.Student> edu.miu.cs545.mid.controller.StudentController..*(..))")
    //@Pointcut("execution(org.springframework.http.ResponseEntity<java.util.Collection<edu.miu.cs545.mid.entity.Student>> edu.miu.cs545.mid.controller.StudentController..*(..))")

    public void alert(){
    }
    @After("alert()")
    public void sendAlert(JoinPoint joinPoint){
        //send Alert
        System.out.println("%%%%%%%%%%% " + joinPoint.getSignature());
    }
}
