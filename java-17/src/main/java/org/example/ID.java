package org.example;

import java.util.UUID;

public class ID {

    public String uuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
