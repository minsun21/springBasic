package spring.com.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import spring.com.aop.entity.Exam;
import spring.com.aop.entity.SpringExam;

public class Program {
	// JAVA로 AOP 구현하기 (Around Advice)
	public static void main(String[] args) {
		Exam exam = new SpringExam(1, 1, 1, 1);
		
		// 가짜 Exam. 실제 업무 호출, 실제 업무 호출이 구현하고 있는interface들, 곁다리 업무 
		Exam proxy = (Exam) Proxy.newProxyInstance(SpringExam.class.getClassLoader(), new Class[] { Exam.class }, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				long start = System.currentTimeMillis();
				Object result = method.invoke(exam, args);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				long end = System.currentTimeMillis();
				String message = end - start + "ms";
				System.out.println("시간은 " + message +"\n");
				return result;
			}
		});

		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("total is %f\n", proxy.avg());
	}
}
