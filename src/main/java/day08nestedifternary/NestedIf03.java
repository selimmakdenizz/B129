package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[] args) {

        /*
                    Password'un ilk harfi buyuk harf ise
                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Alemci ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz...");
        String pwd = input.nextLine();

        char firstChar = pwd.charAt(0);

        if (firstChar >= 'A' && firstChar <= 'Z') {

            if (firstChar == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password cunku buyuk harf ama 'A' degil...");
            }

        } else if (firstChar >= 'a' && firstChar <= 'z') {

            if (firstChar == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz password cunku kucuk harf ama 'z' degil...");
            }

        } else {

            System.out.println("Ilk character harf olmali");

        }

     /*
    Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
Kullanicidan bir sifre girmesini isteyin
Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin. Ilk harf A ise
"Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin. Ilk harf z ise
"Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.

Soru12) Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5'e
bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana "5'e bölünen
çift sayı" yazdırın. Son rakamı 0 değil ise "5'e bölünen tek sayı" yazdırın.
Girdiği password 5'e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.
     */









        }


    }
