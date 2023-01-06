package day12forloopwhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Example 1: 3'den 10'a kadar tamsayilari console'a yazdiriniz

        //1.yol
        for (int i = 3; i <11 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();

        //2,yol:While loop
        int i=3;

        while (i<7){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //Example 2: 23'den 12'yw kadar çift tam sayilari console' a yazdiriniz
        int k=23;
        while(k>11){
            if(k%2==0){
                System.out.print(k+ " ");
            }k--;

        }
        System.out.println();
        //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
        //1.yol:while loop
    int num =-578;
    num=Math.abs(num);
        int sum=0;

        while (num>0){
            sum=sum+num%10;

            num/=10;
        }
        System.out.println(sum);

        Scanner input1=new Scanner(System.in);
        System.out.println("lütfen tam sayı giriniz");
        int num2=input1.nextInt();

        if (num2%2==0){
            System.out.println("çift sayı");
        }else
            System.out.println("tek sayı");
        System.out.println(num2);

        //2.yol :For Loop

        int a=684;
        int toplam=0;
        for (int j =a; j>0 ; j/=10) {
            toplam=toplam+j%10;

        }
        System.out.println(toplam);










    }


}
