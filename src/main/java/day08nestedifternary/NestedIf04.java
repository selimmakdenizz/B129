package day08nestedifternary;

import java.util.Scanner;

public class NestedIf04 {
    public static void main(String[] args) {

        /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

               Eger calisan kadin ise;
                60 yasindan buyukse "Emekli Olabilir "yazdirin

               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */
        Scanner input=new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz.Erkek,Kadın.Diğerleri");
        String gender=input.next();
        System.out.println("yaşınızı girin");
        int age=input.nextInt();
        if (age<0|| age>120){
            System.out.println("lütfen yaşı 0 ile 120 arasında giriniz");
        } else

        if(gender.equalsIgnoreCase("kadın")){
            if (age>60){
                System.out.println("emekli olabilir");
            }else{
                System.out.println("çalışmalı");
            }
        } else if (gender.equalsIgnoreCase("erkek") ){
            if (age>65){
                System.out.println("emekli olabilir");
            }else{
                System.out.println("kesinlikle çalışmalı");
            }
        }else{
            System.out.println("tanımlı değil");
        }

    }








    }


