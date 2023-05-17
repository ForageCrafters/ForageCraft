
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foragecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.foragecraft.entity.RobinEntity;
import net.mcreator.foragecraft.entity.RedSquirrelEntity;
import net.mcreator.foragecraft.entity.MyceEntity;
import net.mcreator.foragecraft.entity.BadgerEntity;
import net.mcreator.foragecraft.entity.BabyFallowDeerEntity;
import net.mcreator.foragecraft.ForagecraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForagecraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ForagecraftMod.MODID);
	public static final RegistryObject<EntityType<MyceEntity>> MYCE = register("myce",
			EntityType.Builder.<MyceEntity>of(MyceEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MyceEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BadgerEntity>> BADGER = register("badger",
			EntityType.Builder.<BadgerEntity>of(BadgerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BadgerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BabyFallowDeerEntity>> BABY_FALLOW_DEER = register("baby_fallow_deer",
			EntityType.Builder.<BabyFallowDeerEntity>of(BabyFallowDeerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyFallowDeerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RedSquirrelEntity>> RED_SQUIRREL = register("red_squirrel",
			EntityType.Builder.<RedSquirrelEntity>of(RedSquirrelEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedSquirrelEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RobinEntity>> ROBIN = register("robin",
			EntityType.Builder.<RobinEntity>of(RobinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RobinEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MyceEntity.init();
			BadgerEntity.init();
			BabyFallowDeerEntity.init();
			RedSquirrelEntity.init();
			RobinEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MYCE.get(), MyceEntity.createAttributes().build());
		event.put(BADGER.get(), BadgerEntity.createAttributes().build());
		event.put(BABY_FALLOW_DEER.get(), BabyFallowDeerEntity.createAttributes().build());
		event.put(RED_SQUIRREL.get(), RedSquirrelEntity.createAttributes().build());
		event.put(ROBIN.get(), RobinEntity.createAttributes().build());
	}
}
