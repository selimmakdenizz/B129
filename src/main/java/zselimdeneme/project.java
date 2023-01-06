package zselimdeneme;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class project {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> sepet = new ArrayList<>();
        System.out.println("lütfen  geçmek istediğinizi bölümün numarasını giriniz:\n" +
                "Manav için 1\n" +
                "Şarküteri için 2\n" +
                "Market için 3\n");


        int komut = input.nextInt();
        double toplamFiyat =0;

        if (komut == 1) {
            System.out.println(
                    "Sepete eklemek istediğiniz ürünü seçiniz: \n" +
                            "Ürün No\tUrun\t\tFiyat\n" +
                            "00\t\t\tDomates\t\t2.10 TL\n" +
                            "01\t\t\tPatates\t\t3.20 TL\n" +
                            "02\t\t\tBiber\t\t1.50 TL\n" +
                            "03\t\t\tSoğan\t\t2.30 TL\n" +
                            "04\t\t\tHavuç\t\t3.10 TL\n" +
                            "05\t\t\tElma\t\t1.20 TL\n" +
                            "06\t\t\tMuz\t\t\t1.90 TL\n" +
                            "07\t\t\tÇilek\t\t6.10 TL\n" +
                            "08\t\t\tKavun\t\t4.30 TL\n" +
                            "09\t\t\tÜzüm\t\t2.70 TL\n" +
                            "10\t\t\tLimon\t\t0.50 TL");

            List<String> vgtb = new ArrayList<>(11);
            vgtb.add("domates");
            vgtb.add("Patates");
            vgtb.add("biber");
            vgtb.add("soğan");
            vgtb.add("havuç");
            vgtb.add("elma");
            vgtb.add("muz");
            vgtb.add("çilek");
            vgtb.add("kavun");
            vgtb.add("üzüm");
            vgtb.add("limon");
            System.out.print(vgtb);


            List<String> prices = new ArrayList<>(11);

            prices.add("2.10");
            prices.add("3.20");
            prices.add("1.50");
            prices.add("2.30");
            prices.add("3.10");
            prices.add("1.20");
            prices.add("1.90");
            prices.add("6.10");
            prices.add("4.30");
            prices.add("2.70");
            prices.add("0.50");
            System.out.println();
            System.out.print(prices);
        }else
            System.out.println("lütfen gecerli numarayı giriniz");


        System.out.println("lütfen almak istediğiniz ürün numarasını giriniz");

        int urunNo=0;
        double urunKg=0;
        if (urunNo==00){
            System.out.println("domates");
        }



        }







    }
