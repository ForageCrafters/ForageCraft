package net.mcreator.foragecraft.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class CommonBeechSaplingUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.2) {
			if (Mth.nextDouble(RandomSource.create(), 1, 5) == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("foragecraft", "commonbeech5"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 2, y, z - 2), new BlockPos(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
								3);
					}
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 5) < 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("foragecraft", "commonbeech4"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 2), new BlockPos(x - 1, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
								3);
					}
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 5) < 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("foragecraft", "commonbeech3"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 1), new BlockPos(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
								3);
					}
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 5) < 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("foragecraft", "commonbeech2"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 1), new BlockPos(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
								3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("foragecraft", "commonbeech1"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 1), new BlockPos(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
								3);
					}
				}
			}
		}
	}
}
