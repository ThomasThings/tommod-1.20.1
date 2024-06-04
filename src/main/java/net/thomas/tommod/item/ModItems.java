package net.thomas.tommod.item;

import net.minecraftforge.registries.RegistryObject;
import net.thomas.tommod.TomMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TomMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPONENT_GEAR = ITEMS.register("component_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_COMPONENT_GEAR = ITEMS.register("incomplete_component_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_SHEET = ITEMS.register("rose_gold_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPONENT_SHAFT = ITEMS.register("component_shaft",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPONENT_MECHANISM = ITEMS.register("component_mechanism",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> INCOMPLETE_COMPONENT_MECHANISM = ITEMS.register("incomplete_component_mechanism",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
