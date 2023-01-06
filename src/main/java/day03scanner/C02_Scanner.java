package day03scanner;

import java.util.Scanner;

public class C02_Scanner {
    //Scanner classı kullanıcı ile etkileşim kurmamızı sağlar.


    public static void main(String[] args) {
        //kullanıcıdan data almak için
        //1.adım Scanner Classında obje oluşturun
        Scanner input=new Scanner(System.in);
        Scanner scan=new Scanner(System.in);



        //2.adım Kullanıcıya ne yapacağını söyle
        System.out.println("lütfen yaşınızı giriniz");

        //3.adım Kullanıcıdan aldığınız datayı variable içine koyun
        byte age=input.nextByte();



        Scanner input2 =new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz...");
        String isim=scan.nextLine();
        System.out.println("Lütfen memleketinizi giriniz...");
        String memleket=scan.nextLine();
        System.out.println("Lütfen yaşınızı girin...");
        int yaş=scan.nextInt();
        System.out.println("Lütfen boyunuzu giriniz...");
        short boy=scan.nextShort();
        System.out.println("Lütfen yaşadığınız yeri sevip sevmediğinizi giriniz");
        boolean seviyorMu=scan.nextBoolean();
        System.out.println("*******");
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yaş = " + yaş);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);

    }





}
