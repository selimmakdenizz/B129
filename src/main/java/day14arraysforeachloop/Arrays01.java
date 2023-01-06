package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
//           icerdigi karakter sayilari toplamini ekrana yazdiriniz.
        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]
        System.out.println(arr[0].length() + arr[arr.length-1].length());//7

//Example 2: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
//             icerdigi karakter sayilari toplamini ekrana yazdiriniz.
        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Atina";


        int totalchar=0;
        for (int i = 0; i <brr.length ; i++) {
            totalchar=totalchar+ brr[i].length();

        }
        System.out.println(totalchar);

        //2.YOL
// for-each-loop (enhanced loop)
// for-each-loop==> baslangic degeri, incremeent-decerement sarti ve loop'un calisma
//sartini kendi halleder
//for-each-loop==> en kullanisli loop
//ama bazen onu kullanamayacagimiz durumlar var
// for-each-loop arrays'lerde ve collection'larda kullanilir
// bir arrays ile calisiyorsan ilk tercihin for-each-loop olmali
// indeks kullanman gerektiginde for-each-loop caresiz kalir
// mecburen diger loop'lari kullanirsin
        int sum=0;
        for (String w:brr
             ) {sum=sum+w.length();

        }
        System.out.println(sum);



        }













    }

