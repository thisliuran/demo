//package com.example.demo.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Method;
//
////@Aspect
//// @Component
//public class LogAspect {
//    @Pointcut("@annotation(com.example.demo.aop.Action)")//3
//    public void annotationPointCut(){}
//
//    @After("annotationPointCut()")
//    public void after(JoinPoint joinPoint){
//
//        MethodSignature signture = (MethodSignature) joinPoint.getSignature();
//        Method method = signture.getMethod();
//        Action action = method.getAnnotation(Action.class);
//        System.out.println("注解式拦截"+action.name());
//    }
//
//    @Before("execution(* com.example.demo.aop.DemoMethodService.*(..))")
//    public void before(JoinPoint joinpoint){
//        MethodSignature signature = (MethodSignature) joinpoint.getSignature();
//        Method method = signature.getMethod();
//        System.out.print("方法规则式拦截："+method.getName());
//    }
//}
