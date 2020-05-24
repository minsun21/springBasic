package spring.com.di;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.com.di.ui.ExamConsole;
import spring.com.di.ui.GridExamConsole;
import spring.com.di.ui.InlineExamConsole;

public class Program {
	
	public static void main(String[] args) {
//		Exam exam = new springExam();
		// SPRING 없이 DI 하기
		// ExamConsole console = new InlineExamConsole(exam);
		/*ExamConsole console = new GridExamConsole(exam); // 생성자 통한 DI
		console.setExam(exam); // setter 통한 DI
		console.print();
		*/
		
		// SPRING으로 DI 하기 - 1. XML
		//ExamConsole console = ?;
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/com/di/setting.xml");
//		ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		// 컬렉션 
//		List<Exam> exams = new ArrayList<>();
//		List<Exam> exams = (List<Exam>) context.getBean("exams");
////		exams.add(new SpringExam(1, 1, 1, 1));
//		for (Exam exam : exams) {
//			System.out.println(exam);
//		}
		
	}
}
