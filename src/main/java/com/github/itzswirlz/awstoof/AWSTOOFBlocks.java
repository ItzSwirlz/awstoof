package com.github.itzswirlz.awstoof;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

import com.github.itzswirlz.awstoof.block.CopperFireBlock;
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

public class AWSTOOFBlocks {
    /*
     *  -----------
     *  COPPER FIRE
     *  -----------
     */
    // TODO: map color and consider 'oxidized copper fire'?
    public static final CopperFireBlock COPPER_FIRE = new CopperFireBlock(QuiltBlockSettings.create().mapColor(MapColor.FIRE).replaceable().noCollision().breakInstantly().luminance((state) -> {
        return 10;
    }).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY));

    public static final TorchBlock COPPER_TORCH = new TorchBlock(QuiltBlockSettings.create().noCollision().breakInstantly().luminance((state) -> {
        return 10;
     }).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY), AWSTOOFParticles.COPPER_FIRE_FLAME);
    public static final TorchBlock COPPER_WALL_TORCH = new WallTorchBlock(QuiltBlockSettings.create().noCollision().breakInstantly().luminance((state) -> {
        return 10;
     }).sounds(BlockSoundGroup.WOOD).dropsLike(COPPER_TORCH).pistonBehavior(PistonBehavior.DESTROY), AWSTOOFParticles.COPPER_FIRE_FLAME);

     public static final LanternBlock COPPER_LANTERN = new LanternBlock(QuiltBlockSettings.create().mapColor(MapColor.METAL).solid().requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {
        return 10;
     }).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
     public static final CampfireBlock COPPER_CAMPFIRE = new CampfireBlock(false, 1, QuiltBlockSettings.create().mapColor(MapColor.PODZOL).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).luminance(Blocks.createLightLevelFromLitBlockState(10)).nonOpaque().lavaIgnitable());
     /*
      *  ---------------
      *  END COPPER FIRE
      *  ---------------
      */

    /*
     * -----------------
     * REDSTONE FIRE
     * -----------------
     */
    public static final RedstoneFireBlock REDSTONE_FIRE = new RedstoneFireBlock(QuiltBlockSettings.create().mapColor(MapColor.FIRE).replaceable().noCollision().breakInstantly().luminance((state) -> {
        return 7;
    }).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY));
    /*
     * -----------------
     * END REDSTONE FIRE
     * -----------------
     */


    /* Registration functions */
    public static void registerCopperFireBlocks(ModContainer mod) {
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "copper_fire"), COPPER_FIRE);
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "copper_torch"), COPPER_TORCH);
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "copper_wall_torch"), COPPER_WALL_TORCH);
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "copper_lantern"), COPPER_LANTERN);
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "copper_campfire"), COPPER_CAMPFIRE);
    }

    public static void registerRedstoneFireBlocks(ModContainer mod) {
        Registry.register(Registries.BLOCK, new Identifier(mod.metadata().id(), "redstone_fire"), REDSTONE_FIRE);
    }
}
