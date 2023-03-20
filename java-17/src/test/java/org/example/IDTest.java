package org.example;


import org.junit.jupiter.api.Test;

class IDTest {

    @Test
    void testId() {
        ID id = new ID();
        System.out.println(id.uuid());
    }
}
