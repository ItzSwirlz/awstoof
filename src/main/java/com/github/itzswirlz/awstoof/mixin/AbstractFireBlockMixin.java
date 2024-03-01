package com.github.itzswirlz.awstoof.mixin;

import com.github.itzswirlz.awstoof.AWSTOOFBlocks;
import com.github.itzswirlz.awstoof.block.CopperFireBlock;
import com.github.itzswirlz.awstoof.block.IronFireBlock;
import com.github.itzswirlz.awstoof.block.RedstoneFireBlock;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractFireBlock.class)
public class AbstractFireBlockMixin {
	@Inject(method = "getState", at = @At("RETURN"), cancellable = true)
	private static void injected(BlockView world, BlockPos pos, CallbackInfoReturnable<BlockState> cir) {
		if (CopperFireBlock.isCopperBase(world.getBlockState(pos.down()))) {
			cir.setReturnValue(AWSTOOFBlocks.COPPER_FIRE.getDefaultState());
		} else if (IronFireBlock.isIronBase(world.getBlockState(pos.down()))) {
			cir.setReturnValue(AWSTOOFBlocks.IRON_FIRE.getDefaultState());
		} else if (RedstoneFireBlock.isRedstoneBase(world.getBlockState(pos.down()))) {
			cir.setReturnValue(AWSTOOFBlocks.REDSTONE_FIRE.getDefaultState());
		}
	}
}
