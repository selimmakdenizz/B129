package day03scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("İki sayı giriniz");
        double firstNumber=input.nextDouble();
        double secondNumber=input.nextDouble();
        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);


    }
}
