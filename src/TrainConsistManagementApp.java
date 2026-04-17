import java.util.Arrays;

public class TrainConsistManagementApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Requirement: ensure sorted input
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            // Compare using compareTo()
            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                return true; // Found
            }

            if (result < 0) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        // Example 1: Normal case
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String key1 = "BG309";

        System.out.println("Searching: " + key1);
        System.out.println("Found: " + binarySearch(bogieIds, key1));

        // Example 2: Not found
        System.out.println("\nSearching BG999:");
        System.out.println("Found: " + binarySearch(bogieIds, "BG999"));

        // Example 3: First element
        System.out.println("\nSearching BG101:");
        System.out.println("Found: " + binarySearch(bogieIds, "BG101"));

        // Example 4: Last element
        System.out.println("\nSearching BG550:");
        System.out.println("Found: " + binarySearch(bogieIds, "BG550"));

        // Example 5: Single element
        String[] single = {"BG101"};
        System.out.println("\nSingle element search:");
        System.out.println("Found: " + binarySearch(single, "BG101"));

        // Example 6: Empty array
        String[] empty = {};
        System.out.println("\nEmpty array search:");
        System.out.println("Found: " + binarySearch(empty, "BG101"));

        // Example 7: Unsorted input
        String[] unsorted = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        System.out.println("\nUnsorted input search BG205:");
        System.out.println("Found: " + binarySearch(unsorted, "BG205"));
    }
}