package day05typecastingstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        //1)tum characterleri büyük yapın
        String s="Java is easy";
        String sUpper=s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY
        //2)küçük yapın
        String slower=s.toLowerCase();
        System.out.println(slower);//java is easy

        //ilk characteri alın
        char firstChar=s.charAt(0);
        System.out.println(firstChar);
        //1.yol aynı satırda yazdırmak için
        char secondChar=s.charAt(1);//a
        char secondLastChar=s.charAt(10);//s
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2.yol aynı satırda yazdırmak için
        System.out.println(""+secondChar+secondChar);
        //s stringdeki character sayısını söyle
        int sLength=s.length();
        System.out.println(sLength);
        //ilk 4 character alın
        //substringde ilk dahil ikinci hariçtir
        String sub1=s.substring(0,4);
        System.out.println(sub1);

        String sub2=s.substring(5,7);
        System.out.println(sub2);

        String sub3=s.substring(8,12);
        System.out.println(sub3);

        //bir karakterden baslayıp stringin sonuna kadar almak isterseniz ikinci indexi yazmayınız.
        //s.substring(8,12)yerine s.substring(8) yazınız
        String sub4=s.substring(8);
        System.out.println(sub4);

        boolean isExist=s.contains("Java");
        System.out.println(isExist);
        /*
        bir methodu öğrenirken 3 şeyi mutlaka öğrenin
        i)bu method ne iş yapar?
        ii)bu methodun farklı kullanımları nasıldır?
        iii)bu method size ne return(sonuc) verir.
         */
        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);

        boolean isBegin=s.startsWith("i",5);
        System.out.println(isBegin);
    }
}
