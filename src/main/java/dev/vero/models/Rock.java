package dev.vero.models;

import dev.vero.contracts.ISelectable;

public class Rock extends Selectable implements ISelectable{

    public Rock() {
    this.type = "Rock";
    }
}