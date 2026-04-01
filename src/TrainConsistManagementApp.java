import java.util.*;

class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        List<GoodsBogie> goodsList = new ArrayList<>();

        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Rectangular", "Coal"));
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafe = goodsList.stream()
                .allMatch(b -> !b.getType().equals("Cylindrical") || b.getCargo().equals("Petroleum"));

        System.out.println("Train Safety Compliance: " + isSafe);
    }
}