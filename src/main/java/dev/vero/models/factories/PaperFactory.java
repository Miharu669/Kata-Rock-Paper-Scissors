package dev.vero.models.factories;

import dev.vero.contracts.ISelectable;
import dev.vero.contracts.ISelectableFactory;
import dev.vero.models.Paper;


public class PaperFactory implements ISelectableFactory{
    @Override
    public ISelectable create() {
        return new Paper();
    }
}
