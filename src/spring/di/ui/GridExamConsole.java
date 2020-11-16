package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	
	private Exam exam;
	
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("grid 출력 %3d %3.2f",exam.total(),exam.avg());
	}

	@Override
	public void setExam(Exam exam) {
		this.exam=exam;
	}

}
