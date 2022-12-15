package proksi;

public class prodas {
    public static void main(String[] args) {
        String word = "hujanTurun", reverse = "";
        for (int i = (word.length() - 1); i >= 0; i--) {
            reverse += word.charAt(i);
        }

        System.out.println(reverse);
    }
}
