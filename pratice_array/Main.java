import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int test[] = { 2, 3, 4, 5, 2, 2, 6, 4, 1, 0, 2, 8 };
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i : test) {
            boolean isDuplicate = false;
            for (Integer n : numbers) {
                if (Integer.valueOf(i) == n) {
                    isDuplicate = true;
                }
            }
            if (!isDuplicate) {
                numbers.add(Integer.valueOf(i));
            }
        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}