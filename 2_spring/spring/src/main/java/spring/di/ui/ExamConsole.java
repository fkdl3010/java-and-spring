package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import spring.di.entity.Exam;

public interface ExamConsole {

    void print();

    void setExam(Exam exam);

    Exam getExam();
}
