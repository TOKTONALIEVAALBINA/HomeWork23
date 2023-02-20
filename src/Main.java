import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        int [] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);
            Arrays.sort(array);
        }
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(0, 2));
            Collections.sort(integers);
        }


        for (int i = 0; i <10; i++) {
            integerList.add(random.nextInt(0,2));
            Collections.sort(integerList);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(integers);
        System.out.println(integerList);
    }
}