package dev.breweryteam.brewery.paper;

import dev.breweryteam.brewery.core.Brewery;
import dev.breweryteam.brewery.core.registry.registries.block.BlockRegistry;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class BreweryPaperPlugin extends JavaPlugin {
    @Getter
    private static BreweryPaperPlugin instance;

    @Getter
    private Brewery brewery;

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {
        this.brewery = new Brewery();
    }

    @Override
    public void onDisable() {

    }
}
