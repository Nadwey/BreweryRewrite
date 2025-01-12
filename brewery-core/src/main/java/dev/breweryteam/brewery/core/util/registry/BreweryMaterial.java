package dev.breweryteam.brewery.core.util.registry;

import org.jetbrains.annotations.NotNull;

public interface BreweryMaterial {
    @NotNull String getId();

    boolean matches(BreweryMaterial breweryMaterial);
}
