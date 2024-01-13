import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1,3, 1, 2, 8, 20, 3, 4, 4, 5, 5, 6, 10, 7));
        List<String> strings = new ArrayList<>(List.of("один", "четыре", "два", "четыре", "два", "три", "три", "три", "четыре", "четыре"));
        Service.printOddNumbers(nums);
        System.out.println();
        Service.printEvenNumbers(nums);
        System.out.println();
        Service.printSet(strings);
        System.out.println();
        Service.printNumberOfTakes(strings);
    }
}