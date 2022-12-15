/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cobaexcept;

/**
 *
 * @author milea
 */
public class CobaExcept {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        System.out.println("Testing");
//        cetakSalam();
//    }
//    
//    public static void cetakSalam(){
//        System.out.println("Assalamu'alaikum");
//    }
    public static void main(String[] args) {
//        int[] arr = new int [10];
//        try{
//            System.out.println(arr[10]);
//        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Maaf, alamat index tidak ditemukan");
//        }

        int [] penyebut = {2,4,6,0,8,9};
        for(int i = 0; i < penyebut.length; i++){
            try {
                double hasil = 100 / penyebut[i];
                System.out.println("hasil pembagian = "+hasil);
            } catch (ArithmeticException e) {
                System.out.println("Pembagian dengan nol, harap periksa lagi");
            }
        }
    }
    
}
