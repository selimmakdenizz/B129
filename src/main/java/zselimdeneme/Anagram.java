package zselimdeneme;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {


            //asya==>yasa        kara an ==>ankara




        Scanner input=new Scanner(System.in);
        System.out.println("lütfen birinci stringi giriniz");
        String first=input.nextLine();
        System.out.println("lütfen ikinci stringi giriniz");
        String second=input.nextLine();

        anagram(first,second);
    }

    private static void anagram(String first, String second) {

        String arr1[]=first.replaceAll(" ","").toLowerCase().split("");
        String arr2[]=second.replaceAll(" ","").toLowerCase().split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            System.out.println("anagramdır");
        }else
            System.out.println(" anagram değildir");


    }
}
