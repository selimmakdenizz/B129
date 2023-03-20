package day28exceptions;

public class C06_Exceptions {
    public static void main(String[] args) {


        //Stringi Integer a ceviriniz;Integer ı character sayısına bölünüz


        double d = divideString("123k");
        double d2 = divideString2(null);
        System.out.println("d2 = " + d2);


    }//main

    public static double divideString(String str) {

        int length = str.length();//NullPointerException
        int length2 = str.length();//NumberFormatException
        int length3 = str.length();//AritmetichException
        int i = 0;
        double sonuc = 0;


        try {
            length = str.length();
            i = Integer.valueOf(str);
            sonuc = i / length;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException verdi:" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException verdi:" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException verdi:" + e.getMessage());

        }
        return sonuc;

    }

    public static double divideString2(String str) {

        int length = str.length();//NullPointerException
        int length2 = str.length();//NumberFormatException
        int length3 = str.length();//AritmetichException
        int i = 0;
        double sonuc = 0;


        try {
            length = str.length();
            i = Integer.valueOf(str);
            sonuc = i / length;

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException verdi:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("911 Exception verdi:" + e.getMessage());

        }
        return sonuc;
    }
}
















