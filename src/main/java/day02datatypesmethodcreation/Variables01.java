package day02datatypesmethodcreation;

public class Variables01 {

    //primitive data types --> char - boolen - byte - short - int - long - float - double
    //float: Virgüllü sayılar(Ondalik Sayilar - Decimal numbers) için kullanılır. (Fiyatlandırmalar - 12.99)
    //double: Virgüllü sayılar(Ondalik Sayilar - Decimal numbers) için kullanılır. (Hücre Ağırlığı: 0.000000000112)

    public static void main(String[] args) {

        //Ornek 1: Gömlek ve ayakkabi fiyatlari için iki tane variable oluşturup toplam fiyatı ekrana yazdırınız.)


        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;

        System.out.println(shirtPrice + shoesPrice);
        System.out.print(shirtPrice);

        System.out.println();

        //Örnek 2: hücre ağırlığı ve Amip'in ağırlığı için 2 tane variable oluştur ve ağırlıkları farkını ekrana yazdırın.

        double weightCell = 0.00000000112;
        double weightAmip = 0.00000000023;

        System.out.println(weightCell-weightAmip);



    }}