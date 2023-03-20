package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {
    /*
    sozluk yapisi map'a benzer
solda kelime, sagda aciklamasi vardir
soldakiler tekrarli olamaz sagda tekrar olabilir
map te boyledir soldakiler Unique (yunik) olacak sag taraf tekrarli olabilir de olmayapilir repeatedly (tekrarli) olabilir
cat = evcil hayvan
dog = evcil hayvan
crocodile = timsah
tiger = kaplan
solda data sagda data
map deyince sozluk akla gelsin
sola unique lere key tekrarli olabilen sagdaki data lara value denir

map te bir data stractir dir
depolarken bu yapiya ihtiyac varsa map kullaniriz
mesela ulkeler ve nufuslarini depolamamiz lazim burda sol unique sag tekrarli olabilir burda map kullaniriz
mesela okul app imiz var ogrencilerin karne ort ni depolayacagiz sol unique sa[ tekrarli olabilir burda map kullanilmalidir
     */

    /*
  1) Map'lerde "USA = 400,000,000" seklinde data depolamamiz gerektiginde kullanilir.
  2) "USA = 400,000,000" datasinin "USA" kismi "key" olarak adlandirilir ve key'ler "unique" dir
  3) "USA = 400,000,000" datasinin "400,000,000" kismi "value" olarak adlandirilir ve value'lar "tekrarli" olabilir.
   4)Map'lerde depoladiginiz her bir data'ya "Entry" denir, "Eleman" denmez.
  5) "HashMap" cok hizlidir cunku "HashMap" ler siralama ile ugrasmazlar.
6) "HashMap" cok hizlidir cunku "HashMap" ler "entry" leri siralamak ile ugrasmazlar.
7) "HashMap" lerde bir tane "key" i "null" yapabilirsiniz.
8) "HashMap" lerde birden fazla "value" yu "null" yapabilirsiniz.
9) "HashMap" ler "multi thread" icin kullanilamaz ve "synchronization" yoktur.
*/

    public static void main(String[] args) {

    //HashMap nasıl oluşturulur?

        HashMap<String,Integer>hm=new HashMap<>();
        System.out.println("hm = " + hm);//{}

        hm.put("USA",400000000);
        hm.put("Germany",85000000);
        hm.put("Albania",3000000);
        //ayni key i kullarak yeni bir "entry" eklerseniz var olan "value"yu update etmis olursunuz
        hm.put("Albania",2800000);
        hm.put(null,120000000);
        hm.put(null,180000000);
        hm.put("Myanmar",null);
        hm.put("Bhutan",null);
        System.out.println("hm = " + hm);//{null=180000000, Myanmar=null, USA=400000000, Bhutan=null, Germany=85000000, Albania=2800000}



        //HashMap'lerde sadece "key" leri almak istiyorum
        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys);//[null, Myanmar, USA, Bhutan, Germany, Albania]

        //HashMap'lerde sadece "value" lari almak istiyorum
        //Example 1: hm map'inde ki ulkelerin toplam nufusunu bulunuz
        Collection<Integer> hmValues = hm.values();
        int sum = 0;

        for (Integer w : hmValues){
            if (w!=null){
                sum = sum + w;
            }
        }
        System.out.println(sum);//503800000




        //HashMap'lerde belirli bir "key" nin "value" sunu nasil alabiliriz?
        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation);// 400000000

        //HashMap'lerde replace() methodu varolan bir "key" nin "value"sunu degistirmek icin kullanilir.
        hm.replace("Bhutan", 35000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=83000000, Albania=2800000}

        hm.putIfAbsent("USA", 700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=83000000, Albania=2800000}

        hm.putIfAbsent("India", 700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=83000000, Albania=2800000, India=700000000}

        //Example 2: Yeni ogretmenin maasi standart ucretten(10000) 1000TL fazla, eski ogretmenin maasi standart ucretten 2000TL fazla olsun
        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Tom";

        if(salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);
        }else {
            salaries.putIfAbsent(teacherName, 11000);
        }
        System.out.println(salaries);

        //replace("USA", 400000000, 500000000) methodu key USA ve value 400000000 is value'u 500000000 yapar
        hm.replace("USA", 400000000, 500000000);
        System.out.println(hm);// {null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=83000000, Albania=2800000, India=700000000}

        //getOrDefault() olan "key" lerin degerini verir, olmayan "key" ler icin de sizin ikinci parametreye yazdiginiz degeri verir.
        Integer r = hm.getOrDefault("Bhutan", 0);
        System.out.println(r);

        //entrySet(); methodu "Map"i "Set"e cevirir.
        //Setlerin methodlarini kullanabilmek icin entrySet(); methodunu kullanarak Map'i Set'e cevirebiliriz
        //Map'i Set'e cevirdigimizde Set'in butun ozelliklerini kullanabiliriz. Mesela loop gibi.
        //entrySet(); method'unu kullandiginizda elde ettiginiz Set'in elemanlari "Map.Entry<String,Integer>" seklinde bir Map olur.
        //Bu yuzden elemanlar icin Map method'lari kullanilabilir.
        Set<Map.Entry<String,Integer>> myEntries = hm.entrySet();
        System.out.println(myEntries);// [null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=83000000, Albania=2800000, India=700000000]

        //Example 3: Ulke ismindeki character sayisini ulke nufusuna ekleyen ve sonucu console yazdiran kodu yaziniz

        //[null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=83000000, Albania=2800000, India=700000000]
        for(Map.Entry<String,Integer> w : myEntries){

            if(w.getValue()!=null && w.getKey()!=null) {
                int toplam = w.getValue() + w.getKey().length();
                System.out.println(toplam);
            }
        }
    }
}











