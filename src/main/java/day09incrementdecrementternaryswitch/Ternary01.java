package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {


        //Example 1;
        int a=10;
        int b=20;
        int r1=a<b ? a++ : ++b;
        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20


        //Example 2
        int c=-4;
        int r2=c<0?-1*c:c;
        System.out.println(r2);//4

        //Example 3

        // "Object" Java da butun "Data Type"larinin ortak "Parent"(Baba) idir
        // "Object" in "Parent" i yoktur
        // Farkli data type'lari icin ortak bir variable olusturmak istediginizde, data type olarak object kullanabilirsiniz.
        // Java da "Object", insanlik aleminde "Hz.Adem" e benzer.



        int m=5;
        int n=-6;
       Object r3= (m>0 && n>0)|| (m<0 && n<0) ? m*n:"Farklı işaretli sayıları çarpamıyorum";
        System.out.println(r3);

        //Example 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int  y=-123;

        int r=Math.abs(y);
        String r4= r>99 && r<1000?y+ "üç basamaklı":y+"üç basamaklı değidir";
        System.out.println(r4);




    }
}
