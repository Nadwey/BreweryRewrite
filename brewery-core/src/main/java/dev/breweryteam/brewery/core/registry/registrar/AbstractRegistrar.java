package dev.breweryteam.brewery.core.registry.registrar;

import lombok.Getter;

public class AbstractRegistrar {
    @Getter
    private final String namespace;

    public AbstractRegistrar(String namespace) {
        this.namespace = namespace;
    }
}
