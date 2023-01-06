package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {

    /*
    //note 1 )int/int ==>int olur
    //note 2) double/int ==>int olur.çünkü javada matematiksel işlemlerde farklı data typleri kullanılırsa sonuc büyükdata typeında olur.
    javada logical operatolar vardır.
    AND VE OR işlemleri logical operatorlardır.



   */
    public static void main(String[] args) {
    boolean first=3<5;
    boolean second=2+3!=5;
    boolean third=2+3*5>=19;
        System.out.println(first+" - "+second+" -"+third);
        System.out.println(first&&second);
        System.out.println(first||second||third);




    }
}
