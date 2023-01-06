package day21statickeyword;

public class Student {

/*
  1)Static variable veya static method'lar (class member) tum objeler icin ortak elemandir.
  2)Static class member'lar uzerinde yapilan tum degisiklikler tum object'leri etkiler.
  3)Static class member'lar Class'a, non-static class member'lar object'lere monte edilir.
    Mesela bir class'dan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur,
    ama static olanlar object sayisindan bagimsiz olarak 1 kez olusturulur.
    4)Static class member'lara ulasmak icin object olusturmaya gerek duyulmaz,ama non-static class member'lara
  ulasmak icin object olusturmak sarttir.
 */



       public static String stdName="Tom Hanks";


        public int age=13;






}
