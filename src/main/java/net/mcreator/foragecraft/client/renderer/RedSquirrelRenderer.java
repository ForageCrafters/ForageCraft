
package net.mcreator.foragecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.foragecraft.entity.RedSquirrelEntity;
import net.mcreator.foragecraft.client.model.ModelRedSquirrel;

public class RedSquirrelRenderer extends MobRenderer<RedSquirrelEntity, ModelRedSquirrel<RedSquirrelEntity>> {
	public RedSquirrelRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRedSquirrel(context.bakeLayer(ModelRedSquirrel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedSquirrelEntity entity) {
		return new ResourceLocation("foragecraft:textures/entities/redsquirrel.png");
	}
}
