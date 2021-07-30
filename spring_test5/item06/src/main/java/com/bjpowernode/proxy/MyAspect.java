package com.bjpowernode.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    @Around("execution(* *..NumberService.add*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object methodRes = null;

        System.out.println("*********************************************************");
        System.out.println("这是环绕通知，在目标方法执行前记录启动时间："+new Date());
        System.out.println("*********************************************************");

        boolean ok = true;
        Object[] args = pjp.getArgs();
        for(Object obj:args){
            Integer n = (Integer) obj;
            if(n==null || n<=0){
                ok=false;
                break;
            }
        }
        if(ok) {
            methodRes = pjp.proceed();
            System.out.println("经过环绕通知检查，目标方法的参数非空且都为大于0的正整数，符合条件");
        }else {
            methodRes = -1;
            System.out.println("经过环绕通知检查，目标方法的参数为空0或者小于等于0，不符合条件");
        }
        System.out.println("*********************************************************");
        System.out.println("这是环绕通知，在目标方法执行后记录结束时间："+new Date());
        System.out.println("*********************************************************");
        return methodRes;
    }
}
