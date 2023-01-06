package zselimdeneme;

import java.util.Arrays;

public class s01 {
    public static void main(String[] args) {

//Example 2: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
//             icerdigi karakter sayilari toplamini ekrana yazdiriniz.
        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Atina";

        int sum=0;
        for (String w:brr)
        {sum=sum+ w.length();

        }
        System.out.println(sum);

        System.out.println();
        int totalChar=0;


        for (int i = 0; i <brr.length ; i++) {
            totalChar+=brr[i].length();



    } System.out.println(totalChar);
}}
