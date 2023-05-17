// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRedSquirrel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "redsquirrel"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bb_main;

	public ModelRedSquirrel(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(8, 4).addBox(
				-0.5F, -0.5F, 1.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 10).addBox(
				-0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(7, 9).addBox(
				-2.0F, -0.5F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(3, 9).addBox(
				-2.0F, -0.5F, 1.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -1.5F, 0.0F, 2.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(4, 3)
						.addBox(-3.0F, -1.5F, 0.5F, 1.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-3.0F, -2.0F, 0.5F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(-2.5F, -2.5F, 0.5F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(3, 7)
						.addBox(-1.5F, -2.0F, 0.5F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(7, 2)
						.addBox(-2.0F, -2.5F, 0.5F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(0.0F, -2.5F, 0.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(0.0F, -2.5F, 1.0F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(5, 5)
						.addBox(1.0F, -1.5F, 0.5F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}