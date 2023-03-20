package day11looops;

public class C04_ForLoop {
    public static void main(String[] args) {
        //Example :1 den 100 e kadar 6 ile bölünen hariç tüm sayıları ekrana yazdırın

        for (int i = 1; i <101 ; i++) {
            if (i%6==0){
                continue;//bosver
            }//ıf body
            System.out.print(i+" ");
        }//for body
        System.out.println();


        //Interwiew
        //Size verilen bir Stringi ters ceviren kodu yazınız
        String str="Mustafa";//afatsum
        String ters="";//yeni bir contanier olusturduk
        for (int i = str.length()-1; i >-1 ; i--) {
            char harf=str.charAt(i);
            //ters=ters+harf;
            ters+=harf;
        }
        System.out.println(ters);

    }



    }

