package advancedpractice03;

import java.util.Scanner;

public class Q01_WhileLoop_10KatınaKadar {

    //Kullanıcıdan alınan bir sayıdan başlayarak ardışık sayıları 10'un katına gelene kadar yazdıran bir kod yazınız.
    //Örn: Sayı: 46 Çıktı: 46, 47, 48, 49

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayı=input.nextInt();

        while (!(sayı%10==0)){
            System.out.println(sayı+" ");
            sayı++;

        }
    }





























}
