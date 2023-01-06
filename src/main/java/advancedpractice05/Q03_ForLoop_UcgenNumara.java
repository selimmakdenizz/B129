package advancedpractice05;

public class Q03_ForLoop_UcgenNumara {

   /*

   Şekli Yazdırınız:
          1 2 3 4 5 6
           2 3 4 5 6
            3 4 5 6
             4 5 6
              5 6
               6
    */
   public static void main(String[] args) {

       for (int i = 1; i <=6 ; i++) {
           for (int boşluk=1; boşluk <i ; boşluk++) {//boşluk kontrol
               System.out.print(" ");

           }
           for (int j = i; j <=6 ; j++) {//sütün kontrolü
               System.out.print(j+ " ");
           }

           System.out.println();//satır kontrolü
       }



   }
}
