package zselimdeneme;

import java.util.Scanner;

public class ıf {
    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu ve kilonuzu giriniz");

        double bmı=0;
        double boy = input.nextDouble();
        double kılo = input.nextDouble();


        if (bmı<18.5){
            System.out.println("zayıfsınız");*/

        //girilen bir karakterin harf olup olmadığını bulalım

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char karakter = input.next().toUpperCase().charAt(0);


        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println("girdiğiniz karakter harftir");

        } else {
            System.out.println("girdiğiniz karakter harf değil");

        }

// Soru 2) Kullanicidan 100 uzerinden notunu isteyin.
// Not'u harf sistemine cevirip yazdirin.
// 50’den kucukse "D",
// =50  <60 arasi "C",
// =60  <80 arasi "B",
// =80’nin uzerinde ise "A"


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double notSayi = scan.nextDouble();
        if (notSayi<0||notSayi>100){
            System.out.println("Geçerli bir not giriniz");

    } else if (notSayi<50) {
            System.out.println("notunuz D");

        } else if (notSayi<60) {
            System.out.println("notunuz C");


        } else if (notSayi<80) {
            System.out.println("notunuz B");

        }
        else{
            System.out.println("notunuz A");
        }












    }










    }

