package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

    private Exam exam;

    public GridExamConsole() {
    }

    public GridExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("is grid");
    }

    @Override
    public void setExam(Exam exam) {
        System.out.println("GridExamConsole.setExam");
        this.exam = exam;
    }

    @Override
    public Exam getExam() {
        return null;
    }
}
