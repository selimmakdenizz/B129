package day20passbyvalueoverloading;

public class C01_PassByValue {



/*
     PASS BY VALUE:
     methoda value `nun bir kopyasi gonder demektir
BU nedenle pass by valuada orjinal parametre degismezz. java pass value kullanilir.
java kesinlikle pass referans kullnmaz.
java neden pass by value kullanir:
1:java variablenin orjinal degerini korumak ister
2:java variablein icindeki degerini kopyalar ve methodu icine kopya degerini gonderir
deger uzerinde yapilan degisikler orjinal parametreyi etkilemz.

Pass By Referance 'da ise referans kopyalanir ve method da kullanilior.

Yapilan degisiklik orjinal parametreyi etkiler.

Bu tarz programlar degeri korumak istiyorsa isi developera birakmistir.

Kendisi degeri degistirir

      */
public static void main(String[] args) {


        /*
        Pass By Value : Method'a Value'nun bir kopyasini gonder demektir.
        Bu nedenle Pass by Valuda orjinal parametre degismez.

        Java Pass By Value kullanir.
        1) Java variable'in orjinal degerini korumak ister
        2) Java variable'in icindeki degeri kopyalar ve methodun icine kopya degeri gonderiri.
        Deger uzerinde yapilan degisiklikler orjinal parametreyi etkilemez.

        Pass By Referance'da ise referans kopyalanir ve methodda kullanilir.
        Yapilan degisiklik orjinal parametreyi etkiler.
        Bu tarz programlar degeri korumak istiyorsa isi developer'a birakmistir.
        Kendisi degeri degistirir.


         */

    int gomlek=100;

    System.out.println("gomlek = " + gomlek);//100

    //ogrenciIndirimi(gomlek);
    //System.out.println("gomlek = " + gomlek);//gomlek = 100
    gomlek=ogrenciIndirimi(gomlek);
    System.out.println("atamadan sonraki mainndeki gomlek = " + gomlek);

}//main

    private static int ogrenciIndirimi(int gomlek) {
        int ogrenciGomlegi=gomlek-10;
        System.out.println("ogrenciGomlegi = " + ogrenciGomlegi);//ogrenciGomlegi = 90

        return ogrenciGomlegi;

    }//ogrenciInd Meth
}