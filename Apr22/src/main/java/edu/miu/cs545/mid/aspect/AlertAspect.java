package edu.miu.cs545.mid.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlertAspect {
    @Pointcut("@annotation(edu.miu.cs545.mid.annotations.Alert)")
    public void alertAnnotation(){
    }
    @Pointcut("execution(* edu.miu.cs545.mid.controller.StudentController.create*(..))")
    public void alertStudentControllerCreate(){
    }
    @Pointcut("execution(* edu.miu.cs545.mid.controller.StudentController.delete*(..))")
    public void alertStudentControllerDelete(){
    }
    @Pointcut("execution(* edu.miu.cs545.mid.controller.StudentController.update*(..))")
    public void alertStudentControllerUpdate(){
    }
    @Pointcut("alertAnnotation() && (alertStudentControllerCreate() || alertStudentControllerDelete() || alertStudentControllerUpdate())")
    public void alert(){
    }
    @After("alert()")
    public void sendAlert(JoinPoint joinPoint){
        //send Alert
        System.out.println("%%%%%%%%%%% " + joinPoint.getSignature());
    }
}
