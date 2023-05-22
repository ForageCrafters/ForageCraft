
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foragecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.foragecraft.ForagecraftMod;

public class ForagecraftModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ForagecraftMod.MODID);
	public static final RegistryObject<Potion> POTION_OF_HEARTS = REGISTRY.register("potion_of_hearts", () -> new Potion(new MobEffectInstance(MobEffects.HEAL, 3600, 0, false, true)));
}
