package Compare;

import lombok.Getter;
import optional.GilOptional;

@Getter
public class GilGamer implements Comparable<GilGamer>{

    int score;


    public GilGamer(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(GilGamer o) {
        System.out.println("!!");
        return o.score - score; // 내림차순 desc
//        return score - o.score; // 오름차순 asc
    }

    @Override
    public String toString() {
        return "GilGamer{" +
            "score=" + score +
            '}';
    }
}
