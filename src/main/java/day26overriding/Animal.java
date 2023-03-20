package day26overriding;

public class Animal {

//primitiveler class olmadigindan Overridden'a Object de yazamayiz.
    //Wrapper Class'lar Class oldugu icin Overridden'a Object yazabiliriz.

    public void eat() {//Parent daki override edilmiş eat() method una "Overridden Method" denir.
        System.out.println("Animals eat...");
    }

    public void drink() {
        System.out.println("Animals drink...");
    }


    public Animal create(){
        return  new Animal();
    }

    public int add(int a,int b){
        return a+b;
    }

    public Integer multiply(int a,int b){
        return a*b;
    }
}
