public class TrainConsistManagementApp {

    public static boolean searchBogie(String[] bogies, String key) {

        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Search not allowed.");
        }

        for (String bogie : bogies) {
            if (bogie.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogies1 = {"BG101", "BG205", "BG309"};

        System.out.println(searchBogie(bogies1, "BG205"));
        System.out.println(searchBogie(bogies1, "BG999"));

        String[] single = {"BG101"};
        System.out.println(searchBogie(single, "BG101"));

        String[] empty = {};

        try {
            System.out.println(searchBogie(empty, "BG101"));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}