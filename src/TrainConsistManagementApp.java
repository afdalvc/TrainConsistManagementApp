public class TrainConsistManagementApp {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            // Flag to check if any swap happens (optimization)
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to display array
    public static void display(int[] capacities) {
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Example 1: Unsorted array
        int[] bogieCapacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        display(bogieCapacities);

        bubbleSort(bogieCapacities);

        System.out.println("After Sorting:");
        display(bogieCapacities);

        // Example 2: Already sorted
        int[] sortedArray = {24, 56, 60, 70, 72};
        bubbleSort(sortedArray);

        // Example 3: Duplicate values
        int[] duplicateArray = {72, 56, 56, 24};
        bubbleSort(duplicateArray);

        // Example 4: Single element
        int[] singleElement = {50};
        bubbleSort(singleElement);

        // Example 5: All equal values
        int[] equalValues = {40, 40, 40};
        bubbleSort(equalValues);
    }
}