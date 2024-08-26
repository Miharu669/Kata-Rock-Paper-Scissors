package dev.vero.models;

import dev.vero.contracts.ISelectable;

public class Player {

    private ISelectable object;

    public Player() {
    }

    public ISelectable getObject() {
        return object;
    }

    public void selectedObject(String type) {
        for (SelectableEnum selectable : SelectableEnum.values()) {
            if (type.equals(selectable.getSelectable().getType())) {
                this.object = selectable.getSelectable();
                return;
            }
        }
        this.object = null;
    }
}
