package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //1)While Loop
        int i = 1;                //while body hiç çalısmadı  while loopta zero execution mumkundur.
        while (i < 1) {
            System.out.println("sen bir while loopsun");
            i++;
        }

        //2.)do while loop
        int k = 1;
        do {
            System.out.println("sen bir do while loopsun");  //do while body çalıştı do while kullandığınızda loop body en az bir kere çalışır
            k++;
        } while (k < 1);


    }
}
