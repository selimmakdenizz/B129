package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop04 {
    /*
   Kullanicidan baslangic ve bitis degerlerini alin.
   Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari
   ekrana yazdiriniz  //10  12  14
*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Başalngıc dğeri giriniz");
        int start = input.nextInt();

        System.out.println("Bitiş değeri giriniz.");
        int end = input.nextInt();


        if (start > end) {
            System.out.println("Başlangıc değeri bitişten büyük olamaz");
        } else {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " ");
                }

            }
        }
    }
}
