package zselimdeneme;

import day10switchloops.Switch01;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {


        String s = "Apex is an object oriented programming language";

        String arr[] = s.toLowerCase().split("");
        int counter = 0;


        for (String w : arr) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;


            }
        }
        System.out.println("sesli harf sayısı:" + counter);


        String[] arr1 = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        int size = arr1.length;

        for (Integer i = 0; i < size; i++) {

            String firstChar = arr1[i].substring(0, 1);
            String lastChar = arr1[i].substring(arr1[i].length() - 1);
            if (firstChar.equals(lastChar)) {
                System.out.println(arr1[i]);

            }

        }


        String[] arr2 = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String k = "object";
        int count = 0;

        for (String w : arr2) {
            if (w.contains("object")) {
                count++;
            }
        }
        System.out.println("object stringde :" + count + " adet var");


        String[] arr3 = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        int sum = 0;
        int counter1 = 0;

        for (String w : arr3) {
            sum = sum + w.length();
            counter1++;
        }
        System.out.println("karakterler toplamı:" + sum);


       /* Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
        Integer[] arr = new Integer[]{5, 0, 2, 0, 3};
*/

        Integer[] arr4 = new Integer[]{5, 0, 2, 0, 3};
        Integer[] brr = new Integer[arr4.length];
        int firstIdx = 0;
        int lastIdx = arr4.length - 1;

        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] != 0) {
                brr[firstIdx] = arr4[i];
                firstIdx++;
            } else {
                brr[lastIdx] = 0;
                lastIdx--;
            }


        }
        System.out.println(Arrays.toString(brr));




        Scanner scan=new Scanner(System.in);
        System.out.println("array uzunluğu giriniz");

        int a= scan.nextInt();

        int crr[]=new int[a];

        System.out.println("girilen array elemaları:"+a);


        for (int i = 0; i <a ; i++) {
            crr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr);
        System.out.println(Arrays.toString(crr));

        int frk=crr[crr.length-1]-crr[0];
        System.out.println("fark:"+frk);























    }
}































