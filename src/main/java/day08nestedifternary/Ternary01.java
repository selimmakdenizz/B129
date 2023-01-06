package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

//Example 1: Kullanicidan iki sayi aliniz "buyuk olmayan"(kucuk veya esit olan) sayiyi yazdiriniz
        Scanner input=new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double a= input.nextDouble();
        double b= input.nextDouble();

        //1.YOL
        if (a<b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
        //2.YOL TERNARY

        //             Condition   ?  Condition true ise calisir    :    Condition false ise calisir     ;
        double result=  a<b            ?       a                      :           b                        ;
        System.out.println(result);

































    }
}
