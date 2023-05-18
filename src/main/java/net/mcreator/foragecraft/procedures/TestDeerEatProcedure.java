package net.mcreator.foragecraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.foragecraft.entity.TestEntity;
import net.mcreator.foragecraft.ForagecraftMod;

public class TestDeerEatProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TestEntity) {
			((TestEntity) entity).setAnimation("starteat");
		}
		if (entity instanceof Mob _entity)
			_entity.getNavigation().moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 0);
		ForagecraftMod.queueServerWork(20, () -> {
			for (int index0 = 0; index0 < (int) (Mth.nextDouble(RandomSource.create(), 1, 10)); index0++) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 0);
				if (entity instanceof TestEntity) {
					((TestEntity) entity).setAnimation("eating");
				}
			}
			ForagecraftMod.queueServerWork(25, () -> {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 0);
				if (entity instanceof TestEntity) {
					((TestEntity) entity).setAnimation("stopeat");
				}
			});
		});
	}
}
