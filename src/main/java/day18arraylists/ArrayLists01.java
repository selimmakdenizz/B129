package day18arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        //1)arraylist nasil olusturulur?//


        List<Integer> nums=new ArrayList<>();


        //Arraylistler nasil yazdirilir?

        System.out.println(nums);//[]
        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);
        System.out.println("nums:"+nums);//[37, 38, 39, 40, 41, 42]

        //3)Array Listin boş olup olmadığını nasıl anlarız

        boolean bosmu1 = nums.isEmpty();
        System.out.println("bosmu1 = " + bosmu1);//false

        List <Integer> ages = new ArrayList<>();
        boolean bosmu2 = ages.isEmpty();
        System.out.println("bosmu2 = " + bosmu2);//bosmu2 = true

        //Example 1: nums ArrayList'indeki tum tek sayilari 11
        // artirdiktan sonra ekrana yazdiriniz

        int toplam=0;
        for (int w:nums) {
            if (w%2==1){
                nums.set(nums.indexOf(w),w+11);
            
        }

        }//for
        System.out.println("nums:"+nums);
        //2.yol
        for (int i=0;i<nums.size();i++){

            int element=nums.get(i);
            if (element==7){
                continue;
            }nums.set(i,element+3);
        } System.out.println("2.yol:"+nums);//[51, 41, 53, 43, 55, 45]


/*
            nums.indexOf(w) ilk gorunumun index'ini verir. List tekrarli elemana sahip ise
            nums.indexOf(w) kullanimi risk olusturabilir. Bu yuzden bu soruda en guvenli yol "for-loop" tur.
         */



        nums.add(52);
        nums.add(36);
        nums.add(52);

        //Listlerden eleman nasıl silinir

        //Ex:num arraylistinden 52 rakamnının görünümünü siliniz

       // System.out.println("nums:"+nums);//48,38,50,40,52,42,52,36,52



        /*
remove methodunun icerisine tam sayi yazarsaniz java bunu
index kabul eder.silinecek eleman olarak algilamaz.
        Tüm tamsayılar aksi belirtilmedikçe primitive intdir.
         Primitive Data Type'lari da ArrayList'lerin elemani olamazlar
        Primitive Data Type'larini Wrapper class'a cevirmeliyiz
 */

    Integer sayı=52;
    nums.remove(sayı);
        System.out.println("nums:"+nums);



        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println("names = " + names); //names = [Tom, Thomas, Tahsin, Trump, Taceddin]
        List<String> emekliOlacaklar = new ArrayList<>();
        emekliOlacaklar.add("Thomas");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");

        names.removeAll(emekliOlacaklar);
        System.out.println("emekliOlacaklar = " + emekliOlacaklar);//emekliOlacaklar = [Thomas, Tahsin, Trump]
        System.out.println("names = " + names);  //names = [Tom, Taceddin]

// Ex : a Listesindeki shoes elemaninin ilk gorunumunu siliniz
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println("a:"+a);//Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]
        a.remove("Shoes");
        System.out.println(a);

        //5) ArrayListimizde coklu datanin olup olmadigini nasil gosteririz?
// containsAll() : Bir listin icinde coklu elemanin var olup olmadigini kontrol eder
// Hepsi varsa true; en az bir tanesi yoksa false verir.


        List<String> myNames = new ArrayList<>();
        myNames .add("Burcu");
        myNames .add("Can");
        myNames .add("Zişan");
        myNames .add("Emre");
        myNames .add("Bilal");
        myNames .add("Gül");
        System.out.println(myNames);//[Burcu, Can, Zişan, Emre, Bilal, Gül]

        List<String> varMı = new ArrayList<>();
        varMı.add("Burcu");
        varMı.add("Gül");
        varMı.add("Can");
        System.out.println("varmı:"+varMı);

        boolean sonuc=myNames.containsAll(varMı);
        System.out.println("sonuç:"+sonuc);





        //names.subList(1,4) "names" Listindeki index'in 1, 2 ve 3 olan
// elemanlari bir List'in icinde size verir.
// Ikinci index olan 4 dahil olmaz.


        //List<String> sublist = names.subList(1,3);
        //System.out.println(sublist);


        //Example 1: Elektronik aletler ve ev aletleri listleriniz var.
//            Elektronik ev aletlerini listeleyiniz

        List<String> electronics = new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

//homeGoods.retainAll(electronics) homeGoods ile electronics list'lerinin ortak elemanlarini homeGoods listi icinde verir
// .
        homeGoods.retainAll(electronics);

        System.out.println(homeGoods);// [Radio, TV]


// names.isEmpty()==> bu method list'te hic eleman yoksa "true" verir
// bir veya daha fazla eleman varsa size "false" verir
//isEmpty()==> esasinda "names.size()==0" demektir
// ikisi ayni isi yapiyor ama java da bir sey icin ozel method varsa onu kullan
// cunku burda "names.size()==0" java yi iki kere yoruyor, hem esitligi olcuyor
// hem size'i olcuyor








    }
}
