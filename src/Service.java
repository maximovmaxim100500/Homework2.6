import java.util.*;

public class Service {
    public static void printOddNumbers(List<Integer> list) {
        for (Integer num : list) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void printEvenNumbers(List<Integer> list) {
        Collections.sort(list);
        Set<Integer> uniqueSet = new LinkedHashSet<>(list);
        for (Integer num : uniqueSet) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void printSet(List<String> strings) {
        Set<String> uniqueSet = new LinkedHashSet<>(strings);
        for (String word : uniqueSet) {
            System.out.print(word + " ");
        }
    }

    public static void printNumberOfTakes(List<String> strings) {
        Map<String, Integer> numbersMap = new HashMap<>();
        for (String numberOfTakes : strings) {
            int count = Collections.frequency(strings, numberOfTakes);
            numbersMap.put(numberOfTakes, count);
        }
        for (Integer i : numbersMap.values()) {
            System.out.println(i);
        }
    }
}
