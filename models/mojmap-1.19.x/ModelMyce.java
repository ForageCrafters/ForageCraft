// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMyce<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "myce"), "main");
	private final ModelPart leftleg;
	private final ModelPart rightleg;
	private final ModelPart body;
	private final ModelPart head;

	public ModelMyce(ModelPart root) {
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create(),
				PartPose.offset(1.5F, 20.5F, 0.0F));

		PartDefinition cube_r1 = leftleg
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(4, 3).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create(),
				PartPose.offset(-1.5F, 20.5F, 0.0F));

		PartDefinition cube_r2 = rightleg
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 19.25F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(22, 18)
						.addBox(-2.0F, -1.0F, -3.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 8)
						.addBox(-3.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.25F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.5833F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-3.0F, -4.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-4.0F, -3.0F, -3.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-3.0F, -3.0F, -4.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(20, 12)
						.addBox(-5.0F, -3.0F, -2.0F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -3.0F, -5.0F, 4.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(20, 27)
						.addBox(-2.0F, -5.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.4167F, 0.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}