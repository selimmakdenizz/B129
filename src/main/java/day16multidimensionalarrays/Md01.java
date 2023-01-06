package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
//MultiDimensional Array nasil olusturulur?
        int a[][] = new int[3][2];

//MultiDimensional Array'ler nasil yazdirilir?
        System.out.println(Arrays.deepToString(a)); //[[0, 0], [0, 0], [0, 0]]

//Note: Array'lere non-primitive data konulamaz.
//      Array'lere primitive data veya reference konulur.
//      Ama siz bir array'i yazdirmak istediginizde Java adres'ler yardimi ile non-primitive data'ya ulasir
//      ve o non-primitive data'yi sanki array'in icindeymis gibi gosterir.

        //MultiDimensional Array'lerde ki belli elemanlara nasil ulasilir?
        System.out.println(Arrays.toString(a[2]));//[123, 0]
        System.out.println((a[1][0]));//81
        //MultiDimensional Array'lerde ki belli elemanlara nasil ulasilir?
        System.out.println(Arrays.toString(a[2]));//[123, 0]
        System.out.println(a[1][0]);//81
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(a[2][1]);//0

    }
}
