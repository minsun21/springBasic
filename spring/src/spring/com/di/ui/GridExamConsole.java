package spring.com.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.com.di.entity.Exam;

@Component("console")
public class GridExamConsole implements ExamConsole {
	@Autowired
	private Exam exam;

	public GridExamConsole() {
		System.out.println("Constructor");
	}


	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("Grid total is %d, avg is %f %n", exam.total(), exam.avg());
	}
	
//	<property name="exam" ref="exam"></property>
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
	}

}
