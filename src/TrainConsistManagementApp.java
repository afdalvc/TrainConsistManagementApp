class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;   // Rectangular or Cylindrical
    private String cargo;   // Assigned cargo

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            // Validation
            if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be loaded in Rectangular bogie.");
            }

            // Safe assignment
            this.cargo = cargoType;
            System.out.println("Cargo '" + cargoType + "' assigned to " + shape + " bogie successfully.");

        } catch (CargoSafetyException e) {
            // Handle exception gracefully
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    public String getCargo() {
        return cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Safe case
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");   // ✅ Allowed

        // Unsafe case
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");   // ❌ Should trigger exception

        // Another safe case to prove program continues
        GoodsBogie bogie3 = new GoodsBogie("Rectangular");
        bogie3.assignCargo("Coal");        // ✅ Allowed
    }
}