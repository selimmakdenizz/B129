package day20passbyvalueoverloading;

public class C09_PassByValue {
    public static void main(String[] args) {

        String name = "Tom Hanks";

        String updatedName=updateName(name,"Jr");

        System.out.println("name = " + name);//Tom Hanks        bu aslı
        System.out.println(updatedName);//Tom Hanks Jr          bu kopyası
        
        
        name=updateName(name,"Jr");
        System.out.println("updatedName = " + updatedName);
    }

    public static String updateName(String name, String add) {

        name = name + " " + add;

        return name;

    }
}
