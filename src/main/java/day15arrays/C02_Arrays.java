package day15arrays;

import java.util.Arrays;

public class C02_Arrays {
    //bir stringdeki sesli harflerin sayisini bulan kodu yaziniz
    public static void main(String[] args) {
        String str = "java ogrenince para kazanmak,ne kolay,ogrenemeyince ne kadar zor";
        str=str.toLowerCase();

       //1.yol replace ALL
        int vowels=str.replaceAll("[^aeıouAEIOU]","").length();
        System.out.println(vowels);




        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));


        int counter=0;
        //iter for each loop
        for (String w:harfler) {
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                counter++;
            }

        }//for each loop
        System.out.println(counter);
    }
}
