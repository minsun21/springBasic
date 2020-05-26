package spring.com.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LoadAfterThrowingAdvice implements ThrowsAdvice{
	// 어떤 예외가 발생하냐에 따라 함수 인자가 달라지기 때문에 미리 정할 수가 없음.
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("예외가 발생함 : " + e.getMessage());
	}
}
