package com.github.itzswirlz.swstoof;

import org.quiltmc.loader.api.ModContainer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SWSTOOFItemGroup {
    public static final ItemGroup swstoof_ITEM_GROUP = FabricItemGroup.builder()
        .name(Text.literal("So We Set the Ore on Fire"))
        .icon(() -> new ItemStack(Items.FLINT_AND_STEEL))
        .entries((context, entries) -> {
            entries.addItem(SWSTOOFItems.COPPER_TORCH);
            entries.addItem(SWSTOOFBlocks.COPPER_LANTERN);
            entries.addItem(SWSTOOFItems.COPPER_CAMPFIRE);

            entries.addItem(SWSTOOFItems.IRON_TORCH);
        }).build();

    public static void registerswstoofItemGroup(ModContainer mod) {
        Registry.register(Registries.ITEM_GROUP, new Identifier(mod.metadata().id(), "sowesettheoreonfire"), swstoof_ITEM_GROUP);
    }
}
