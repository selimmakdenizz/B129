package zselimdeneme;

import java.util.Scanner;

public class polindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String bir ifade giriniz : ");
        String ifade = scan.nextLine();


        String tersStr="";

        for (int i =tersStr.length()-1; i >=0 ; i--) {
            tersStr+=tersStr.charAt(i);

        }
        System.out.println("tersStr"+tersStr);
        if (tersStr.equalsIgnoreCase(tersStr)){
            System.out.println("polindromdur");
        }else
            System.out.println("polindrom değildir");



    }
}
