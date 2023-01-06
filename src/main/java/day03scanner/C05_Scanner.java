package day03scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kısa kenarını giriniz");
        int en= input.nextInt();
        System.out.println("Lütfen dikdörtgenin uzun kenarını giriniz");
        int boy= input.nextInt();
        System.out.println("Alan==>"+(en*boy));
        System.out.println("Cevre==>"+(2*(en+boy)));

    }
}
