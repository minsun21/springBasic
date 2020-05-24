package spring.com.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.com.di.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;

	public GridExamConsole() {
	}

	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("Grid total is %d, avg is %f %n", exam.total(), exam.avg());
	}
	
//	<property name="exam" ref="exam"></property>
	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
