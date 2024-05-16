package chapter05;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = "chapter05")
@EnableWebMvc
// MvcConfig <= BeanConfig
public class MvcConfig implements WebMvcConfigurer {
	 // default는 접근제한자가 아니라 인터페이스에서 쓸 수 있는 메서드
	// 재정의해서가 아니라 그냥 쓰기 위해서
	// ViewResolver 설정(JSP 경로)
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
	
	// 정적페이지 처리(컨트롤러가 아니라 톰캣에서 처리하기 위해)
	// how ㅈ
//	@Override
//	public void confi(String v) {
		
//	}
}
