package ch11.ex.ex09;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Map<String, Nation> nationMap = new HashMap<>();
        nationMap.put("한국", new Nation("한국", "서울"));
        nationMap.put("그리스", new Nation("그리스", "아테네"));
        nationMap.put("미국", new Nation("미국", "워싱턴.DC"));
        nationMap.put("일본", new Nation("일본", "도쿄"));
        nationMap.put("중국", new Nation("중국", "베이징"));
        List<Nation> nationList = new ArrayList<>(nationMap.values());
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<String, Nation> entry : nationMap.entrySet()) {
            String country = entry.getKey();
            Nation nation = entry.getValue();
            System.out.println(entry.toString());

        }
        Random random = new Random();
        while (true) {
            int index = random.nextInt(nationMap.size());
            Nation nation = nationList.get(index);
            System.out.println(nation.country + "의 수도는? ");
            String input = scanner.nextLine();
            if (input.equals("그만")) {
                break;
            }
            if (input.equals(nation.capital)) {
                System.out.println("정답");
            } else {
                System.out.println("틀림 / 정답은? " + nation.capital);
            }
        }


    }
}


class Nation {
    String country;
    String capital;

    public Nation(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "country='" + country + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
