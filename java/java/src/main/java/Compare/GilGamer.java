package Compare;

import java.util.Comparator;
import lombok.Getter;
import optional.GilOptional;

@Getter
public class GilGamer implements Comparable<GilGamer>, Comparator<GilGamer> {

    int score;


    public GilGamer(int score) {
        this.score = score;
    }

    /**
     * Comparable의 구현 메소드 자기자신의 매개변수를
     * 활용하여 비교한다.Collections 의 sort 메소드로 활용가능함
     *
     * */
    @Override
    public int compareTo(GilGamer o) {
        System.out.println("!!");
        return o.score - score; // 내림차순 desc
//        return score - o.score; // 오름차순 asc
    }

    /**
     * Comparator의 구현 메소드 두 매개변수를 받아 비교한다.
     * */
    @Override
    public int compare(GilGamer o1, GilGamer o2) {
        return o1.getScore() - o2.getScore();
    }

    @Override
    public String toString() {
        return "GilGamer{" +
            "score=" + score +
            '}';
    }
}
