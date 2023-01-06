package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Example 1)bir stringin bas ve sonunda space characteri varsa siliniz


        String s="   ALİ Can  ";
        System.out.println(s);

        //Trim methodu bir stringin bas ve sonundaki space characterleri siler,aradaki space e dokunmaz.
        String sTrimmed=s.trim();


        System.out.println(sTrimmed);
        //Example 2) aşagıda fiyatları verilen ürünlerin toplam fiyatını bulunuz
        // String tv=$456.99   laptop=$875,99
        String tv1="$456.99";
        String laptop1="$875.99";

        String tv2=tv1.replace("$","");
        System.out.println(tv2);//456.99

        String laptop2=laptop1.replace("$","");
        System.out.println(laptop2);//875.99

       Double totalPrice= Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98

        //Example 3) Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdırın.
        String name="  ali Can  ";




        char first=name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A


        char second=name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);//C

        System.out.println(""+first+second);//AC

        //Ecample 4) bir stringin  boş string kontrol eden kodu yazınız

        String str="";
        //1.yol.length kullan
       boolean result1= str.length()==0;
        System.out.println("String boş mu?"+result1);
        //2.yol java bir konuda method üretmişse o methodu kullanmak en iyisi.
        boolean result2=str.isEmpty();
        System.out.println("String boş mu?"+result2);
        //Example 5: bir stringin space hariç hiç bir karakter içermediğini kontrol eden kodu yazın

        String t="     ";
        //1.yol
        boolean result3=t.replace(" ","").length()==0;
        System.out.println("sadece space mi var?"+result3);

        //2.yol
        boolean result4=t.replace(" ","").isEmpty();
        System.out.println("Sadece space mi var?"+result4);

        //3,yol
        //isblank methodu sadece space içeren stringlermiçin true verir,space dışında bir character içerirse false verir.
        //isblank methodu bos stringler için true verir
        //is blank==> space+hiç birşey için true        isEmpty==>hiçbirşey için true
        boolean result5=t.isBlank();
        System.out.println("Sadece space mi var?"+result5);

        //Example 6:Bir stringde a,e,i characterlerinin ilk görünümlerinin indexleri toplamını yazdırın
        String r="java is easy to learn";

        int idxA=r.indexOf('a');
        System.out.println(idxA);//1
        int idxI=r.indexOf('i');
        System.out.println(idxI);//5

        int idxE=r.indexOf('e');
        System.out.println(idxE);//8
        System.out.println("indexler toplamı"+(idxA+idxI+idxE));

        //Example 7)bir stringde java kelimesinin ilk kaçıncı indexde kullanıldığını gösteren kodu yazınız
        // Ah Java vah Java sensiz olmuyor Java.

        String u="Ah Java vah Java sensiz olmuyor Java ";
        //indexOf("Java") kullanımında siz Java kelimesinin ilk görünümdeki ilk harfin (J )nin indexini almış olursunuz
        int idxJava=u.indexOf("Java");
        System.out.println(idxJava);//3

        //index of methodu olmayan characterler için kullanılırsa her zaman -1 verir.
        int idxOfXyz=u.indexOf("xyz");
        System.out.println(idxOfXyz);//-1

        //example 8 :bir stringde a,i,e characterlerinin son görünümlerinin indexleri toplamını yazdırın
        //Java is easy to learn"
        String v="Java is easy to learn";
        int idxOfA=v.lastIndexOf('a');
        System.out.println(idxOfA);//18

        int idxOfE=v.lastIndexOf('e');//17
        System.out.println(idxOfE);

        int idxOfI=v.lastIndexOf('i');
        System.out.println(idxOfI);//5
        System.out.println(idxOfA+idxOfE+idxOfI);//40

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir

        //Example 9: Bir String'deki tekrarsiz karakterleri ekrana yazdiriniz
//    abbccdc ==> ad
        String y = "aac";

        char ch1 = y.charAt(0);

        if (y.indexOf(ch1)==y.lastIndexOf(ch1)) {
            System.out.println(ch1);//c
        }

        char ch2 = y.charAt(1);
        if (y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);//c
        }

        char ch3 = y.charAt(2);
        if (y.indexOf(ch3)==y.lastIndexOf(ch3)) {
            System.out.println(ch3);//C

        }





        //Note: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
         //if you study hard, you will learn Java.

           //Example 10 sayı pozitif ise ekrana pozitif yazdırın
        int num=12;


        if(num>0){
            System.out.println("pozitif");

            //Example 11 sayı -1 ile 10 arasında ise ekrana rakam yazdrın
            int number=3;
            if(number>-1&&number<10){
                System.out.println("Rakam");

            }
            }
        //Example 12: Sayi uc basamakli ise ekrana "Wooow!" yazdirin.
        int n=-123;
        n=Math.abs(n);
        Math.abs(n);
        if(n>99&&n<1000){
            System.out.println("Woow");

        }
    }
}
