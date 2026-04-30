package ch12.io;

import java.nio.charset.Charset;
import java.util.Set;
import java.util.SortedMap;

public class CharactersetMain {
    public static void main(String[] args) {
        SortedMap<String, Charset> characterSet = Charset.availableCharsets();
        for (String chatacterName : characterSet.keySet()) {
            System.out.println("chatacterName = " + chatacterName);
        }
        System.out.println("=============================");
        Charset charset01 = Charset.forName("ms949");
        System.out.println("charset01 = " + charset01);
        Set<String> aliases = charset01.aliases();
        for (String alias : aliases) {
            System.out.println("alias = " + alias);
        }
    }
}
