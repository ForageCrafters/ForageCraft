
package net.mcreator.foragecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.foragecraft.entity.RobinEntity;
import net.mcreator.foragecraft.client.model.ModelRobin;

public class RobinRenderer extends MobRenderer<RobinEntity, ModelRobin<RobinEntity>> {
	public RobinRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRobin(context.bakeLayer(ModelRobin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RobinEntity entity) {
		return new ResourceLocation("foragecraft:textures/entities/robin.png");
	}
}
