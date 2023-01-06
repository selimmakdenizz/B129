package zselimdeneme;

import java.util.Scanner;

public class LOOPS {
    public static void main(String[] args) {


        //120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        // ardışık tam sayı arasında boşluk bırakarak yazınız


        String s = "";


        for (Integer i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                s = s + i + " ";
            }


        }
        System.out.println("s = " + s);//120 108 96 84 72 60 48 36 24 12



        //Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        //Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.


        Scanner input=new Scanner(System.in);
        System.out.println("Mükemmel sayı giriniz");
        int sayi = input.nextInt();

        int toplam=0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

            if (sayi==toplam){
            System.out.println("mükemmel sayıdır");

        }else
                System.out.println("mükemmel sayı değildir");


       // Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
              //  Örneğin; accessories ´ ces



        }

















    }

