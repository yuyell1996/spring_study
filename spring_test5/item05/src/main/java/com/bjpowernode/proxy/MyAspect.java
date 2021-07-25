package com.bjpowernode.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Date;

@Aspect
public class MyAspect {

//    @Before("execution(* *..SomeServiceImpl.doSome(..))")
//    public void MyBefore(JoinPoint jp){
//        System.out.println("*********************************************************");
//        System.out.println("这是前置通知，同于记录目标方法的启动时间："+new Date());
//        String name = jp.getSignature().getName();
//        System.out.println("在前置通知中，利用JoinPoint参数获取目标方法的定义："+jp.getSignature());
//        System.out.println("在前置通知中，利用JoinPoint参数获取目标方法的名称："+name);
//        Object[] args = jp.getArgs();
//        for(Object obj:args){
//            System.out.println("在前置通知中，利用JoinPoint参数获取目标方法的参数："+obj);
//        }
//        System.out.println("*********************************************************");
//    }

    @Before("execution(* *..SomeServiceImpl.doSome(..))")
    public void MyBefore2(JoinPoint jp){
        System.out.println("*********************************************************");
        System.out.println("这是前置通知，同于记录目标方法的启动时间："+new Date());
        String name = jp.getSignature().getName();
        if ("doSome".equals(name)) {
            System.out.println("利用前置通知进行功能增强，这是doSome方法");
        } else if ("doOther".equals(name)) {
            System.out.println("利用前置通知进行功能增强，这是doOther方法");
        }
        System.out.println("*********************************************************");
    }

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doFirst(..))", returning = "res")
    public void myAfterReturning(Object res){
        System.out.println("*********************************************************");
        System.out.println("这是后置通知，同于记录目标方法的结束时间："+new Date());
        System.out.println("利用后置通知获取目标方法的执行结果："+res);
        if("abcd".equals(res)){
            System.out.println("根据目标方法的返回结果不同，做不同的增强功能");
            res = "dcba";
            System.out.println("res="+res+"，在后置通知中修改返回结果，查看是否能影响目标方法的执行结果");
        }
        System.out.println("*********************************************************");
    }

    @Around(value = "mypt()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("*********************************************************");
        System.out.println("这是环绕通知，加在目标方法执行之前，记录启动时间："+new Date());
        Object methodRes = null;
        methodRes = pjp.proceed();
        Object[] args = pjp.getArgs();
        if(args!=null&&args.length>0){
            Object obj = args[0];
            if("String".equals(obj)){
                methodRes = "zhangsan";
            }
            System.out.println("利用环绕通知进行功能增强");
        }

        System.out.println("这是环绕通知，加在目标方法执行之后，记录结束时间："+new Date());
        System.out.println("*********************************************************");
        return methodRes;
    }

    @AfterThrowing(value = "execution(public void com.bjpowernode.service.SomeService.doThred())",throwing = "ex")
    public void myAfterThrow(Exception ex){
        System.out.println("*********************************************************");
        System.out.println("这是异常通知，用于目标方法的执行监控");
        System.out.println("异常原因："+ex.getMessage());
        System.out.println("*********************************************************");
    }

    @After(value = "mypt()")
    public void myAfter(){
        System.out.println("*********************************************************");
        System.out.println("这是最终通知，总是会被执行，用于程序的收尾工作");
        System.out.println("*********************************************************");
    }

    @Pointcut("execution(* *..SomeServiceImpl.do*(..))")
    public void mypt(){}
}
