package dev.breweryteam.brewery.core;

import dev.breweryteam.brewery.core.registry.registries.block.BlockRegistry;
import lombok.Getter;

public class Brewery {
    @Getter
    private static Brewery instance;

    private final BlockRegistry blockRegistry;

    public Brewery() {
        instance = this;
    }
}
