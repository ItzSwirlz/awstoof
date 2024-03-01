package com.github.itzswirlz.swstoof.mixin;

import com.github.itzswirlz.swstoof.SWSTOOFBlocks;
import com.github.itzswirlz.swstoof.block.CopperFireBlock;
import com.github.itzswirlz.swstoof.block.IronFireBlock;
import com.github.itzswirlz.swstoof.block.RedstoneFireBlock;

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
			cir.setReturnValue(SWSTOOFBlocks.COPPER_FIRE.getDefaultState());
		} else if (IronFireBlock.isIronBase(world.getBlockState(pos.down()))) {
			cir.setReturnValue(SWSTOOFBlocks.IRON_FIRE.getDefaultState());
		} else if (RedstoneFireBlock.isRedstoneBase(world.getBlockState(pos.down()))) {
			cir.setReturnValue(SWSTOOFBlocks.REDSTONE_FIRE.getDefaultState());
		}
	}
}
