package src.services;

import src.controllers.Doubler;

public class DoublerImpl implements Doubler {
    public int doubleIt(int toDouble) {
        return toDouble * 2;
    }
}
