package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleTest {

    @Test
    void test() {
        assertEquals(1, Simple.return1());
    }
}
