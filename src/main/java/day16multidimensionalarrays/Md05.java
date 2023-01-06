package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {

//Example 1: Bir integer multi-dimensional array olusturunuz
//           Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz


        int a[][]={{1},{1,2},{3,4,5},{6}};

       int çarpım=1;
        for (int[] w:a) {
            for (int k:w) {
                çarpım=çarpım*k;

            }
            
        }
        System.out.println(çarpım);














    }
}
