package factory;

public class CandySimpleFactory {
    public static Candy getCandy(CandyType candyType) {
        return switch (candyType) {
            case CRANBERRY -> new CranberryCandy();
            case WATERMELON -> new WatermelonCandy();
            default -> throw new RuntimeException("Candy not available in the store");
        };
    }
}
