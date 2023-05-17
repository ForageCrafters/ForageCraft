package net.mcreator.foragecraft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.foragecraft.init.ForagecraftModItems;
import net.mcreator.foragecraft.init.ForagecraftModBlocks;
import net.mcreator.foragecraft.ForagecraftMod;

public class HawthornleavesberriesOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(ForagecraftModItems.HAWTHORN_BERRY.get());
			_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 4));
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		ForagecraftMod.queueServerWork(5, () -> {
			world.setBlock(new BlockPos(x, y, z), ForagecraftModBlocks.HAWTHORNLEAVES.get().defaultBlockState(), 3);
		});
	}
}
