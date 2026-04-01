import java.util.*;

class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            Bogie b2 = new Bogie("AC Chair", 56);
            Bogie b3 = new Bogie("First Class", -10);

            System.out.println(b1.getName() + " - " + b1.getCapacity());
            System.out.println(b2.getName() + " - " + b2.getCapacity());
            System.out.println(b3.getName() + " - " + b3.getCapacity());
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}