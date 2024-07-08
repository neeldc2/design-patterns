package factory;

public class WatermelonCandy implements Candy {
    @Override
    public String getName() {
        return "Watermelon";
    }

    @Override
    public Integer sweetness() {
        return 3;
    }
}
