package day18arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {

        //INTERVIEW Sorusu

//Verilen bir Listteki elemanlari tekrarsiz olarak yazdirma

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        System.out.println("a:"+a);//2, 3, 2, 2, 5]

        List<Integer> yeniList = new ArrayList<>();

        for (Integer w:a) {
            if (!yeniList.contains(w)){
                yeniList.add(w);
            }

        }
        System.out.println("yeniList:"+yeniList);

        //Example 2: Musterinizin istedigi urunun stoklarinizda olup olmadigini
//gosteren kodu yaziniz.
//Stokta varsa o urunu "Ayrildi" ya ceviriniz yoksa o urunu  List'e ekleyiniz
//           [A, K, R, S]  ==> R  ==> [A, K, Ayrildi, S]
//           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]


        Scanner input=new Scanner(System.in);
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        System.out.println(c);//[A, K, R, S]

        String  urun = "";

        do {
            System.out.println("Lutfen Istediginiz Urunun Harfini Giriniz");

            urun=input.next().substring(0,1);
            if (c.contains(urun)){
                c.set(c.indexOf(urun),"Ayrildi");

            } else if (!urun.equals("Q")) {
                c.add(urun);

            }
            System.out.println(c);

        }while (!urun.equals("Q"));

        //Example 2: Musteriden urun ismi aliniz
//           Musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
//           Musterinin ismini verdigi urun listede yoksa "Out of stock" yazdiriniz

        Scanner input1 = new Scanner(System.in);

        List<String> products = new ArrayList<>();

        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");



        do {
            System.out.println("Aradiginiz Urunun Ismini Giriniz : ");
            System.out.println("Urun Aramayi Sonlandirmak Icin Q'ya basiniz");
            String p = input.nextLine();

            if (p.equalsIgnoreCase("Q")){
                break;
            }else if (products.contains(p)){
                System.out.println(p);

            }else if (!products.contains(p)){
                System.out.println("Out of stock!..");
            }

        }while (true);



    }
}
