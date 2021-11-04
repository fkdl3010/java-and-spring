package Compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Compare {

    public static void main(String[] args) {
        GilGamer gilGamer1 = new GilGamer(10);
        GilGamer gilGamer2 = new GilGamer(20);
        GilGamer gilGamer3 = new GilGamer(30);
        GilGamer gilGamer4 = new GilGamer(40);
        GilGamer gilGamer5 = new GilGamer(50);

        List<GilGamer> gilGamerList = new ArrayList<GilGamer>();
        gilGamerList.add(gilGamer2);
        gilGamerList.add(gilGamer1);
        gilGamerList.add(gilGamer5);
        gilGamerList.add(gilGamer3);
        gilGamerList.add(gilGamer4);

        List<Integer> collect = gilGamerList.stream().flatMap(x -> Stream.of(x.getScore())).collect(Collectors.toList());

        System.out.println(collect);

        List<Integer> collect1 = collect.stream().sorted().collect(Collectors.toList());

        System.out.println(collect1);

        

    }
}
