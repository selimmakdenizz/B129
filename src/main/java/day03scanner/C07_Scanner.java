package day03scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("adresinizi girin");
        String address= input.nextLine();
        System.out.println(address);
    }
}
