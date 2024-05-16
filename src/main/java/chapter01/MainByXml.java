package chapter01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainByXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
		
		Person p = (Person) ctx.getBean("person");
		System.out.println(p);
		
		Person p2 = (Person) ctx.getBean("person"); 
		System.out.println(p == p2);
		
		Person p3 = ctx.getBean("person", Person.class);
		System.out.println(p == p3);
		
		System.out.println(p3.getName());
		
		Person p4 = ctx.getBean("person2", Person.class);
		System.out.println(p == p4);
		
	}

}
