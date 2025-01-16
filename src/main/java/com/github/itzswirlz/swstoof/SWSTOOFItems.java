package com.github.itzswirlz.swstoof;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.VerticallyAttachableBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class SWSTOOFItems {
    // TODO: is there a clean alternative, like a factory or something?
    public static final RegistryKey<Item> COPPER_CAMPFIRE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "copper_campfire"));
    public static final RegistryKey<Item> COPPER_LANTERN_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "copper_lantern"));
    public static final RegistryKey<Item> COPPER_TORCH_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "copper_torch"));

    public static final RegistryKey<Item> IRON_CAMPFIRE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "iron_campfire"));
    public static final RegistryKey<Item> IRON_LANTERN_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "iron_lantern"));
    public static final RegistryKey<Item> IRON_TORCH_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "iron_torch"));

    public static final RegistryKey<Item> REDSTONE_LANTERN_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "redstone_lantern"));

    public static final BlockItem COPPER_CAMPFIRE = new BlockItem(SWSTOOFBlocks.COPPER_CAMPFIRE, new Item.Settings().registryKey(COPPER_CAMPFIRE_KEY));
    public static final BlockItem COPPER_LANTERN = new BlockItem(SWSTOOFBlocks.COPPER_LANTERN, new Item.Settings().registryKey(COPPER_LANTERN_KEY));
    public static final VerticallyAttachableBlockItem COPPER_TORCH = new VerticallyAttachableBlockItem(SWSTOOFBlocks.COPPER_TORCH, SWSTOOFBlocks.COPPER_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(COPPER_TORCH_KEY));

    public static final BlockItem IRON_CAMPFIRE = new BlockItem(SWSTOOFBlocks.IRON_CAMPFIRE, new Item.Settings().registryKey(IRON_CAMPFIRE_KEY));
    public static final BlockItem IRON_LANTERN = new BlockItem(SWSTOOFBlocks.IRON_LANTERN, new Item.Settings().registryKey(IRON_LANTERN_KEY));
    public static final VerticallyAttachableBlockItem IRON_TORCH = new VerticallyAttachableBlockItem(SWSTOOFBlocks.IRON_TORCH, SWSTOOFBlocks.IRON_WALL_TORCH, Direction.DOWN, new Item.Settings().registryKey(IRON_TORCH_KEY));

    public static final BlockItem REDSTONE_LANTERN = new BlockItem(SWSTOOFBlocks.REDSTONE_LANTERN, new Item.Settings().registryKey(REDSTONE_LANTERN_KEY));

    public static void registerCopperBlockItems() {
        Registry.register(Registries.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "copper_campfire"), COPPER_CAMPFIRE);
        Registry.register(Registries.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "copper_lantern"), COPPER_LANTERN);
        Registry.register(Registries.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "copper_torch"), COPPER_TORCH);
    }

    public static void registerIronBlockItems() {
        Registry.register(Registries.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "iron_campfire"), IRON_CAMPFIRE);
        Registry.register(Registries.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "iron_lantern"), IRON_LANTERN);
        Registry.register(Registries.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "iron_torch"), IRON_TORCH);
    }

    public static void registerRedstoneBlockItems() {
        Registry.register(Registries.ITEM, Identifier.of(SWSTOOFMod.MOD_ID, "redstone_lantern"), REDSTONE_LANTERN);
    }
}
