package chapter06_aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import chapter06_excer.Calculator;
import chapter06_excer.CalculatorImpl;
import chapter06_excer.TimerAdvice;

@Configuration
@EnableAspectJAutoProxy
public class BeanConfig {
	@Bean
	public Calculator calculator() {
		return new CalculatorImpl();
	}
	
	@Bean
	public TimerAdvice timerAdvice() {
		return new TimerAdvice();
	}
}
