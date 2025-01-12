package dev.breweryteam.brewery.core.registry.registrar;

import dev.breweryteam.brewery.core.world.block.AbstractBlock;
import lombok.Getter;

import java.util.function.Supplier;

public class BlockRegistrar extends AbstractRegistrar {
    public BlockRegistrar(String namespace) {
        super(namespace);
    }

    public void register(String name, Supplier<AbstractBlock> ctor) {

    }
}
