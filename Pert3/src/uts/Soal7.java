package uts;

public class Soal7 {
    public static void main(String[] args) {
        String[][] huruf = {
                { "apel", "mangga", "jeruk" },
                { "sirsak", "melon", "jambu" },
                { "anggur", "pepaya", "semangka" },
        };
        System.out.println(huruf[0][1]);// akan muncul mangga
        System.out.println(huruf[2][0]);// akan muncul anggur
    }
}
