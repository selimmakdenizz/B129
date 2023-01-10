package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {


        Date myDate=new Date();
        System.out.println("myDate = " + myDate);//Sat Jan 07 23:26:34 TRT 2023




        myDate.getTime();
        System.out.println(myDate.getTime());//1673123327473==>1 Ocak 1970 den su ana kadar olan mili saniye miktarı


        //İçinde bulunduğunuz an nasıl alınır?

        LocalDate.now();
        System.out.println(LocalDate.now());//2023-01-07
        System.out.println(LocalTime.now());//23:34:28.924305300
        System.out.println(LocalDateTime.now());//2023-01-07T23:36:35.141184700



        //Dünyanın herhangi bir saat dlimindeki saati nasıl alırız?

        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Vienna")));//2023-01-07T23:42:39.309556+01:00[Europe/Vienna]
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:46:21.743994300
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));//2023-01-07T23:46:21.743994300


        //İleriki bir tarihe nasıl gidilir?

        ;System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        //Geriki bir tarihe nasıl gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05



        //İleriki bir zamana nasıl gidilir?
        System.out.println(LocalTime.now().plusHours(3));//02:56:40.977272100



        //Geriki bir tarihe nasıl gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//23:13:55.967535200

        //Zamanda belli bir bölümü nasıl alırız?
        System.out.println(LocalTime.now().getHour()+":"+LocalTime.now().getMinute());//0:0

        //Tarihte belli bir bölümü nasıl alırız?
        System.out.println(LocalDate.now().getMonthValue()+":"+LocalDate.now().getDayOfMonth());//1:8


        //İki tarih nasıl karşılaştırılır?
        //02/13/2005-03/01/2007
       boolean result= LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01)) ;
        System.out.println("result = " + result);//

        boolean result1= LocalDate.of(2005,02,13).isAfter(LocalDate.of(2007,03,01)) ;
        System.out.println("result1 = " + result1);//false

        //Tarihlerin formatları nasıl değiştirilir?

        //M==>Tek rakamla ay nosunu yazar MM==> İKİ rakamla ay no sunu yazar
        //MMM ==>Ay isminin ilk uc harfinin yazar- MMMM==>Ay isminin tamamını yazar

        //d ==>Tek rakamla gün nosunu yazar. dd==>iki rakamla gün nosunu yazar

        //yy==> Yılın son iki rakamını yazar. yyyy==>yılın tamamını yazar
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yy");

        System.out.println( dtf.format(LocalDate.now()));;//08/01/2023

    }
}
