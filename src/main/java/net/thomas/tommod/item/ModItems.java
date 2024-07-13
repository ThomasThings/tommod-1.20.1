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

    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RAW_ALUMINUM = ITEMS.register("crushed_raw_aluminum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_SHEET = ITEMS.register("aluminum_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RAW_LEAD = ITEMS.register("crushed_raw_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_SHEET = ITEMS.register("lead_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RAW_NICKEL = ITEMS.register("crushed_raw_nickel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_SHEET = ITEMS.register("nickel_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RAW_TITANIUM = ITEMS.register("crushed_raw_titanium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SHEET = ITEMS.register("titanium_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_THORIUM = ITEMS.register("raw_thorium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RAW_THORIUM = ITEMS.register("crushed_raw_thorium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THORIUM_INGOT = ITEMS.register("thorium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THORIUM_NUGGET = ITEMS.register("thorium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THORIUM_SHEET = ITEMS.register("thorium_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RAW_URANIUM = ITEMS.register("crushed_raw_uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_SHEET = ITEMS.register("uranium_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAPHITE = ITEMS.register("graphite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAPHITE_NUGGET = ITEMS.register("graphite_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAPHITE_SHEET = ITEMS.register("graphite_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAPHITE_HEAP = ITEMS.register("graphite_heap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPRESSED_GRAPHITE = ITEMS.register("compressed_graphite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARBON_NUGGET = ITEMS.register("carbon_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_CARBON_SCRAP = ITEMS.register("crushed_carbon_scrap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICATE_QUARTZ = ITEMS.register("silicate_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICATE_QUARTZ_SHARD = ITEMS.register("silicate_quartz_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICON_NUGGET = ITEMS.register("silicon_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICON_WAFER = ITEMS.register("silicon_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STURDY_DEBRIS = ITEMS.register("sturdy_debris",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONDUCTIVE_ALLOY_INGOT = ITEMS.register("conductive_alloy_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STURDY_INGOT = ITEMS.register("sturdy_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOCK_BRASS_INGOT = ITEMS.register("mock_brass_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SURGE_ALLOY_INGOT = ITEMS.register("surge_alloy_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONDUCTIVE_ALLOY_NUGGET = ITEMS.register("conductive_alloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STURDY_NUGGET = ITEMS.register("sturdy_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOCK_BRASS_NUGGET = ITEMS.register("mock_brass_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SURGE_ALLOY_NUGGET = ITEMS.register("surge_alloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_GOLD_SHEET = ITEMS.register("rose_gold_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONDUCTIVE_ALLOY_SHEET = ITEMS.register("conductive_alloy_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOCK_BRASS_SHEET = ITEMS.register("mock_brass_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SURGE_ALLOY_SHEET = ITEMS.register("surge_alloy_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_ALLOY = ITEMS.register("mock_brass_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRIPSTONE_ALLOY = ITEMS.register("dripstone_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUFF_ALLOY = ITEMS.register("tuff_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALCITE_ALLOY = ITEMS.register("calcite_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VITRIFIED_URANIUM = ITEMS.register("vitrified_uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_INSULATION = ITEMS.register("stone_insulation",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET = ITEMS.register("garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET_SHARD = ITEMS.register("garnet_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_SHARD = ITEMS.register("peridot_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHARD = ITEMS.register("sapphire_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_SHARD = ITEMS.register("quartz_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROZE_QUARTZ_SHARD = ITEMS.register("rose_quartz_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_GARNET = ITEMS.register("polished_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_PERIDOT = ITEMS.register("polished_peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_SAPPHIRE = ITEMS.register("polished_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_QUARTZ = ITEMS.register("polished_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_GARNET_SHEET = ITEMS.register("polished_garnet_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_PERIDOT_SHEET = ITEMS.register("polished_peridot_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_SAPPHIRE_SHEET = ITEMS.register("polished_sapphire_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_QUARTZ_SHEET = ITEMS.register("polished_quartz_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LED = ITEMS.register("red_led",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_LED = ITEMS.register("green_led",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_LED = ITEMS.register("blue_led",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_LED = ITEMS.register("white_led",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_LED = ITEMS.register("large_led",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_COMPONENT_GEAR = ITEMS.register("incomplete_component_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPONENT_GEAR = ITEMS.register("component_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPONENT_SHAFT = ITEMS.register("component_shaft",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPONENT_BELT = ITEMS.register("component_belt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_COMPONENT_MECHANISM = ITEMS.register("incomplete_component_mechanism",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPONENT_MECHANISM = ITEMS.register("component_mechanism",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_COMPONENT_CHIP = ITEMS.register("incomplete_component_chip",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPONENT_CHIP = ITEMS.register("component_chip",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_ADVANCED_COMPONENT_CHIP = ITEMS.register("incomplete_advanced_component_chip",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADVANCED_COMPONENT_CHIP = ITEMS.register("advanced_component_chip",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_LED_COMPONENT_CHIP_R = ITEMS.register("incomplete_component_chip_r",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_LED_COMPONENT_CHIP_G = ITEMS.register("incomplete_component_chip_g",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LED_COMPONENT_CHIP = ITEMS.register("component_chip",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STURDY_HANDLE = ITEMS.register("sturdy_handle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VEILED_INGOT = ITEMS.register("veiled_block",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
