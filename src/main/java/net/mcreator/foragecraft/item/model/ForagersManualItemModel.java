package net.mcreator.foragecraft.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.foragecraft.item.ForagersManualItem;

public class ForagersManualItemModel extends AnimatedGeoModel<ForagersManualItem> {
	@Override
	public ResourceLocation getAnimationResource(ForagersManualItem animatable) {
		return new ResourceLocation("foragecraft", "animations/foragersmanual.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ForagersManualItem animatable) {
		return new ResourceLocation("foragecraft", "geo/foragersmanual.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ForagersManualItem animatable) {
		return new ResourceLocation("foragecraft", "textures/items/foragersmanual.png");
	}
}
