package ch11.ex.ex06;


import java.util.*;

class Location {
    String country;
    int latitude;
    int longitude;

    public Location(String country, int latitude, int longitude) {
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "country='" + country + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}



public class Test01 {
    public static void main(String[] args) {
        Map<String, Location> countryMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
        while (true) {
            if (countryMap.size() > 3) {
                break;
            }
            String country = scanner.next();
            Integer latitude = scanner.nextInt();
            Integer longitude = scanner.nextInt();
            countryMap.put(country, new Location(country, latitude, longitude));
        }
        System.out.println("인구 검색");
        while (true) {
            String country = scanner.next();
            if (country.equals("그만")) {
                break;
            }
            Location findedCity = countryMap.get(country);
            if (findedCity == null) {
                System.out.println("해당 국가가 없습니다.");

            } else {

                System.out.println(findedCity.toString());
            }


        }
    }
}
