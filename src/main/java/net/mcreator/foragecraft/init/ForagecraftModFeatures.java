
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foragecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.foragecraft.world.features.plants.WoodSorrelFeature;
import net.mcreator.foragecraft.world.features.plants.WildGarlicFeature;
import net.mcreator.foragecraft.world.features.plants.SampireFeature;
import net.mcreator.foragecraft.world.features.plants.PuffballFeature;
import net.mcreator.foragecraft.world.features.plants.ParasolMushroomFeature;
import net.mcreator.foragecraft.world.features.plants.NettleFeature;
import net.mcreator.foragecraft.world.features.plants.HemlockFeature;
import net.mcreator.foragecraft.world.features.plants.HawthornSaplingFeature;
import net.mcreator.foragecraft.world.features.plants.FlyAgaricFeature;
import net.mcreator.foragecraft.world.features.plants.DandelionFeature;
import net.mcreator.foragecraft.world.features.plants.CommonBeechSaplingFeature;
import net.mcreator.foragecraft.world.features.plants.ChanterelleFeature;
import net.mcreator.foragecraft.world.features.plants.CepFeature;
import net.mcreator.foragecraft.world.features.plants.BluebellsFeature;
import net.mcreator.foragecraft.world.features.plants.BlewitFeature;
import net.mcreator.foragecraft.ForagecraftMod;

@Mod.EventBusSubscriber
public class ForagecraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ForagecraftMod.MODID);
	public static final RegistryObject<Feature<?>> NETTLE = REGISTRY.register("nettle", NettleFeature::feature);
	public static final RegistryObject<Feature<?>> DANDELION = REGISTRY.register("dandelion", DandelionFeature::feature);
	public static final RegistryObject<Feature<?>> WILD_GARLIC = REGISTRY.register("wild_garlic", WildGarlicFeature::feature);
	public static final RegistryObject<Feature<?>> WOOD_SORREL = REGISTRY.register("wood_sorrel", WoodSorrelFeature::feature);
	public static final RegistryObject<Feature<?>> HEMLOCK = REGISTRY.register("hemlock", HemlockFeature::feature);
	public static final RegistryObject<Feature<?>> CEP = REGISTRY.register("cep", CepFeature::feature);
	public static final RegistryObject<Feature<?>> BLEWIT = REGISTRY.register("blewit", BlewitFeature::feature);
	public static final RegistryObject<Feature<?>> PUFFBALL = REGISTRY.register("puffball", PuffballFeature::feature);
	public static final RegistryObject<Feature<?>> FLY_AGARIC = REGISTRY.register("fly_agaric", FlyAgaricFeature::feature);
	public static final RegistryObject<Feature<?>> PARASOL_MUSHROOM = REGISTRY.register("parasol_mushroom", ParasolMushroomFeature::feature);
	public static final RegistryObject<Feature<?>> CHANTERELLE = REGISTRY.register("chanterelle", ChanterelleFeature::feature);
	public static final RegistryObject<Feature<?>> COMMON_BEECH_SAPLING = REGISTRY.register("common_beech_sapling", CommonBeechSaplingFeature::feature);
	public static final RegistryObject<Feature<?>> HAWTHORN_SAPLING = REGISTRY.register("hawthorn_sapling", HawthornSaplingFeature::feature);
	public static final RegistryObject<Feature<?>> SAMPIRE = REGISTRY.register("sampire", SampireFeature::feature);
	public static final RegistryObject<Feature<?>> BLUEBELLS = REGISTRY.register("bluebells", BluebellsFeature::feature);
}
