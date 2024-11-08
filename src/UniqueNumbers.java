import java.util.*;

public class UniqueNumbers {

    public static <T> Collection<T> findUniqueNumbers(Collection<T> numbers) {
        Set<T> uniqueNumbersSet = new LinkedHashSet<>(numbers);

        return uniqueNumbersSet;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers)) {
            System.out.println(number);
        }
    }

    public static <T> Collection<T> findUniqueNumbers(T[] numbers) {
        return findUniqueNumbers(Arrays.asList(numbers));
    }
//    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
//    }
//
//    public static void main(String[] args) {
//        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
//        for (int number : findUniqueNumbers(numbers))
//            System.out.println(number);
//    }
//
//    public static List<Integer> findUniqueNumbers(int[] numbers) {
//        List<Integer> uniqueNumbersList = new ArrayList<>();
//        Set<Integer> uniqueNumbersSet = new HashSet<>();
//
//        for (int num : numbers) {
//            if (uniqueNumbersSet.add(num)) {
//                uniqueNumbersList.add(num);
//            }
//        }
//
//        return uniqueNumbersList;
}


