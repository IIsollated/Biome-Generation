package com.iisollated.create_scrapandsalvage.worldgen;

import com.iisollated.create_scrapandsalvage.CreateScrapandSalvage;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class ScrapSalvageBiomes {
    public static final ResourceKey<Biome> SCRAP_LANDS = register("scrap_lands");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(CreateScrapandSalvage.MOD_ID, name));
    }
}
