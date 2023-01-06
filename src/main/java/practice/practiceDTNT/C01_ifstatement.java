package practice.practiceDTNT;

import java.util.Scanner;

public class C01_ifstatement {

    /*

   Kullancidan bir gun alin
   eger gun cuma ise "Muslumanlar icin mubarek gun";
   eger gun cumartesi ise "Yahudiler icin mubarek gun";
   eger gun pazar ise "Hristiyanlar icin mubarek gun" yazdiran kodu olusturunuz


*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen gün ismi giriniz");
        String gun = input.next().toLowerCase();//küçük harfe cevirdik

        if (gun.equals("cuma")) {
            System.out.println("müslümanlar için kutsal gün");
        } else if (gun.equals("cumartesi")) {
            System.out.println("yahudiler için kutsal gün");

        } else if (gun.equals("pazar")) {
            System.out.println("hristiyanlar için kutsal gün");

        } else {
            System.out.println("kutsal gun değil");
        }


    }


}
