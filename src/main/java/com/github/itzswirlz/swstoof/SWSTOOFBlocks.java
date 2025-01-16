package com.github.itzswirlz.swstoof;

import org.spongepowered.include.com.google.common.base.Function;

import com.github.itzswirlz.swstoof.block.CopperFireBlock;
import com.github.itzswirlz.swstoof.block.IronFireBlock;
import com.github.itzswirlz.swstoof.block.RedstoneFireBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class SWSTOOFBlocks {
    // TODO: is there a clean alternative, like a facotry or something?
    public static final RegistryKey<Block> COPPER_FIRE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "copper_fire"));
    public static final RegistryKey<Block> COPPER_TORCH_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "copper_torch"));
    public static final RegistryKey<Block> COPPER_WALL_TORCH_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "copper_wall_torch"));
    public static final RegistryKey<Block> COPPER_LANTERN_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "copper_lantern"));
    public static final RegistryKey<Block> COPPER_CAMPFIRE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "copper_campfire"));

    public static final RegistryKey<Block> IRON_FIRE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "iron_fire"));
    public static final RegistryKey<Block> IRON_TORCH_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "iron_torch"));
    public static final RegistryKey<Block> IRON_WALL_TORCH_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "iron_wall_torch"));
    public static final RegistryKey<Block> IRON_LANTERN_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "iron_lantern"));
    public static final RegistryKey<Block> IRON_CAMPFIRE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "iron_campfire"));

    public static final RegistryKey<Block> REDSTONE_FIRE_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "redstone_fire"));
    public static final RegistryKey<Block> REDSTONE_LANTERN_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "redstone_lantern"));

    // TODO: Copy settings from other blocks using Block.Settings.copy
    /*
     *  -----------
     *  COPPER FIRE
     *  -----------
     */
    public static final CopperFireBlock COPPER_FIRE = new CopperFireBlock(Block.Settings.create().mapColor(MapColor.TEAL).replaceable().noCollision().breakInstantly().luminance((state) -> {
        return 10;
    }).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY).registryKey(COPPER_FIRE_KEY));

    public static final TorchBlock COPPER_TORCH = new TorchBlock(SWSTOOFParticles.COPPER_FIRE_FLAME, Block.Settings.create().noCollision().breakInstantly().luminance((state) -> {
        return 10;
     }).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(COPPER_TORCH_KEY));
     // TODO: item drop
    public static final TorchBlock COPPER_WALL_TORCH = new WallTorchBlock(SWSTOOFParticles.COPPER_FIRE_FLAME, Block.Settings.create().noCollision().breakInstantly().luminance((state) -> {
        return 10;
     }).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(COPPER_WALL_TORCH_KEY));

     public static final LanternBlock COPPER_LANTERN = new LanternBlock(Block.Settings.create().mapColor(MapColor.IRON_GRAY).solid().requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {
        return 10;
     }).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).registryKey(COPPER_LANTERN_KEY));
     public static final CampfireBlock COPPER_CAMPFIRE = new CampfireBlock(false, 1, Block.Settings.create().mapColor(MapColor.SPRUCE_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).luminance(Blocks.createLightLevelFromLitBlockState(10)).nonOpaque().burnable().registryKey(COPPER_CAMPFIRE_KEY));
     /*
      *  ---------------
      *  END COPPER FIRE
      *  ---------------
      */
      
    /*
     * ----------------
     * IRON FIRE
     * ----------------
     */
    public static final IronFireBlock IRON_FIRE = new IronFireBlock(Block.Settings.create().mapColor(MapColor.GOLD).replaceable().noCollision().breakInstantly().luminance((state) -> {
        return 10;
    }).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY).registryKey(IRON_FIRE_KEY));

    public static final TorchBlock IRON_TORCH = new TorchBlock(SWSTOOFParticles.IRON_FIRE_FLAME, Block.Settings.create().noCollision().breakInstantly().luminance((state) -> {
        return 10;
     }).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(IRON_TORCH_KEY));
     // TODO: item drop
    public static final TorchBlock IRON_WALL_TORCH = new WallTorchBlock(SWSTOOFParticles.IRON_FIRE_FLAME, Block.Settings.create().noCollision().breakInstantly().luminance((state) -> {
        return 10;
     }).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).registryKey(IRON_WALL_TORCH_KEY));
    public static final LanternBlock IRON_LANTERN = new LanternBlock(Block.Settings.create().mapColor(MapColor.IRON_GRAY).solid().requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {
        return 10;
    }).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).registryKey(IRON_LANTERN_KEY));
    public static final CampfireBlock IRON_CAMPFIRE = new CampfireBlock(false, 1, Block.Settings.create().mapColor(MapColor.SPRUCE_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).luminance(Blocks.createLightLevelFromLitBlockState(10)).nonOpaque().burnable().registryKey(IRON_CAMPFIRE_KEY));


    /*
     * ------------
     * END IRON FIRE
     * -----------
     */

    /*
     * -----------------
     * REDSTONE FIRE
     * -----------------
     */
    // TODO: map color
    public static final RedstoneFireBlock REDSTONE_FIRE = new RedstoneFireBlock(Block.Settings.create().mapColor(MapColor.RED).replaceable().noCollision().breakInstantly().luminance((state) -> {
        return 7;
    }).sounds(BlockSoundGroup.WOOL).pistonBehavior(PistonBehavior.DESTROY).registryKey(REDSTONE_FIRE_KEY));
    public static final LanternBlock REDSTONE_LANTERN = new LanternBlock(Block.Settings.create().mapColor(MapColor.IRON_GRAY).solid().requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {
        return 7;
    }).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).registryKey(REDSTONE_LANTERN_KEY));
    /*
     * -----------------
     * END REDSTONE FIRE
     * -----------------
     */

    /* Registration functions */
    public static void registerCopperFireBlocks() {
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "copper_fire"), COPPER_FIRE);
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "copper_torch"), COPPER_TORCH);
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "copper_wall_torch"), COPPER_WALL_TORCH);
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "copper_lantern"), COPPER_LANTERN);
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "copper_campfire"), COPPER_CAMPFIRE);
    }

    public static void registerIronFireBlocks() {
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "iron_campfire"), IRON_CAMPFIRE);
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "iron_fire"), IRON_FIRE);
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "iron_torch"), IRON_TORCH);
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "iron_wall_torch"), IRON_WALL_TORCH);
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "iron_lantern"), IRON_LANTERN);
    }

    public static void registerRedstoneFireBlocks() {
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "redstone_fire"), REDSTONE_FIRE);
        Registry.register(Registries.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, "redstone_lantern"), REDSTONE_LANTERN);
    }

    // Without this, traits like the smoke particles and being able to cook won't work for our new campfires.
    public static void updateCampfireBlockEntityType() {
        Block[] blocks = new Block[]{COPPER_CAMPFIRE, IRON_CAMPFIRE};
        for(Block block : blocks) {
            BlockEntityType.CAMPFIRE.addSupportedBlock(block);
        }
    }

    // from fabric doc but modified a bit
    private static Block register(String name, Block block) {
        // Apparently now after 1.21 the blocks need to be tied to a key (also related to I think the loot table change)
        // I want to emulate the decompiled source, and I think making all the separate registry keys is silly
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SWSTOOFMod.MOD_ID, name));

		// Sometimes, you may not want to register an item for the block.
		// Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
		// Items need to be registered with a different type of registry key, but the ID
		// can be the same.
		RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());

		BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
		Registry.register(Registries.ITEM, itemKey, blockItem);

		return Registry.register(Registries.BLOCK, blockKey, block);
	}
}
