package advancedpractice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleÇıkar {

    //Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
    // list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.


    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        List<Integer>list=new ArrayList<>();

        while (true){
            System.out.println("ekleme yapmak için:'add'\n"+"güncellemek için :'set'\n"+"silmek için:'remove'\n"+"çıkmak için:break'");

          String komut= input.next();
          if (komut.equalsIgnoreCase("add")){
              System.out.println("eklemek istediğiniz tamsayıyı giriniz");
              list.add(input.nextInt());
          } else if (komut.equalsIgnoreCase("set")) {
              System.out.println("güncellemk istediğinz sayıyı giriniz");
              Integer guncellenecekSayı=input.nextInt();
              int güncellenecekIndex=list.indexOf(guncellenecekSayı);

              System.out.println("yerine eklemek istediğiniz sayıyı giriniz ");
              int yeniSayı=input.nextInt();
              list.set(güncellenecekIndex,yeniSayı);
          } else if (komut.equalsIgnoreCase("remove")) {
              System.out.println("silmek istediğiniz sayıyı giriniz");
              Integer silinecekSayı=input.nextInt();
              list.remove(silinecekSayı);

          } else if (komut.equalsIgnoreCase("break")) {
              break;
          }else {
              System.out.println("geçerli komut giriniz");
          }
            System.out.println(list);


        }
        System.out.println("güle güle");
    }







}
