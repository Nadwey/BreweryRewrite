package dev.breweryteam.brewery.core;

import lombok.Getter;

public class Brewery {
    @Getter
    private static Brewery instance;

    public Brewery() {
        instance = this;
    }
}
