package zselimdeneme;

import java.util.Arrays;

public class s02 {
    public static void main(String[] args) {


        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
//           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz


        int ages[]=new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        System.out.println(Arrays.toString(ages));


        int minumum=ages[0];
        int maximum=ages[0];
        for (int w:ages)
        {minumum=Math.min(minumum ,w);
        {maximum=Math.max(maximum ,w);

        }
            System.out.println(maximum+minumum);





    }
}}
