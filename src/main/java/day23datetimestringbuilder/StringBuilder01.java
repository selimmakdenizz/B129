package day23datetimestringbuilder;

public class StringBuilder01 {

/*
Java da String , "String Class"  kullaninarak veya "StringBuilder Class" kullanilarak olusturulabilir.
"String Class" kullanilarak urettiginiz String'ler "Immutable"( degistirelemez) dir.
"StringBuilder Class" kullanarak urettiginiz String'ler "Mutable"(Degistirelebilir) dir.
 */


    public static void main(String[] args) {

        //Immutable

        String s = "Java";

        String t = s + "!";

        String w = t + "?";


        //String'i degistirdikten sonra ayni String assign ederseniz, Java yine yeni bir container olusturur,
//degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
//Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.


        String a = "Money";

        a = a + "More";


        //Mutable


        //StringBuilder kullanarak String üretmenin 1.yolu
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println("sb = " + sb1);// Python


        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Python!?.


        //StringBuilder kullanarak String üretmenin 2.yolu
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0
        //StringBuilder kullandiginizda baslangic kapasitesi 16 dir.
        //Kapasite asildiginda varolan kapasite nin 2 katının iki fazlasi kadar varolan kapasiteye ekleme yapilir,
        // 16 ==> 16*2+2       -       34 ==> 34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70

        //StringBuilder kullanarak String uretmenin 3. Yolu:
        StringBuilder sb3 = new StringBuilder(2);


        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6  (2*2+2)

        sb3.insert(2, "XXXXX");//FlXXXXXo
        System.out.println(sb3.length());//9
        System.out.println(sb3);


        //toString() methodu StringBuilder i Stringe çevirir.
        //String Class'ta var olan ama String builder class'ta var olmayan split() methot gibi
        //methotlara ihtiyac duydugumuzda toString() methodunu kullanarak String class'a gecer ve o methotlari
        //kullaniriz


        //stringi tekrar string buıildere çevirir
        sb3.toString().split("l");


        //Reverse() methodu Stringleri ters çevirir.
        sb3.reverse();
        System.out.println(sb3);//oXXXXXlF

        //deletecharat
        sb3.deleteCharAt(0);
        System.out.println(sb3);//XXXXXlF


        //delete(1,6);index 1 deki characterden index 5(6 dahil olmadığı için 5 yazdık)deki
        sb3.delete(1,6);
        System.out.println("sb3 = " + sb3);//sb3 = XF

        StringBuilder sb5 = new StringBuilder("Kava");
        StringBuilder sb6 = new StringBuilder("Java");

        //CompareTo() methodu alfabetik olarak siralar.Aski degerlerine bakarak karsilastirir.
        //Once ilk karaktere , ayniysa 2. karaktere bakar...
        System.out.println(sb5.compareTo(sb6));//-1

        //setChartAt(2,"m");index 2 deki character "i" "m"ye cevirir.
        sb6.setCharAt(2, 'm');
        System.out.println("sb6 = " + sb6);//Jama
        
        sb6.replace(1,3,"xyz");
        System.out.println("sb6 = " + sb6);//Jxyza

        //StringBuilder Class'da kullanmamiza izin verilen substring() method gibi bazi String Class method'lari vardir,
        //bu method'lari StringBuilder ustunde kullaninca StringBuilder'in orijinal degeri degismez
        
        String s7=sb6.substring(1,3);
        System.out.println("s7 = " + s7);//xy
        System.out.println("sb6 = " + sb6);//Jxyza
    }

}
