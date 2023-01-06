package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {

        int a=5;
        System.out.println(a);

        //Increment 1
        a=a+2;//veya a+=2;
        System.out.println(a);//7
        //EX 1)

        int b=6;
        System.out.println(b);//6

        b=b+5;
        System.out.println(b);//11

        b+=5;
        System.out.println(b);//16

        //Decrement 1

        int c=8;
        c=c-3;
        System.out.println(c);//5

        c-=3;
        System.out.println(c);//2

        //Increment 2
        int d=6;
        System.out.println(d);//6
        d=d*2;
        System.out.println(d);//12


        d*=2;
        System.out.println(d);//24


        //Decrement 2
        int e=24;
        System.out.println(e);//24
        e=e/2;
        System.out.println(e);//12

        e/=2;
        System.out.println(e);//6

        //1 ile increment ve decrement
        int f=12;
        System.out.println(f);//12
        f=f+1;
        f+=1;
        f++;
        System.out.println(f);//15

        int h=10;
        System.out.println(h);//10
        h=h-1;
        h-=1;
        System.out.println(h);//8

        //post- ıncrement ve pre-increment
        int i=10;
        int k=i++;// post increment cunku increment variablein isminden sonra yazıldı
        System.out.println(k);//10
        System.out.println(i);//11
        int m=15;
        int n=++m;//pre-increment cünkü increent variablein isminden önce yazıldı
        System.out.println(m);//16  "m" satir sonunda artirildigi icin "m" nin degeri 16 olur.
        System.out.println(n);// 16 ==> "m" artirildiktan sonra "n" ye konuldugu icin "n" nin degeri 16 olur.

        //post decrement ve pre decrement
        int p=17;
        int r=p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s=20;
        int t=--s;
        System.out.println(s);//19
        System.out.println(t);//19



    }
}
