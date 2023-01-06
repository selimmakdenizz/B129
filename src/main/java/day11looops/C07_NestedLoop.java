package day11looops;

import java.util.Scanner;

public class C07_NestedLoop {
    public static void main(String[] args) {

/*
        Type code to print the following image on the console
        X X X X X
        X X X X X
        X X X X X
                */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen satır ve sutun bilgisini girin");
        int satır=input.nextInt();
        int sutun=input.nextInt();

        for (int i = 1; i <=satır ; i++) {
            String str="";
            for (int j = 1; j <=sutun ; j++) {
                str=str+"";

            }//for j
            System.out.println(str);

        }//for i


    }
}
