package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SwanTest {
    Swan mother = new Swan();

    @Test
    void getNumberEggs() {
        assertEquals(mother.getNumberEggs(),0);
    }

    @Test
    void setNumberEggs() {
        mother.setNumberEggs(3);
        assertNotEquals(mother.getNumberEggs(),0);

    }
    @Test
    void isNull(){
        mother = null;
        assertNull(mother);    }
}