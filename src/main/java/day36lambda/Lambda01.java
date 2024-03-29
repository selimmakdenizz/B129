package day36lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Süleyman","Ebubekir","Ayse","Ada","Okan","Semih",
                "Gulsen","Ali","Zeynep","Semih","Bilal","Abdullah","Abdulkadir"));


        /*
allMatch( ) Mukemmeliyetcidir.butun elemanlar
true dondururse sonuc true doner.1 eleman alse olsa sonuc false dondurur
anyMatch( ) en az bir true dondururse sonucu true dondurur
noneMatch( ) hic bir eleman sarti saglamiyorsa true dondurur; 1 tanesi saglasa false dondurur

 */

        alfBykTkrsz(isimler);
        System.out.println();

        chrctrTrsTkrsz(isimler);
        System.out.println();

        chrctrKckByk(isimler);
        System.out.println();

        harfSays7dnAz(isimler);
        System.out.println();

        wIleBslynlr (isimler);
        System.out.println();

        xIleBtn  (isimler);
        System.out.println();

        krktrSysEnBykElmn(isimler);
        System.out.println();

        snHrfIlkHrfHrc(isimler);
        System.out.println();

        krktrSysCftKrTkrszBykKck(isimler);
        System.out.println();

    }//main





    // Task -1 : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfBykTkrsz(List<String>isimler)   {
        isimler.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(t-> System.out.print(t+" "));


    }



    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void chrctrTrsTkrsz(List<String>isimler)   {
        isimler.
                stream().//akisa alindi
                map(String::length).
                distinct().//benzersiz yapildi
                sorted(Comparator.reverseOrder()).//ters sirali
                forEach(t-> System.out.print(t+" "));


    }


    // Task-3 : List elemanlarini, character sayisina gore kckten byk e gore print ediniz..

    public static void chrctrKckByk(List<String>isimler)   {
        isimler.
                stream().//akisa alindi
                sorted(Comparator.comparing(String::length)).//String dataları kucukten buyuge karsılastırdı
                forEach(t-> System.out.print(t+" "));


    }

    // Task-4 : List elemanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void harfSays7dnAz (List<String>isimler)   {
        System.out.println( isimler.
                stream().//akisa alindi
                        allMatch(t->t.length()<=7) ? "list elemanlari 7 ve 7 den daha az harften olusuyor "
                : "list elemanlari 7 harften buyuk");


    }

    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
    public static void wIleBslynlr (List<String>isimler)   {
        System.out.println( isimler.
                stream().//akisa alindi
                        noneMatch(t->t.startsWith("w")) ? "  w ile baslayan isim bizde olmaz "
                : "w ile baslayan isimler");


    }


    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mı kontrol ediniz.

    public static void xIleBtn  (List<String>isimler)   {
        System.out.println( isimler.
                stream().//akisa alindi
                        anyMatch(t->t.endsWith("x")) ? "  x ile biten isimler var "
                : " x ile biten isim yok");


    }




    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.

    public static void krktrSysEnBykElmn  (List<String>isimler)   {
        Stream<String> sonIsim =isimler.
                stream().//akisa alindi
                        sorted(Comparator.comparing(t->t.toString().
                                length()).
                        reversed()).
                limit(1);// limit() icerisine hangi rakami yazarsaniz o kadar data getirir
        // Stream <String> classindan gelir
        //limit(5)-->en fazla karaktere sahip ilk 5 elemani getir
        System.out.println(Arrays.toString(sonIsim.toArray())); //sonIsim.toArray() stream olan akisi Array'e cevirdim
        //Arrays.toString(sonIsim.toArray()) ==>Array'i Stringe cevirir
        //son isim Stream olduğu için önce arraye sonra yazdırabilmek için Stringe çevirdik


    }


    // Task-8 : list elemanlarini son harfine göre siralayıp ilk
    // eleman hariç kalan elemanlari print ediniz.
    public static void snHrfIlkHrfHrc(List<String>isimler){
        isimler.
                stream().//akışa alındı
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                skip(1).
                forEach(t-> System.out.print(t+" "));//Ayse Semih Semih Abdullah Ali Bilal Süleyman Okan Gulsen Zeynep Ebubekir Abdulkadir
    }



    // Task-9 : Karakter sayilari cift olan elemanlarin karakter sayilarinin karelerini hesaplayan;
    // tekrarli olanlari sadece bir kere buyukten kucuge  yazdiran programi yaziniz

    public static void krktrSysCftKrTkrszBykKck(List<String>isimler){
        isimler.
                stream().//akışa alındı
                filter(t->t.length()%2==0).
                map(t->t.length()*t.length()).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.print(t+" "));//100 64 36 16
    }






}//class



