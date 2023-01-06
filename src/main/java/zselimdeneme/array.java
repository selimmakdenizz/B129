package zselimdeneme;

import day10switchloops.Switch01;

import java.util.ArrayList;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        /*    5)  Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

      Array: [1,2,3,4,5,6,7,8,9]
*/
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int çiftSayı = 0;
        int tekSayı = 0;
        for (int w : arr) {
            if (w % 2 == 0) {
                çiftSayı++;
            } else
                tekSayı++;
        }//for body

        System.out.println("çift sayı adedi:" + çiftSayı);
        System.out.println("tek sayı adedi:" + tekSayı);

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen kaçıncı ay olduğunu giriniz");
        int ayNo = input.nextInt();
        String s = "";
        switch (ayNo) {
            case 1:
            case 2:

            case 3:
                System.out.println("kış");
                break;
            case 4:
                System.out.println("nisan");
                break;
            default:
                System.out.println("lütfen geçerli ay giriniz");
                
        }
        Scanner input1=new Scanner(System.in);
        System.out.println("Mükemmel sayı giriniz" );
        int sayi = input.nextInt();//496,8128
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            System.out.println("mükemmel sayı");
        } else
            System.out.println("mükemmel sayı değildir");





    }
}
