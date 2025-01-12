package dev.breweryteam.brewery.core.registry.registries.block;

import java.util.HashMap;
import java.util.Map;

public class BlockRegistry {
    private final Map<String, BreweryBlockBuilder> blocks = new HashMap<>();

    public void register(BreweryBlockBuilder builder) {
        blocks.put(Key, builder);
    }
}
