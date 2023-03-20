package day24accessmodifiersinheritiance;

public class Fish {

    public int gram=10;
    public String renk="gri";

    public void eat(){

        System.out.println("Balıklar yosun yer");
    }

    public Fish(int gram) {

        this.gram = gram;
    }//constructor


    public Fish() {

        System.out.println("Balıklar yüzer");
    }

    public Fish(int gram, String renk) {
        this.gram = gram;
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gram=" + gram +
                ", renk='" + renk + '\'' +
                '}';
    }
}
