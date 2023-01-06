package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
        Ex 1 : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz
               i)En az 8 karakter olsun
               ii)Space characteri olmasin
               iii)En az bir tane buyuk harf olsun
               iv)En az bir tane kucuk harf olsun
               v)En az bir tane sembol olsun
               vi)En az bir tane rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //i)En az 8 karakter olsun
        boolean first = pwd.length()>7;
        System.out.println(first);

        //ii)Space characteri olmasin
        boolean second = !pwd.contains(" ");// "!" olumsuzluk "not" anlaminda
        System.out.println(second);


        //Note: Buyuk harf olmayanlari sil
        // kalan character sayisina bak
        // Characacter sayisi sifir ise buyuk harf yok demektir
        // sifirdan buyuk ise buyuk harf var demektir

        //iii)En az bir tane buyuk harf olsun
        boolean third = pwd.replaceAll("[^aA-Z]", "").length()>0;//Methodlari ayni satirda yan yana kullanmaya "method chain" denir
        System.out.println(third);

        //iv)En az bir tane kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(fourth);

        //v)En az bir tane sembol(harf ve rakam harici her sey) olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println(fifth);

        //vi)En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println(sixth);

        System.out.println("Password gecerli mi? =" + (first && second && third && fourth && fifth && sixth));
    }
}