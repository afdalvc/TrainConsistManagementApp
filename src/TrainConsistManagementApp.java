public class TrainConsistManagementApp {

    // Linear Search Method
    public static boolean searchBogie(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                return true; // Match found → stop early
            }
        }

        return false; // No match found after full traversal
    }

    public static void main(String[] args) {

        // Example bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchKey = "BG309";

        System.out.println("Searching for Bogie ID: " + searchKey);

        boolean found = searchBogie(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        // Additional test cases

        // First element match
        System.out.println("\nSearching BG101: " + searchBogie(bogieIds, "BG101"));

        // Last element match
        System.out.println("Searching BG550: " + searchBogie(bogieIds, "BG550"));

        // Not found case
        System.out.println("Searching BG999: " + searchBogie(bogieIds, "BG999"));

        // Single element array
        String[] single = {"BG101"};
        System.out.println("Single array search BG101: " + searchBogie(single, "BG101"));
    }
}