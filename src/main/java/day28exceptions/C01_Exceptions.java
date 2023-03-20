package day28exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

        //compile Time Error == Kodlarin yazim asamasinda olusan hatalardir
// Run Time Error == Kodlari calistirdiktan sonra olusan hata tipi

      //  5)Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.

        /*
        1)NumberFormatException
         */


        //Bir String i alıp int e ceviren kodu yazınız

        String str="123";//happyScenario pozitive Scenario

       int result= convertStringToInteger(str);//stringi integera çevir
        System.out.println("(result+5) = " + (result+5));//128

        String st="123a";//Negative Scenario
       int result2= convertStringToInteger(st);
        System.out.println("result2+10 = " +( result2+10));




    }//main

    private static int convertStringToInteger(String str) {
        int i=0;
        try {
            i=Integer.valueOf(str);
            System.out.println("Burası try Bolumu:"+""+i);//123
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter içeren Stringler Integera çevrilemez");
        }
            return i;

    }
}//class
