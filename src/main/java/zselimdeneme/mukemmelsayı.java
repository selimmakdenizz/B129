package zselimdeneme;

import java.util.Scanner;

public class mukemmelsayı {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
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
