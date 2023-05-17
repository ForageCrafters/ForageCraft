
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foragecraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.foragecraft.client.model.ModelRobin;
import net.mcreator.foragecraft.client.model.ModelRedSquirrel;
import net.mcreator.foragecraft.client.model.ModelMyce;
import net.mcreator.foragecraft.client.model.ModelFallowDeer;
import net.mcreator.foragecraft.client.model.ModelBadger;
import net.mcreator.foragecraft.client.model.ModelBabyFallowDeer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ForagecraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelFallowDeer.LAYER_LOCATION, ModelFallowDeer::createBodyLayer);
		event.registerLayerDefinition(ModelRedSquirrel.LAYER_LOCATION, ModelRedSquirrel::createBodyLayer);
		event.registerLayerDefinition(ModelMyce.LAYER_LOCATION, ModelMyce::createBodyLayer);
		event.registerLayerDefinition(ModelBadger.LAYER_LOCATION, ModelBadger::createBodyLayer);
		event.registerLayerDefinition(ModelBabyFallowDeer.LAYER_LOCATION, ModelBabyFallowDeer::createBodyLayer);
		event.registerLayerDefinition(ModelRobin.LAYER_LOCATION, ModelRobin::createBodyLayer);
	}
}
