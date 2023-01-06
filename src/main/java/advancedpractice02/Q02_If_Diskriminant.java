package advancedpractice02;

import java.util.Scanner;

public class Q02_If_Diskriminant {

    /* Günün sorusu: if statement
      katsayıları verilen 2.dereceden 1 bilinmeyenli denklemin kökleriniz bulunuz.
        ax² + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi alın.
        Diskriminant formülü: (-b +/- karekök(delta)) / (2a)
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("denklemin a,b,c katsayılarını sırsıyla giriniz");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();

        double delta=b*b-4*a*c;
        if (delta>0){
            double x1=(-b+Math.sqrt(delta))/(2*a);
            double x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("denklemin iki kökü vardır:"+"x1:"+x1+"x2:"+x2);
        } else if (delta==0) {
            double x=(-b/(2*a));
            System.out.println("denklemin tek kökü vardır:x="+x);

        }else {
            System.out.println("denklemin kökü yoktur");
        }


    }
}
