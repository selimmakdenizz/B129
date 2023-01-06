package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
/*
   Kullanicidan bir tam sayi aliniz
   Tam sayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
   Tam sayi 100 ve 100'den büyük ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz.
 */

        /*
scope== curly braces icinde kullanilan degerler body'nin disinda kullanilinca hata verir
(kirmizi renk olur)
dolayisiyla do'nun body'sinddeki num bodynin disinkdaki while disinda hata verir
 */

        Scanner input=new Scanner(System.in);
        int num=0;
        do{
            System.out.println("Bir sayı giriniz");
             num=input.nextInt();
            if (num>=100){
                System.out.println("kazandınız");
            }



        }while (num>=100);
        System.out.println("kaybettiniz");



    }
}
