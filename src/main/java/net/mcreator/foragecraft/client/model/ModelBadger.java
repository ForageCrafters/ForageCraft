package net.mcreator.foragecraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBadger<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("foragecraft", "model_badger"), "main");
	public final ModelPart tail;
	public final ModelPart rfrontleg;
	public final ModelPart lfrontleg;
	public final ModelPart rhindleg;
	public final ModelPart lhindleg;
	public final ModelPart head;
	public final ModelPart bb_main;

	public ModelBadger(ModelPart root) {
		this.tail = root.getChild("tail");
		this.rfrontleg = root.getChild("rfrontleg");
		this.lfrontleg = root.getChild("lfrontleg");
		this.rhindleg = root.getChild("rhindleg");
		this.lhindleg = root.getChild("lhindleg");
		this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 3).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 1.0F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 4.0F));
		PartDefinition rfrontleg = partdefinition.addOrReplaceChild("rfrontleg", CubeListBuilder.create().texOffs(0, 8).addBox(-3.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition lfrontleg = partdefinition.addOrReplaceChild("lfrontleg", CubeListBuilder.create().texOffs(3, 7).addBox(2.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition rhindleg = partdefinition.addOrReplaceChild("rhindleg", CubeListBuilder.create().texOffs(6, 8).addBox(-3.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition lhindleg = partdefinition.addOrReplaceChild("lhindleg", CubeListBuilder.create().texOffs(0, 6).addBox(2.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(4, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 5).addBox(1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 3)
						.addBox(-2.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, -5.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(2, 2).addBox(-3.0F, -3.0F, -4.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(9, 9).addBox(-2.0F, -3.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 9)
						.addBox(-2.0F, -3.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 4).addBox(-2.0F, -4.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rfrontleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lfrontleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rhindleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lhindleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
