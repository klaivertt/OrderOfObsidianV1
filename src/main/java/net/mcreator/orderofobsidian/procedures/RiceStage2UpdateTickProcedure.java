package net.mcreator.orderofobsidian.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.orderofobsidian.init.OrderofobsidianModBlocks;

public class RiceStage2UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), OrderofobsidianModBlocks.RICE_STAGE_3.defaultBlockState(), 3);
	}
}
