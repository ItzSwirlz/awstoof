package com.github.itzswirlz.awstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class CopperFireItems {
    public static final WallStandingBlockItem COPPER_TORCH = new WallStandingBlockItem(CopperFireBlocks.COPPER_TORCH, CopperFireBlocks.COPPER_WALL_TORCH, new QuiltItemSettings(), Direction.DOWN);

    public static void registerCopperItemBlocks(ModContainer mod) {
        Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "copper_torch"), COPPER_TORCH);
    }
}
