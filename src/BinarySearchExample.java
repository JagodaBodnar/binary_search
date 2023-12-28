import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) throws ValueNotFoundException {

        List<Integer> sortedList = List.of(6);
        BinarySearch binarySearch = new BinarySearch(sortedList);
        System.out.printf("Original list %s. Number to find 6, index of that number in array: %d%n", sortedList, binarySearch.indexOf(6));

        sortedList = List.of(1, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 634);
        binarySearch = new BinarySearch(sortedList);
        System.out.printf("Original list %s. Number to find 144, index of that number in array: %d%n", sortedList, binarySearch.indexOf(144));

        sortedList = List.of(1, 3, 4, 6, 8, 9, 11);
        binarySearch = new BinarySearch(sortedList);
        System.out.printf("Original list %s. Number to find 11, index of that number in array: %d%n", sortedList, binarySearch.indexOf(11));

        sortedList = List.of(1, 3, 4, 6, 8, 9, 11);
        binarySearch = new BinarySearch(sortedList);
        System.out.printf("Original list %s. Number to find 6, index of that number in array: %d%n", sortedList, binarySearch.indexOf(6));

        sortedList = List.of(1, 3, 4, 6, 8, 9, 11);
        binarySearch = new BinarySearch(sortedList);
        System.out.printf("Original list %s. Number to find 1, index of that number in array: %d%n", sortedList, binarySearch.indexOf(1));
        System.out.printf("Original list %s. Number to find 0, index of that number in array: %d%n", sortedList, binarySearch.indexOf(0));
    }
}
