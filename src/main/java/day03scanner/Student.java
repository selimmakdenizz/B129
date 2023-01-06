package day03scanner;

public class Student {
    public String name="Tom Hamks";
    public byte grade=8;
    public String address="Miami";

    public static void main(String[] args) {
        Student tomHanks =new Student();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.address);


        tomHanks.study();
        tomHanks.feed();
    }





    public void study(){
        System.out.println("Gunu gunune ders çaışır");
    }
    public void feed(){
        System.out.println("Sağlıklı beslenir");
    }
}
