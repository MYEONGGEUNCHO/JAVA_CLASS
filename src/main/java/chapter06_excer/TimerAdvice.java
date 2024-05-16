package chapter06_excer;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TimerAdvice {
	@Pointcut("execution(public * chapter06_excer..*(..))")
	public void timerTarget() {};
	
	@Around("timerTarget()")
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("메서드 실행전");
		Object obj = joinPoint.proceed(); // 실제 메서드 실행
		System.out.println("메서드 실행후");
		
		return obj;
	}
}
