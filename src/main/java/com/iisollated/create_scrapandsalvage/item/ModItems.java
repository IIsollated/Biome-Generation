package com.iisollated.create_scrapandsalvage.item;

import com.iisollated.create_scrapandsalvage.CreateScrapandSalvage;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateScrapandSalvage.MOD_ID);

    public static final RegistryObject<Item> SCRAP_SICKLE = ITEMS.register("scrap_sickle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> C_COAL_SHARD = ITEMS.register("c_coal_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> C_COAL_CLUMP = ITEMS.register("c_coal_clump",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
