package priv.wangcheng.spring.study.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author WangCheng
 * @version $Id: AopConfig.java, v0.1 2020/11/10 11:24 WangCheng Exp $$
 */
@Aspect
@Component
public class AopConfig {

	@Pointcut("execution(* priv.wangcheng.spring.study.service.*(..))")
	public void pointcut(){}

	@Before("pointcut()")
	public void doBefore(JoinPoint joinPoint){
		System.out.println(joinPoint);

		System.out.println("AOP Before 增强。。。。。");

	}
}
