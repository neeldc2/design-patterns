package abstractfactory;

import factory.Candy;
import factory.CranberryCandy;
import factory.WatermelonCandy;

public class AbstractFactoryMain {
    public static void main(String[] args) {

    }
}

abstract class AbstractCandyStore {
    abstract Candy getCandy();
    abstract Wrapper getWrapper();

    public void sellCandy() {
        Candy candy = getCandy();
        Wrapper wrapper = getWrapper();
        System.out.println("Candy: " + candy.getName() + " of sweetness: " + candy.sweetness() + " is sold with wrapper: " + wrapper.name());
    }
}

class CranberryStore extends AbstractCandyStore {

    @Override
    Candy getCandy() {
        return new CranberryCandy();
    }

    @Override
    Wrapper getWrapper() {
        return new BagWrapper();
    }
}

class WatermelonStore extends AbstractCandyStore {

    @Override
    Candy getCandy() {
        return new WatermelonCandy();
    }

    @Override
    Wrapper getWrapper() {
        return new PlasticWrapper();
    }
}
