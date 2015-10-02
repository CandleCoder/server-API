package doubler.impl;

import org.junit.Test;

import src.controllers.Doubler;
import src.services.DoublerImpl;

public class DoublerImplTest {
    
    @Test
    public void testIt() {
        Doubler doubler = new DoublerImpl();
        assert doubler.doubleIt(2) == 4;
    }
}
