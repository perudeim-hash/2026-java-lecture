package ch11.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        // 만약 순서가 중요한 경우에는 LinkedHashMap<>()를 사용한다.
//        Map<String, String> map = new LinkedHashMap<>();

        Map<String, String> map = new HashMap<>();
        map.put("melon", "수박"); // Map 의 Key 는 Set 의 구조인데 Set 은 중복을 허용하지 않는다.
        map.put("apple", "사과");
        map.put("peach", "복숭아");
        map.put("orange", "오렌지");

        for (String key : map.keySet()) {
//            System.out.println(key);
            System.out.println(map.get(key));
        }
        
        // Key와 Value를 한번에 뽑아내기 위해서 사용함
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " / " + entry.getValue());
        }
        System.out.println("====================");
        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println("entry.getKey() = " + entry.getKey() + " / " + entry.getValue()) ;
        }
    }
}
