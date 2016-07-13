package com.atguigu.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * AOP �� helloWorld 1. ���� jar �� com.springsource.net.sf.cglib-2.2.0.jar
 * com.springsource.org.aopalliance-1.0.0.jar
 * com.springsource.org.aspectj.weaver-1.6.8.RELEASE.jar
 * spring-aspects-4.0.0.RELEASE.jar
 * 
 * 2. �� Spring �������ļ��м��� aop �������ռ䡣
 * 
 * 3. ����ע��ķ�ʽ��ʹ�� AOP 3.1 �������ļ��������Զ�ɨ��İ�:
 * <context:component-scan base-package="com.atguigu.spring.aop">
 * </context:component-scan> 3.2 ����ʹ AspjectJ ע�������õ�����:
 * <aop:aspectj-autoproxy></aop:aspectj-autoproxy> Ϊƥ������Զ����ɶ�̬�������.
 * 
 * 4. ��д������: 4.1 һ��һ��� Java �� 4.2 ���������Ҫ����ʵ�ֵĹ���.
 *
 * 5. �������� 5.1 ��������� IOC �е� bean: ʵ������� @Component ע�� 5.2 ������һ������: ��� @Aspect
 * 5.3 ����֪ͨ: ��������빦�ܶ�Ӧ�ķ���. 5.3.1 ǰ��֪ͨ: @Before("execution(public int
 * com.atguigu.spring.aop.ArithmeticCalculator.*(int, int))")
 * 
 * @Before ��ʾ��Ŀ�귽��ִ��֮ǰִ�� @Before ��ǵķ����ķ�����.
 * @Before ��������������ʽ:
 * 
 *         6. ��֪ͨ�з�������ϸ��: ������֪ͨ��������� JoinPoint ���͵Ĳ���, ���п��Է��ʵ�������ǩ���ͷ����Ĳ���.
 * 
 *         7. @After ��ʾ����֪ͨ: �ڷ���ִ��֮��ִ�еĴ���.
 */

// ͨ����� @Aspect ע������һ�� bean ��һ������!
@Aspect
@Component
public class LoggingAspect {
	// ǰ��֪ͨ, ��Ŀ�귽��ִ��֮ǰִ�е�֪ͨ
	@Before("execution(public int com.atguigu.spring.*.*.*(int, int))")
	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();

		System.out.println("The method " + methodName + " begins with " + Arrays.asList(args));
	}

	// ����֪ͨ, ��Ŀ�귽��ִ��֮��(�����Ƿ����쳣)ִ�е�֪ͨ
	@After("execution(* com.atguigu.spring.aop.*.*(..))")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method " + methodName + " ends");
	}

	// ����֪ͨ, �ڷ�������������ִ�еĴ���
	// ����֪ͨ���Է��ط����ķ���ֵ
	@AfterReturning(value = "execution(* com.atguigu.spring.aop.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method " + methodName + " result:" + result);
	}

	// �쳣֪ͨ, ��Ŀ�귽�������쳣ʱ��ִ�еĴ���
	// ���Է��ʵ��쳣����,���ҿ���ָ���쳣����,����ֻ����NullPointerException, �´�������Exception
	@AfterThrowing(value = "execution(* com.atguigu.spring.aop.*.*(..))", throwing = "ex")
	public void afterThrowing(JoinPoint joinPoint, Exception ex) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method " + methodName + " occurs err " + ex);
	}

}
