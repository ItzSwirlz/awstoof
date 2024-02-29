package com.github.itzswirlz.awstoof.block;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

public class RedstoneFireBlock extends AbstractFireBlock {
    public RedstoneFireBlock(Settings settings) {
        super(settings, 1.0F);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return isRedstoneBase(world.getBlockState(pos.down()));
    }

    private boolean isRedstoneBase(BlockState state) {
        return state.getBlock().equals(Blocks.REDSTONE_BLOCK);
    }

    @Override
    protected boolean isFlammable(BlockState state) {
        return true;
    }
}
