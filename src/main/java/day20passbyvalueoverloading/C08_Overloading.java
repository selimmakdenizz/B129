package day20passbyvalueoverloading;

public class C08_Overloading {
    public static void main(String[] args) {

        /*
        AYNI ISIMDE AYNI CLASSTA BIRDEN FAZLA METHOD OLUSTURABILIRMIYIZ?

        Java ayni isimde ayni class'ta birden fazla method oldugunda
        icerisindeki Data type'ina, data sayisina ya da yerlerine gore
        en uygun olani secer.

        Eger bir classta isimleri ayni data typelari
        farkli metodlar olusturursak buna Method Overloading denir.

        Java hangi methodu kullanacagina karar verirken optimizasyina gider.
        En uygun olani en az AutoWidening gerektireni secer.
         */

        /*
        1) Method overloading yaparken method ismi degistirilmez.
        Method ismi degisirse o zaten baska bir method olur.
        2) Method overloading yaparken parametreler degistirilir.
            2.1) Parametre degistirirken parametrelerin data typelari degistirilebilir.
            2.2) Parametre degistirirken parametrelerin yerleri degisebilir.
        (parametrelerin data typelari farkliysa parametrelerin yerini
        degistirmek mantiklidir yoska mantiksiz olur)
            2.3) Parametre degistirirken parametrelerin sayisi degistirilebilir.
          3)Java icin "ismi" ve "parametreleri" ayni olan iki method tamamiyla aynidir.
    Bu yuzden "ismi" ve "parametreleri" "Method Signature" olarak adlandirilir.
  4)Method Overloading olustururken "return type"'i degistirmenin hicbir etkisi yoktur.
    Method Overloading olustururken "access modifier"'i degistirmenin hicbir etkisi yoktur.
    Method Overloading olustururken method'u "static" ya da "non-static" yapmanin hicbir etkisi yoktur.
    Method Overloading olustururken "method body"'i degistirmenin hicbir etkisi yoktur.
    5)"private" method'lar overload edilebilir. Cunku method overloading sadece bir class'in icinde olur.
        "private" olmak ise baska class'lara gidildiginde problem olusturur.
      6)"static" method'lar overload edilebilirler.
         */


        String str = "Java ile güzel Dünya";
        System.out.println(str.substring(2));//va ile güzel Dünya
        System.out.println(str.replace("Java", "**"));//** ile güzel Dünya
        System.out.println(str.replace('J', '*'));//*ava ile güzel Dünya


        topla(3, 5);
        topla(8.6, 5);
        topla(2.4, 6.8);

        //ctr ile topla üzerine tıklayınca hangi toplamı yapacağımız görünüyor.

    }//main

    private static void topla(double a, double b) {
        System.out.println(a + b);

    }

    private static void topla(double a, int b) {
        System.out.println(a + b);
    }


    private static void topla(int a, int b) {
        System.out.println(a + b);

    }


}
