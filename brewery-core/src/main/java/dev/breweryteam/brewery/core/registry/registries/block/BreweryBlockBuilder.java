package dev.breweryteam.brewery.core.registry.registries.block;

import dev.breweryteam.brewery.core.world.block.AbstractBlock;
import lombok.Getter;
import lombok.Setter;

import java.util.function.Supplier;

@Getter
@Setter
public class BreweryBlockBuilder {
    private final String namespace;
    private final String name;
    private final Supplier<AbstractBlock> ctor;

    public BreweryBlockBuilder(String namespace, String name, Supplier<AbstractBlock> ctor) {

    }
}
