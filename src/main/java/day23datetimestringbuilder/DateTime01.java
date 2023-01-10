package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

//Example 1:Time'i formatlayiniz.//Example 1:Time'i formatlayiniz.
        LocalTime myTime=LocalTime.now();
        System.out.println("myTime = " + myTime);//21:39:46.474298500


        //hh==> 12 lik saat sistemini kullanir.-Eger 24 luk saat sistemini kullanmak istiyorsaniz  HH==> 24 luk saaat sistemini kullanir.
// hh kullandiginiz da AM veya PM demelisiniz, bunu demek icin "a" yazmaniz yeterlidir.Yani ;"hh:mm  a"

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(dtf.format(myTime));//09:50:36 ÖS





    }
}
