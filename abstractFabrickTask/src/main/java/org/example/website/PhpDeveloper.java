package org.example.website;

import org.example.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Write PHP code...");
    }
}
