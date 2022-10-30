package array;

import java.util.Arrays;

public class Coba {
    public static void main(String[] args) {
        String[] sheila = new String[] { "Waktu", "Hujan", "Turun", "disudut", "Gelap" };
        ;
        // https://www.reddit.com/r/learnjava/comments/roire8/array_constants_can_only_be_used_in_initializers/
        System.out.println(Arrays.toString(sheila));
        sheila = new String[] { "Waktu", "Hujan", "Turun" };
        // sheila = sheila();
        System.out.println(Arrays.toString(sheila));
    }

    private static String[] sheila() {
        // String[] asdf = { "Waktu", "Hujan", "Turun", "disudut", "Gelap" };
        // return asdf;
        return (new String[] { "Waktu", "Hujan", "Turun", "disudut", "Gelap" });
    }
}
