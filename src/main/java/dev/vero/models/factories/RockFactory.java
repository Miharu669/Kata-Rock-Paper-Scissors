package dev.vero.models.factories;

import dev.vero.contracts.ISelectable;
import dev.vero.contracts.ISelectableFactory;
import dev.vero.models.Rock;

public class RockFactory implements ISelectableFactory {

    @Override
    public ISelectable create() {
        return new Rock();
    }
}
