package com.github.itzswirlz.awstoof;

import org.quiltmc.loader.api.ModContainer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AWSTOOFItemGroup {
    public static final ItemGroup AWSTOOF_ITEM_GROUP = FabricItemGroup.builder()
        .name(Text.literal("And We Set the Ore on Fire"))
        .icon(() -> new ItemStack(Items.FLINT_AND_STEEL))
        .entries((context, entries) -> {
            entries.addItem(AWSTOOFItems.COPPER_TORCH);
            entries.addItem(AWSTOOFBlocks.COPPER_LANTERN);
            entries.addItem(AWSTOOFItems.COPPER_CAMPFIRE);
        }).build();

    public static void registerAWSTOOFItemGroup(ModContainer mod) {
        Registry.register(Registries.ITEM_GROUP, new Identifier(mod.metadata().id(), "andwesettheoreonfire"), AWSTOOF_ITEM_GROUP);
    }
}
