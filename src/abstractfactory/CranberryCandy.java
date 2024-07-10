package abstractfactory;

import factory.Candy;

public class CranberryCandy implements Candy {
    @Override
    public String getName() {
        return "Cranberry";
    }

    @Override
    public Integer sweetness() {
        return 5;
    }
}
