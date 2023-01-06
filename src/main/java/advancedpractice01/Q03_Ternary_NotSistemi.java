package advancedpractice01;

import java.util.Scanner;

public class Q03_Ternary_NotSistemi {
    public static void main(String[] args) {
        /*
        Yüzlük not cinsinden kullanıcıdan alınan notu harf not sistemine çeviren bir kod yazınız.(Ternary kullanınız)
        (90 ve üstü A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Diğerleri F)
         */

        Scanner input=new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int notSayı=input.nextInt();


        String notHarf=notSayı>100?
                "0 ile 100 arası not giriniz":notSayı>89?
                "A":notSayı>79?
                "B": notSayı>69?
                "C":notSayı>59?
                "D":notSayı>49?
                "E":notSayı>-1?"F":"";
        System.out.println("not harf="+notHarf);
    }
}
