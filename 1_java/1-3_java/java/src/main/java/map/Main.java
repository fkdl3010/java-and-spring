package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

    static Map<String, Object> person;

    static{
        person = new HashMap<>();
        person.put("name", "gil");
        person.put("age", 27);
        person.put("home", "seoul");
    }

    public static void method1(){
        // 순회1. keySet() 메소드
        // 1. key만 뺀다. // 결론.
        // 2. key들은 Set에 저장해야만 한다.
        // 3. get() 메소드에 Set에서 뺀 key를 전달하면 value가 나온다.
        Set<String> set = person.keySet();

        // key 순회 1
        for (String key : set) {
            System.out.println("[method1]: key1 = " + key);
            System.out.println("[method1]: value1 = " + person.get(key));
        }

        // key 순회 2
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("[method1]: key2 = " + next);
            System.out.println("[method1]: value2 = " + person.get(next));
        }
    }

    public static void method2(){

        // 순회2.entrySet() 메소드
        // entry: key와 value를 묶어서 부르는 말
        // key: getKey() 메소드
        // value: getValue() 메소드
        Set<Entry<String, Object>> entrySet = person.entrySet();

        // key 순회 1
        for (Entry<String, Object> entry : entrySet) {
            System.out.println("[method2]: key1 = " + entry.getKey());
            System.out.println("[method2]: value1 = " + entry.getValue());
        }

        // key 순회 2
        Iterator<Entry<String, Object>> iterator = entrySet.iterator();

        while (iterator.hasNext()){
            Entry<String, Object> entry = iterator.next();
            System.out.println("[method2]: key2 = " + entry.getKey());
            System.out.println("[method2]: value2 = " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        method1();
        System.out.println();
        method2();
    }



}
