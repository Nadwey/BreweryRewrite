package dev.breweryteam.brewery.paper.registry;

import dev.breweryteam.brewery.core.util.registry.BreweryMaterial;
import lombok.Getter;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class PaperBreweryMaterial implements BreweryMaterial {
    @Getter
    private final @NotNull String id;
    @Getter
    private final @Nullable Material material;

    protected PaperBreweryMaterial(@NotNull String id) {
        this.id = id;
        this.material = Material.matchMaterial(id);
    }

    protected PaperBreweryMaterial(@NotNull Material material) {
        this(material.key().asString());
    }

    @Override
    public boolean matches(BreweryMaterial breweryMaterial) {
        if (breweryMaterial instanceof PaperBreweryMaterial paperBreweryMaterial) {
            // if both brewery materials are using spigot materials, we don't need to compare them by strings, so, it's faster :)
            if (this.getMaterial() != null && paperBreweryMaterial.getMaterial() != null)
                return this.getMaterial() == paperBreweryMaterial.getMaterial();
        }

        return Objects.equals(breweryMaterial.getId(), this.getId());
    }

    public static @NotNull BreweryMaterial fromId(@NotNull String id) {
        return new PaperBreweryMaterial(id);
    }

    public static @NotNull BreweryMaterial fromMaterial(Material material) {
        return new PaperBreweryMaterial(material);
    }
}
