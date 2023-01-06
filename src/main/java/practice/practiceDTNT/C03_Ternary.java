package practice.practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {
    /*
    Kullanicidan sifirdan buyuk pozitif bir tamsayi girmesini isteyin
    Girilen pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli " yazdirin
    3 basamakli degilse cift olup olmadigini kontrol edin
    Cift ise "3 basamakli olmayan cift sayi" yazdirin
    Cift degilse " 3 basamakli olmayan tek sayi" yazdirin
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = input.nextInt();

        System.out.println("********* if ile cozumu***************");


        if (sayi > 0) {
            boolean sifirdanBuyukUcBas = sayi > 99 && sayi < 1000;
            boolean sifirdanBuyukUcBasOlmayanCift = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;


            if (sifirdanBuyukUcBas) {
                System.out.println("3 basamakli sayi ");
            } else if (sifirdanBuyukUcBasOlmayanCift) {

            } else
                System.out.println("3 basamakli olmayan pozitif tek sayi");
        } else {//negatif sayilar icin burasi calisr
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
        }
    }
}