package advancedpractice08;

public class Q05_Inheritance {


    //Dairenin alanını hesalayan bir method oluşturunuz.(matematik işlemleri için inheritance kullanınız)


    public static void main(String[] args) {

        daireAlanı(5);

    }

    static void  daireAlanı(int r){
        Daire daireObjesi=new  Daire();
        System.out.println(daireObjesi.carpma(daireObjesi.piSayısı,daireObjesi.karesiniAl(r)));
    }

}





