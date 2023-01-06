package zselimdeneme;

import java.util.Scanner;

public class s03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "";
        do {
            System.out.println("Passwordunuzu giriniz");
            password = scan.nextLine();
            if(!(password.equals("AliCan"))) {
                System.out.println("Yanlis");
            }
        }while(!(password.equals("AliCan")));
        System.out.println("Dogru");



        }
}





