package advancedpractice01;

import java.util.Scanner;

public class Q06_WhileLoop_IlkVeSonRakam {
    //Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı girin");
        int sayı=input.nextInt();


        //1.yol
        int sonRakam=sayı%10;
        System.out.println("sonRakam="+sonRakam);
        int ilkRakam=sayı;
        while (ilkRakam>9){
            ilkRakam/=10;
        }
        System.out.println("ilkRakam="+ilkRakam);
        System.out.println("toplam:"+(ilkRakam+sonRakam));

        //2.yol
        String sayıString=String.valueOf(sayı);
        int strIlkRakam=Integer.parseInt(sayıString.substring(0,1));
        int strSonRakam=Integer.parseInt(sayıString.substring(sayıString.length()-1));
        System.out.println("toplam;"+(strSonRakam+strIlkRakam));













    }
}
