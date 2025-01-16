package com.github.itzswirlz.swstoof;

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
        .displayName(Text.literal("So We Set the Ore on Fire"))
        .icon(() -> new ItemStack(Items.FLINT_AND_STEEL))
        .entries((context, entries) -> {
            entries.add(SWSTOOFItems.COPPER_TORCH);
            entries.add(SWSTOOFBlocks.COPPER_LANTERN);
            entries.add(SWSTOOFItems.COPPER_CAMPFIRE);

            entries.add(SWSTOOFItems.IRON_TORCH);
            entries.add(SWSTOOFItems.IRON_LANTERN);
            entries.add(SWSTOOFItems.IRON_CAMPFIRE);

            entries.add(SWSTOOFItems.REDSTONE_LANTERN);
        }).build();

    public static void registerswstoofItemGroup() {
        Registry.register(Registries.ITEM_GROUP, Identifier.of(SWSTOOFMod.MOD_ID, "sowesettheoreonfire"), swstoof_ITEM_GROUP);
    }
}
