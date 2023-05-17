
package net.mcreator.foragecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.foragecraft.entity.FallowDeerEntity;
import net.mcreator.foragecraft.client.model.ModelFallowDeer;

public class FallowDeerRenderer extends MobRenderer<FallowDeerEntity, ModelFallowDeer<FallowDeerEntity>> {
	public FallowDeerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFallowDeer(context.bakeLayer(ModelFallowDeer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FallowDeerEntity entity) {
		return new ResourceLocation("foragecraft:textures/entities/fallowdeertexture.png");
	}
}
