package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Component;
import spring.di.entity.Exam;

@Component(value = "console")
public class InlineExamConsole implements ExamConsole {

    @Autowired(required = false)
    @Qualifier("exam33")
    private Exam exam;

    public InlineExamConsole() {
        System.out.println("constructor");
    }

    public InlineExamConsole(Exam exam) {
        System.out.println("ArgSconstructor");
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
    }

    @Override
    public void setExam(Exam exam) {
        System.out.println("setter");
        this.exam = exam;
    }

    @Override
    public Exam getExam(){
        return exam;
    }


}
