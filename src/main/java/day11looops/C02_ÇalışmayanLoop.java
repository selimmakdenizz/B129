package day11looops;

public class C02_ÇalışmayanLoop {

    public static void main(String[] args) {


        for (int i=0;i>10;i++){
            System.out.println(i);

        }

        //Note: bazı looplar hiç çalışmayabiilir
        for (int i = 1; i <0 ; i--) {
            System.out.println("hi!");//zero execution

        }

        //Note 2: Bazi loop'lar sonsuz defa calisabilir.
//        Bu tarz loop'lara "Infinite (Sonsuz) Loop" denir.
//        "Infinit (Sonsuz) Loop" genellikle "increment/decrement" kisminda yapilan hatadan kaynaklanir.
        //Note 3: Baska bir "Infinite(Sonsuz) Loop"
        //        Lloop olusturdugunuzda "ikinci kismi" yazmazsaniz "Infinite(Sonsuz) Loop" olur
//        for(int i=1;      ;i++){
//            System.out.println("Hi!");


            for (int i=1; i<10; i--){
            System.out.println("Java is money...");
        }










    }










}
