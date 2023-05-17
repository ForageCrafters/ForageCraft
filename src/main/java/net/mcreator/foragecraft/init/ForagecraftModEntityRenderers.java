
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foragecraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.foragecraft.client.renderer.RobinRenderer;
import net.mcreator.foragecraft.client.renderer.RedSquirrelRenderer;
import net.mcreator.foragecraft.client.renderer.MyceRenderer;
import net.mcreator.foragecraft.client.renderer.FallowDeerRenderer;
import net.mcreator.foragecraft.client.renderer.BadgerRenderer;
import net.mcreator.foragecraft.client.renderer.BabyFallowDeerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForagecraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ForagecraftModEntities.MYCE.get(), MyceRenderer::new);
		event.registerEntityRenderer(ForagecraftModEntities.BADGER.get(), BadgerRenderer::new);
		event.registerEntityRenderer(ForagecraftModEntities.BABY_FALLOW_DEER.get(), BabyFallowDeerRenderer::new);
		event.registerEntityRenderer(ForagecraftModEntities.RED_SQUIRREL.get(), RedSquirrelRenderer::new);
		event.registerEntityRenderer(ForagecraftModEntities.ROBIN.get(), RobinRenderer::new);
		event.registerEntityRenderer(ForagecraftModEntities.FALLOW_DEER.get(), FallowDeerRenderer::new);
	}
}
