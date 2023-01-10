package advancedpractice06;

import java.util.Scanner;

public class Q02_Palindrome {
    //Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("bir string deger giriniz");
        String str=input.nextLine().replaceAll(" ","").toLowerCase();
        String strReverse="";

        for (int i = str.length()-1; i >-1 ; i--) {
            strReverse+=str.charAt(i);
            
        }
        System.out.println("strReverse = " + strReverse);
        
        if (str.equals(strReverse)){
            System.out.println("palindrom");
        }else
            System.out.println("palindrom değildir");
        
        
        
        
    }
    
}
