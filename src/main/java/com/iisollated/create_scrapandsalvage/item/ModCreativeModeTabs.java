package com.iisollated.create_scrapandsalvage.item;

import com.iisollated.create_scrapandsalvage.CreateScrapandSalvage;
import com.iisollated.create_scrapandsalvage.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateScrapandSalvage.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SCRAPANDSALVAGE_TAB =
            CREATIVE_MODE_TABS.register("scrap_and_salvage_tab", () -> CreativeModeTab.builder().icon(()
                    -> new ItemStack(ModItems.SCRAP_SICKLE.get()))
                    .title(Component.translatable("creativetab.scrap_and_salvage_tab"))
                    .displayItems((pParameters, pOutput) -> {
                      pOutput.accept(ModItems.SCRAP_SICKLE.get());
                      pOutput.accept(ModBlocks.SCRAP_HEAP.get());

                      pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                      pOutput.accept(ModBlocks.RUSTED_STEEL.get());

                      pOutput.accept(ModBlocks.C_COAL_ORE.get());
                      pOutput.accept(ModBlocks.DEEPSLATE_C_COAL_ORE.get());
                      pOutput.accept(ModItems.C_COAL_SHARD.get());
                      pOutput.accept(ModItems.C_COAL_CLUMP.get());

                      pOutput.accept(ModBlocks.CEMENT_BLOCK.get());
                      pOutput.accept(ModBlocks.CRACKED_CEMENT_BLOCK.get());
                      pOutput.accept(ModBlocks.POWDERED_CEMENT_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
