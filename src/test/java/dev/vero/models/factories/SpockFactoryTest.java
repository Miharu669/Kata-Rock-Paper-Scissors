package dev.vero.models.factories;

import dev.vero.contracts.ISelectable;
import dev.vero.contracts.ISelectableFactory;
import dev.vero.models.Spock;

public class SpockFactoryTest implements ISelectableFactory {

    @Override
    public ISelectable create() {
        return new Spock();
    }    
}
