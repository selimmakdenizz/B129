package zselimdeneme;

public class varargs {
    public static void main(String[] args) {

        int sayı1=5;
        int sayı2=7;
        int sayı3=2;
        int sayı4=4;
        int sayı5=9;

      sonuc(sayı1,sayı2,sayı3,sayı4,sayı5);


    }

    private static void sonuc(int sayı1,int...toplanacakSayı) {



        int sum=0;
        for (int w:toplanacakSayı) {
            sum+=w;

        }
        System.out.println(sum);
        int sonuc=sum*sayı1;

        System.out.println("sonuc = " + sonuc);
    }
}
