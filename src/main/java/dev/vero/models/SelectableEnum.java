package dev.vero.models;

import dev.vero.contracts.ISelectable;
import dev.vero.models.factories.*;

public enum SelectableEnum {
    Lizard(new LizardFactory().create()),
    Paper(new PaperFactory().create()),
    Rock(new RockFactory().create()),
    ;

    private ISelectable selectable;

    private SelectableEnum(ISelectable selectable) {
     this.selectable = selectable;   
    }
    public ISelectable getSelectable() {
        return selectable;
    }
}
