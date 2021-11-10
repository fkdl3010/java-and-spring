package spring.di.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring.di.ui.GridExamConsole;

@Component("exam33")
public class NewlecExam implements Exam {

    private int kor;
    @Value("20")
    private int eng;
    private int math;
    private int com;

    @Override
    public int total() {
        return kor+eng+math+com;
    }

    @Override
    public float avg() {
        return total() / 4.0f;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    @Override
    public String toString() {
        return "NewlecExam{" +
            "kor=" + kor +
            ", eng=" + eng +
            ", math=" + math +
            ", com=" + com +
            '}';
    }
}
