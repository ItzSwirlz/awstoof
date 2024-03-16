package com.github.itzswirlz.swstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import net.minecraft.item.BlockItem;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class SWSTOOFItems {
    public static final BlockItem COPPER_CAMPFIRE = new BlockItem(SWSTOOFBlocks.COPPER_CAMPFIRE, new QuiltItemSettings());
    public static final BlockItem COPPER_LANTERN = new BlockItem(SWSTOOFBlocks.COPPER_LANTERN, new QuiltItemSettings());
    public static final WallStandingBlockItem COPPER_TORCH = new WallStandingBlockItem(SWSTOOFBlocks.COPPER_TORCH, SWSTOOFBlocks.COPPER_WALL_TORCH, new QuiltItemSettings(), Direction.DOWN);

    public static final BlockItem IRON_CAMPFIRE = new BlockItem(SWSTOOFBlocks.IRON_CAMPFIRE, new QuiltItemSettings());
    public static final BlockItem IRON_LANTERN = new BlockItem(SWSTOOFBlocks.IRON_LANTERN, new QuiltItemSettings());
    public static final WallStandingBlockItem IRON_TORCH = new WallStandingBlockItem(SWSTOOFBlocks.IRON_TORCH, SWSTOOFBlocks.IRON_WALL_TORCH, new QuiltItemSettings(), Direction.DOWN);

    public static void registerCopperBlockItems(ModContainer mod) {
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "copper_campfire"), COPPER_CAMPFIRE);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "copper_lantern"), COPPER_LANTERN);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "copper_torch"), COPPER_TORCH);
    }

    public static void registerIronBlockItems(ModContainer mod) {
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "iron_campfire"), IRON_CAMPFIRE);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "iron_lantern"), IRON_LANTERN);
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "iron_torch"), IRON_TORCH);
    }
}
