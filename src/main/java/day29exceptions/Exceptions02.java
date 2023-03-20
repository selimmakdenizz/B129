package day29exceptions;

public class Exceptions02 {

    /*
    //throw method body de
//throws body de kullanilmaz methos isminden hemen sonra
//throw tekrar tekrar kullanilabilir
//throws sadece bir defa kullanilir
//throws dan sonra coklu ex yazma hakkim var
//throw dan sonra cons throws dan sonra cons yok class ismi
//throw dan sonra new var throws dan sonra new yok
     */
    /*
    "throw" ile "throws" keyword'leri arasindaki fark nedir?
1)"throw" method body'si icinde, "throws" ise method paranetzinden hemen sonra kullanilir.
2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir,
  "throws" ise method paranetzinden hemen sonra sadece bir kere kullanilabilir.
3)"throw" dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
  "throws" dan sonra sadece Exception Class ismi yazilir
4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra durdurur.
     */




    public static void main(String[] args) {

        try {
            printAge(-18);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            getMark(-25);//Marks can not be less than zero
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    //throw keyword bir method'un body'si içinde istediğimiz yerde istediğimiz koşullar için Exception atmamızı sağlar.
    //"throw" keyword yazildiktan sonra bir Exception Class object'i olusturulur.
//Exception Class constructor'inin parantezi icine istediginiz Exception mesajini yazabilirsiniz.
    public static void printAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age can not ne negative");
        } else {
            System.out.println("age = " + age);
        }


    }

    //Ogrenci notlari girisi yapan ve notu console'a yazdiran bir method olusturunuz


    public static void getMark(double d){
        if (d<0){
            throw new IllegalArgumentException("Marks can not be less than zero");
        } else if (d>100) {
            throw new IllegalArgumentException("Marks can not be less than zero");

        }else {
            System.out.println(d);
        }
    }


}
