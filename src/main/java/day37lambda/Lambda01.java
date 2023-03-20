package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer>myList=new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));//60
        System.out.println(getSumFromSevenToSeventy());//2464
        System.out.println(getMultiplicationFromThreeToNine1());//181440
        System.out.println(getMultiplicationFromThreeToNine2());//181440
        System.out.println(getFactorial(5)); //120
        System.out.println(getSumOfEvensBetweenTwoInt(5, 14));//36
        System.out.println(getSumOfDigitsBetweenTwoInts(12, 18));//30
    }

    //Example 1: Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.
    public static int getSumOfAllElements(List<Integer>myList){
      return   myList.stream().reduce(Math::addExact).get();///60
        // /Math::addExact :Matematik Class'ina git,topla tam olarak
    }

    //Example 2: 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.

    public static int getSumFromSevenToSeventy(){
      return   IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }
    //rangeClosed==> baslangis ve bitis araligi veriyor
    //Intstream==> integerlari yukardan asagi diziyor.


    //Example 3: 3'den 9' a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    public static int getMultiplicationFromThreeToNine1 (){
        return  IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }

        //2.yol  //range(a,b)==> a dahil,b dahil degil

    //Integer class'i Math class'i kadar zengin degil ornegin multiply method'u yok, o yuzden genellikle Math class'in method'larini kullaniyoruz.
    public static int getMultiplicationFromThreeToNine2 (){
        return  IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();
    }
         //Note: Her zaman bize verilen list ile islem yapamayabiliriz
        //      Bunun icin IntStream methodunu kullaniriz.
        //      rangeClosed(startInclusive, endInclusive) methodu bize
        //      baslangıc ve bitis degeri kapsayan degiskenlerle islem yapmamızı saglar


//     Example4)    Size verilen sayının faktöriyelini hesaplayan kodu yazınız
    public static int getFactorial(int x){

        if (x==0){
            return 1;
        } else if (x<0) {
            System.out.println("Faktöriyel işlemi negatif sayılarla yapılamaz");
            return -1;

        }else
        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
    }
    //5) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.

    public static int getSumOfEvensBetweenTwoInt(int a,int b){
        if (a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return IntStream.range(a+1,b).filter(Utils::isNumberEven).sum();
    }

    //Example 6:Size verilen iki tamsayi arasindaki tum tamsayilarin rakamlari toplamini veren kodu yaziniz.
// 12 ve 18 ==> 13 14 15 16 17 ==> 4+5+6+7+8 = 30
    public static int getSumOfDigitsBetweenTwoInts(int a,int b){
        if (a>b){
            int temp=a;
            a=b;
            b=temp;
        }

        return IntStream.range(a+1,b).map(Utils::getSumOfDigits).sum();
    }
}
