
package net.mcreator.foragecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.foragecraft.entity.BadgerEntity;
import net.mcreator.foragecraft.client.model.ModelBadger;

public class BadgerRenderer extends MobRenderer<BadgerEntity, ModelBadger<BadgerEntity>> {
	public BadgerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBadger(context.bakeLayer(ModelBadger.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BadgerEntity entity) {
		return new ResourceLocation("foragecraft:textures/entities/badger.png");
	}
}
