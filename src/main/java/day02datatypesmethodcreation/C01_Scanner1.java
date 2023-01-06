package day02datatypesmethodcreation;

import java.util.Scanner;

public class C01_Scanner1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen ilk adı giriniz");
        System.out.println("lütfen ikinci adı giriniz");

        String firstName=input.next();
        String lastName=input.next();


    }
}
