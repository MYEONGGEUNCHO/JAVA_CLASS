package chapter06_excer;

public class CalculatorImpl implements Calculator {
	
	@Override
	public long factorial(int num) {
		// 재귀호출 10 -> 10 * * (9 * (8 * (...)))
		// 시작 시간
//		long start = System.nanoTime();
//		System.out.println("시작시간: "+start);
		
		if (num == 0) {
			return 1;
		}
		
		return num * factorial(num - 1);
//		long result = 1;
//		for (int i=1; i<=num; i++) {
//			result *= i;
//		}
//		
//		long end = System.nanoTime();
//		System.out.println("종료시간: "+end);
//		System.out.println("소요시간: " + (end - start));
//		
//		return result;
	}

}
