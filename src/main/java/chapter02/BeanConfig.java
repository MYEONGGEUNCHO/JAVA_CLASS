package chapter02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean
	public MemberDAO memberDAO() {
		return new MemberDAOImpl(); // 자식 인터페이스으로 자동형변환
	}
	
	@Bean
	public MemberService memberService() {
		MemberServiceImpl m = new MemberServiceImpl();
		m.setDao(memberDAO()); // 이렇게 쓰면 기존에 있던 Bean을 주입시켜줌
		return m;
	}
}
