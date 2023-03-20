package day31collections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
 1)Interface'lerden object olusturulamaz cunku interface'lerin constructor'i yoktur.
 2)Abstract Class'larda object olusturulamaz,constructor'lari vardir ama constructor object olusturmada kullanilamaz.
 3)Interface'lerin constructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden
 sonra kullanilamaz.
 4)class --> class ==> extends
   class --> interface ==> implements
   interface --> interface ==> extends
   interface-->class==>Bu mümkün değildir.
   5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
 yapilacaksa ArrayList kullanmak tavsiye edilmez.
   6)LinkList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkList
 leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
 durumlarda LinkList kullanmak tavsiye edilir.
 7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
 8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
 bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.
   */


//ArrayList’ler eleman silme ve eleman eklemede basarisizdirlar,
// o yuzden eleman silme ve ekleme  islemleri coklukla yapilacaksa ArrayList kullanmak tavsiye edilmez
////LINLEDLIST ==> Eleman silme-ekleme cok basarilidir. Index kullanmaz.



//LINKEDLIST lerde eleman kelimesi yerine "NODE" denir. LinkedList bas Node manasinda "HEAD", son Node "TAIL" denir



    /*
    LinkedList’ler index kullanmadiklarindan eleman silmede ve eklemede re-index yapilmasina gerek yoktur.
    Bu da LinkedList’leri eleman ekleme ve silmede cok basarili hale getirir.
     Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.
*/
    public static void main(String[] args) {

    LinkedList<String> names=new LinkedList<>();
    names.add("Steve");
    names.add("Carl");
    names.add("Raj");
    names.add("Megan");
    names.add("Brandon");

        System.out.println("names = " + names);//[Steve, Carl, Raj, Megan, Brandon]


        names.addFirst("Cüneyt");//This method(add first) is equivalent to add()
        System.out.println("names = " + names);//[Cüneyt, Steve, Carl, Raj, Megan, Brandon]
        
        names.addLast("Ajda");
        System.out.println("names = " + names);//[Cüneyt, Steve, Carl, Raj, Megan, Brandon, Ajda]

        names.add(3,"Suleyman");
        System.out.println("names = " + names);//[Cüneyt, Steve, Carl, Suleyman, Raj, Megan, Brandon, Ajda]
        
        names.remove("Ajda");//Carl yerine Ajda yazarsak 2 Ajda olur ve silerken ilk Ajda silinir diğeri kalır.
        System.out.println("names = " + names);//[Cüneyt, Steve, Carl, Suleyman, Raj, Megan, Brandon]

        names.remove(5);
        System.out.println("names = " + names);//[Cüneyt, Steve, Carl, Suleyman, Raj, Brandon]
        
        names.add("Suleyman");
        names.add("Suleyman");
        System.out.println("names = " + names);//[Cüneyt, Steve, Carl, Suleyman, Raj, Brandon, Suleyman]

        String r1=names.remove();//Retrieves and removes the head (first element) of this list.
        System.out.println("r1 = " + r1);//Cuneyt
        System.out.println("names = " + names);//[Steve, Carl, Suleyman, Raj, Brandon, Suleyman]
        
        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);//[Steve, Carl, Raj, Brandon, Suleyman]

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);//[Steve, Carl, Raj, Brandon, Suleyman]


        //Retrieves, but does not remove, the head (first element) of this list.
        //Returns:
        //the head of this list, or null if this list is empty

        String r2=names.peek();
        System.out.println("r2 = " + r2);//Steve
        System.out.println(names);//[Steve, Carl, Raj, Brandon, Suleyman]

//remove() ile peek() arasındaki fark ==> remove() ->remove siler ve gosterir   peek()-> gosterir silmez


        //Retrieves and removes the head (first element) of this list.
        //Returns:
        //the head of this list, or null if this list is empty
        names.poll();


        //Pop removes and returns the first element of this list.(Cut + Paste)
        //This method is equivalent to removeFirst().
        names.pop();


    }





}
