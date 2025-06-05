package com.berlin;
import com.berlin.Calculator;



import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testAdd() {
        Calculator cal = new Calculator();
        assertEquals(7, cal.add(2, 5));
    }
}
