package dev.vero.models.factories;

import dev.vero.contracts.ISelectable;
import dev.vero.contracts.ISelectableFactory;
import dev.vero.models.Scissors;

public class ScissorsFactory implements ISelectableFactory {
    @Override
    public ISelectable create() {
        return new Scissors();
    }

}
