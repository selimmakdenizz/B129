package day05typecastingstringmanipulations;

public class SwapValues {
    //Swap:Yerdeğiştirme

    public static void main(String[] args) {
        int a=12;
        int b=5; // swapten sonra a)5 b=12 yapmak için
        int temp=0;
        System.out.println("a"+a);//12
        System.out.println("b"+b);//5

        //1.yol:
        //1.adım
        temp=a;
        //2.adım
        a=b;
        //3.adım
        b=temp;
        System.out.println("a:"+a);//5
        System.out.println("b"+b);//12

        //2.yol:
        int x=12;
        int y=5;
        x=x+y;//12+5=17
        y=x-y;//17-=12
        x=x-y;//17-12=5

    }
}
