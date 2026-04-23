package ch09.time;

import java.time.ZoneId;

public class ZoneIdTest {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println("zoneId = " + zoneId + " / " + zoneId.getRules());

        }
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);

        ZoneId seoul = ZoneId.of("Asia/Seoul");
        System.out.println(seoul);
    }
}
