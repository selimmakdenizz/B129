package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive:char,boolean,byte,short,int,double,float,long
        //Wrapper Class:Character-Boolean-Byte-Short-Integer-Long-Float-Double
        //Wrapper Classlar non primitivedir.O yüzden memoryde cok yer kaplarlar.O yüzden şart degilse wrapper class kullanmayı tercih etmeyiz

        int n=12;//"n"yazıp nokta koyarsanız hiç method göremezsiniz.çünkü primitiveler method içermez.
        Integer m=12;//"m" yazıp nokta koyarsanız birçok methos görürsünüz.çünkü wrapper classlar method içerir.

        byte p=23;
        Byte r=43;



        //example 1) short data type nin max ve min değerlerini kod yazarak bulun

        short maxShort=Short.MAX_VALUE;
        System.out.println(maxShort);
        short minShort=Short.MIN_VALUE;
        System.out.println(minShort);
        //Example 2
        int intMin=Integer.MIN_VALUE;
        byte byteMax=Byte.MAX_VALUE;


        System.out.println(intMin+byteMax);

        //Example 3 primitive int i wrapper int e cevir.(Auotoboxing)
        int num=22;
        Integer wrapperNum=num;
        System.out.println(wrapperNum);

        //example 3,2 wrapperı primitive cevir(Unboxing)

        Byte k=43;
        byte primitiveK=k;
        System.out.println(primitiveK);

        //Example 4 primitive charı Wrapper charactre cevir
        //4,2 wrapper booleanı primitive booleana cevir

        char initial='S';
        Character initialWrapper=initial;
        System.out.println(initialWrapper);

        Boolean is01d=true;
        boolean is01dWrapper=is01d;
        //exaample 5
        String shirt="2300";
        String shoes="5200";
        //javada + sembolu 2 sayı arasında kullanılırsa toplama işlemi olur.
        //avada + sembolu 2 string arasında veya bir string bir sayı arasında kullanılırsa concatenation (birleşme)olur.
        // concetenation işlemlerinde java matematikteki işlem önceliği kurallarını kullanılır.

        System.out.println(shirt+shoes);
        int toplamFiyat=Integer.valueOf(shirt)+Integer.valueOf(shoes);
        System.out.println(toplamFiyat);

        //example 6
        //note:value of metodu tüm karakterleri rakam  olan stringleri sayılara çevirir.
        //Eğer valueof metodu kullanırken stringin içime rakam olmayan bir karakter koyarsanız hata alırsınız.ilerde öğrencez.
        String tv="$11000";
        String radio="$3000";
        System.out.println(tv+radio);
        int totalPrice=Integer.valueOf(tv)+Integer.valueOf(radio);






    }
}
