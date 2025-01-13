package dev.breweryteam.brewery.core.registry.block;

import lombok.Getter;

public class BlockType {
    @Getter
    private final String id;

    public BlockType(String id) {
        this.id = id;
    }
}
