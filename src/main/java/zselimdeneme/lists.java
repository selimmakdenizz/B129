package zselimdeneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lists {
    public static void main(String[] args) {


        List<Integer> h = new ArrayList<>(Arrays.asList(10,31,15,13,54,13));

        h.removeIf(x->x==15||x==13);
        System.out.println(h);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.removeIf(n -> n % 2 == 0);











    }
}
