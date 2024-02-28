package com.github.itzswirlz.awstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

import com.github.itzswirlz.awstoof.block.RedstoneFireBlock;

import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class RedstoneFireBlocks {
    public static final RedstoneFireBlock REDSTONE_FIRE = new RedstoneFireBlock(QuiltBlockSettings.create().mapColor(MapColor.FIRE).replaceable().noCollision().breakInstantly().luminance((state) -> {
        return 7;
    }).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY));

     public static void registerRedstoneFireBlocks(ModContainer mod) {
         Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "redstone_fire"), REDSTONE_FIRE);
     }
}
