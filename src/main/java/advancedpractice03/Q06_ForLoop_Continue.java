package advancedpractice03;

import java.util.Scanner;

public class Q06_ForLoop_Continue {

/*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
      Not: 5 ve 10 dahil değil.
      */
public static void main(String[] args) {


    Scanner input=new Scanner(System.in);
    System.out.println("bir tam sayı giriniz");
    int toplam=0;




    for (int i = 0; i <5 ; i++) {
        System.out.println("bir sayı giriniz");
        int sayı=input.nextInt();

        if (sayı>5&& sayı<10){
            System.out.println("giediğinz sayı 5 ile 10 arasındadır.toplama dahil değildir.");
            continue;
        }
            toplam+=sayı;

    }
    System.out.println("toplam:"+toplam);
}





}
