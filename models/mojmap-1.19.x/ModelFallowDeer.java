// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFallowDeer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fallowdeer"), "main");
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;
	private final ModelPart tail;
	private final ModelPart bb_main;

	public ModelFallowDeer(ModelPart root) {
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.tail = root.getChild("tail");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = leg1
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(14, 44).addBox(2.0F, -12.0F, 2.0F, 2.0F, 12.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r2 = leg2
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(22, 48).addBox(2.0F, -12.0F, -6.0F, 2.0F, 12.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = leg3
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(42, 40).addBox(-12.0F, -12.0F, 2.0F, 2.0F, 12.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r4 = leg4
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(0, 46).addBox(-12.0F, -12.0F, -6.0F, 2.0F, 12.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r5 = tail
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -16.0F, -2.0F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(16, 36)
						.addBox(12.0F, -24.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
						.addBox(10.0F, -22.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(6.0F, -28.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 24)
						.addBox(6.0F, -28.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 36)
						.addBox(14.0F, -24.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 30)
						.addBox(10.0F, -26.0F, -4.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-10.0F, -20.0F, -4.0F, 12.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(6.0F, -28.0F, -4.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(6.0F, -22.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
						.addBox(4.0F, -20.0F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(8.0F, -22.0F, -4.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 24)
						.addBox(4.0F, -18.0F, -4.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 18)
						.addBox(6.0F, -20.0F, -4.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-12.0F, -18.0F, -6.0F, 16.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}