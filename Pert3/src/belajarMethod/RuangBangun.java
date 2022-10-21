package belajarMethod;

/**
 * RuangBangun
 */
public class RuangBangun {

    public static void main(String[] args) {
        int s = 12, luas = luasKubus(s);
        System.out.println(luas);
    }

    public static int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static int luasKubus(int sisi) {
        return 6 * luasPersegi(sisi);
    }
}