
package net.mcreator.foragecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.foragecraft.entity.MyceEntity;
import net.mcreator.foragecraft.client.model.ModelMyce;

public class MyceRenderer extends MobRenderer<MyceEntity, ModelMyce<MyceEntity>> {
	public MyceRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMyce(context.bakeLayer(ModelMyce.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MyceEntity entity) {
		return new ResourceLocation("foragecraft:textures/entities/myce.png");
	}
}
