package com.github.itzswirlz.awstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class AWSTOOFItems {
    public static final WallStandingBlockItem COPPER_TORCH = new WallStandingBlockItem(AWSTOOFBlocks.COPPER_TORCH, AWSTOOFBlocks.COPPER_WALL_TORCH, new QuiltItemSettings(), Direction.DOWN);

    public static void registerCopperBlockItems(ModContainer mod) {
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "copper_torch"), COPPER_TORCH);
    }
}
