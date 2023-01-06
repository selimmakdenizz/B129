package advancedpractice01;

import java.util.Scanner;

public class Q02_Variable_Hipotenus {
    public static void main(String[] args) {

//Hipotenüs hesaplayan bir kod yazınız

        Scanner input=new Scanner(System.in);
        System.out.println("1.dik kenar uzunluğunu giriniz");
        int a=input.nextInt();
        System.out.println("2.dik kenar uzunluğunu giriniz");
        int b=input.nextInt();


       double hipotenus=Math.sqrt(a*a+b*b);
        System.out.println("hipotenus=" +  hipotenus);

    }
}
