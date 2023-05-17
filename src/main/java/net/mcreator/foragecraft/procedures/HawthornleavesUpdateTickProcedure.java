package net.mcreator.foragecraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.foragecraft.init.ForagecraftModBlocks;

public class HawthornleavesUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
			world.setBlock(new BlockPos(x, y, z), ForagecraftModBlocks.HAWTHORNLEAVESBERRIES.get().defaultBlockState(), 3);
		}
	}
}
