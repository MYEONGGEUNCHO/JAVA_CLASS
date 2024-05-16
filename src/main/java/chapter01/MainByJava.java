package chapter01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainByJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 설정파일(자바파일) 읽어들이기
		// 빈(객체) 생성 -> (싱글톤) 한 번 생성자 생성됨, 컨테이너에 저장
		// 톰캣에서는 실행될 때, ctx를 한 번 실행함
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
//		Person p1 = (Person)ctx.getBean("person");
//		System.out.println(p1);
	}

}
