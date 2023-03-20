package day30exceptionsinterface;

public class Exceptions02 {
    public static void main(String[] args) {

        /*
        // Isim ne kadar genelse o kadar paranttir
//Eger specific bir cozum uretmek istiyorsak ayri ayri exception firlatmak gerek yoksa parenti yazip geceriz
         */
        /*
        /*
        Java'da "Throwable" diye bir Class var.
        Object Class, Throwable'in parent'idir.

        "Throwable" ikiye ayrilir.
            1)  "Error" (Geri donusu olmayan unexpected issues'dur. Error'lar "Handle" edilemezdir.)
                    1.1) OutOfMemoryError // heap dolması
                    1.2) StackOverFlowError//stack memory dolması
                    1.3) VirtualMachineError

            2)  "Exceptions"
                    1.1) RunTimeExceptions (UncheckedExceptions)
                        1.1.1) AritmeticExceptions
                        1.1.2) NullPointerException
                        1.1.3) StringOutOfBoundException
                        1.1.4) NumberFormatException
                        1.1.5) ArrayIndexOutOfBoundException
                        1.1.6) ClassCastException
                        1.1.7) IllegalArgumentException

                    1.2) CompileTimeExceptions (CheckedExceptions)
                        1.1.1) FileNotFoundException
                        1.1.2) IOException


*/


        int a=12;
        int b=2;
        int c[]={3,6,9,12};

        m(c,a,b);

    }

    public static void m(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
