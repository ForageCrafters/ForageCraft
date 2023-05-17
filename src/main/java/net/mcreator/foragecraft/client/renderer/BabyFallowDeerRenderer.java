
package net.mcreator.foragecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.foragecraft.entity.BabyFallowDeerEntity;
import net.mcreator.foragecraft.client.model.ModelBabyFallowDeer;

public class BabyFallowDeerRenderer extends MobRenderer<BabyFallowDeerEntity, ModelBabyFallowDeer<BabyFallowDeerEntity>> {
	public BabyFallowDeerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBabyFallowDeer(context.bakeLayer(ModelBabyFallowDeer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BabyFallowDeerEntity entity) {
		return new ResourceLocation("foragecraft:textures/entities/babyfallowdeer.png");
	}
}
