package day18arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {


    public static void main(String[] args) {
        //Example 1:Bir List'teki elemanlardan birbirine en yakin olan ikisini bulunuz
//              [12, 19, 15, 30, 21]  ==>  19 ve 21


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(9);
        nums.add(11);

        Collections.sort(nums);

        int minDiff = nums.get(1) - nums.get(0);

        for(int i=1; i<nums.size(); i++){
            minDiff = Math.min(minDiff, nums.get(i)-nums.get(i-1));
        }
        System.out.println(minDiff);

        for(int i=1; i<nums.size(); i++){
            if(nums.get(i)-nums.get(i-1) == minDiff) {
                System.out.println(nums.get(i-1) + " and " + nums.get(i));
            }
        }

        /*


/*    5)  Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

      Array: [1,2,3,4,5,6,7,8,9]   (for each)

*/
        int arr[]={1,2,3,4,5,6,7,8,9};
        int çiftSayı=0;
        int tekSayı=0;
        for (int w:arr){
            if (w%2==0){
                çiftSayı++;
            }else
                tekSayı++;
        }//for body

        System.out.println("çift sayı adedi:"+çiftSayı);
        System.out.println("tek sayı adedi:"+tekSayı);























    }
















    }

