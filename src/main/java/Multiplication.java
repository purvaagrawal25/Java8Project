import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Multiplication {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        if (list1.size() == list2.size()) {
            IntStream.range(0, list1.size())
                    .map(i -> list1.get(i) * list2.get(i))
                    .forEach(System.out::println);
        } else {
            System.out.println("length of array list not equal ");
        }
    }
}
