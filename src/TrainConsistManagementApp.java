import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Example 1: Unsorted bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Using built-in sorting
        Arrays.sort(bogieNames);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Example 2: Unsorted input
        String[] unsorted = {"Luxury", "General", "Sleeper", "AC Chair"};
        Arrays.sort(unsorted);

        // Example 3: Already sorted
        String[] alreadySorted = {"AC Chair", "First Class", "General"};
        Arrays.sort(alreadySorted);

        // Example 4: Duplicate values
        String[] duplicates = {"Sleeper", "AC Chair", "Sleeper", "General"};
        Arrays.sort(duplicates);

        // Example 5: Single element
        String[] single = {"Sleeper"};
        Arrays.sort(single);
    }
}