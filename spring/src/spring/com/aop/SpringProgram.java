package spring.com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.com.aop.entity.Exam;

public class SpringProgram {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/com/aop/setting.xml");
		Exam proxy = (Exam) context.getBean("proxy");
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("avg is %f\n", proxy.avg());
	}
}
