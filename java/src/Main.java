import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 7, 8, 2, 1, 5, 3};
        List<Integer> duplicates = FindDuplicatesInAnArray.duplicates(array, array.length);
        System.out.println("Duplicate elements: " + duplicates);
    }
}

