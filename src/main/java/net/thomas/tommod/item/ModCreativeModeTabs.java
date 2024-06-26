package net.thomas.tommod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thomas.tommod.TomMod;
import net.thomas.tommod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TomMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TOM_TAB = CREATIVE_MODE_TABS.register("tom_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tom_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.RAW_SAPPHIRE.get());

                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

                        output.accept(ModItems.COMPONENT_GEAR.get());
                        output.accept(ModItems.COMPONENT_SHAFT.get());

                        output.accept(ModItems.ROSE_GOLD_INGOT.get());
                        output.accept(ModBlocks.ROSE_GOLD_BLOCK.get());
                        output.accept(ModItems.ROSE_GOLD_NUGGET.get());
                        output.accept(ModItems.ROSE_GOLD_SHEET.get());

                        output.accept(ModItems.COMPONENT_MECHANISM.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
