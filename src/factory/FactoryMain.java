package factory;

public class FactoryMain {
    public static void main(String[] args) {
        // Simple Factory Pattern
        {
            CandyStore candyStore = new CandyStore();
            candyStore.sellCandyUsingSimpleFactory(CandyType.WATERMELON);
        }

        // Factory Design Pattern
        {
            AbstractCandyStore candyStore = new WatermelonStore();
            candyStore.sellCandy();

            candyStore = new CranberryStore();
            candyStore.sellCandy();
        }
    }
}

class CandyStore {

    // Not the right way to sell candy
    public void sellCandyBadCode(final CandyType candyType) {
        final Candy candy = switch (candyType) {
            case CRANBERRY -> new CranberryCandy();
            case WATERMELON -> new WatermelonCandy();
            default -> throw new RuntimeException("Candy not available in the store");
        };

        System.out.println("Candy: " + candy.getName() + " of sweetness: " + candy.sweetness() + " is sold");
    }

    public void sellCandyUsingSimpleFactory(final CandyType candyType) {
        final Candy candy = CandySimpleFactory.getCandy(candyType);

        System.out.println("Candy: " + candy.getName() + " of sweetness: " + candy.sweetness() + " is sold");
    }

}

abstract class AbstractCandyStore {
    abstract Candy getCandy();

    public void sellCandy() {
        Candy candy = getCandy();
        System.out.println("Candy: " + candy.getName() + " of sweetness: " + candy.sweetness() + " is sold");
    }
}

class CranberryStore extends AbstractCandyStore {

    @Override
    Candy getCandy() {
        return new CranberryCandy();
    }
}

class WatermelonStore extends AbstractCandyStore {

    @Override
    Candy getCandy() {
        return new WatermelonCandy();
    }
}
