package chapter02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainByJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AnnotationConfigApplicationContext ctx =
//				new AnnotationConfigApplicationContext(BeanConfig.class);
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("chapter02/beans.xml");
		
		// java
//		MemberService m = ctx.getBean("memberService", MemberService.class);
		// xml
		MemberService m = ctx.getBean("memberService", MemberService.class);
		
		m.regist();
	}

}
