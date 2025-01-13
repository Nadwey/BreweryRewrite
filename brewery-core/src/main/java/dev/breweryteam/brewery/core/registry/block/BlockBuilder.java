package dev.breweryteam.brewery.core.registry.block;

import dev.breweryteam.brewery.core.world.behavior.Behavior;
import dev.breweryteam.brewery.core.world.block.Block;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.function.Supplier;

@Getter
@Setter
@Accessors(chain = true)
public class BlockBuilder {
    private List<Supplier<Behavior>> behaviors;

    public BlockBuilder(Supplier<Block> blockSupplier) {

    }
}
