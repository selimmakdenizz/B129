package day26overriding;

public class Cat extends Mammal {

    public void  meow(){
        System.out.println("Cat meow...");
    }

    //Parrent'daki methodu alip degistirerek kullanmaya Ovverrid denir
    @Override   //Annatation'i:Override kurallarının Java tarafından kontrol edilmesini sağlar.
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat...");
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}

