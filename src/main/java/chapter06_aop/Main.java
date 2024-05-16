package chapter06_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chapter06_excer.Calculator;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(BeanConfig.class);
		
		Calculator cal = (Calculator) ctx.getBean("calculator");
		long val = cal.factorial(4);
		System.out.println(val);
	}

}
