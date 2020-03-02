package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelGoblin extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer Noga1;
	private final ModelRenderer Lydka1;
	private final ModelRenderer Noga2;
	private final ModelRenderer Lydka2;

	public ModelGoblin() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone, 0.0873F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 36, -10.5F, -47.26F, 1.5F, 22, 30, 10, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -8.5F, -65.164F, -3.748F, 18, 18, 18, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone3, -0.1745F, 0.0F, 0.0F);
		bone.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 64, 28, -18.5F, -46.28F, -5.224F, 8, 26, 8, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 64, 64, 11.5F, -46.0F, -5.064F, 8, 26, 8, 0.0F, false));

		Noga1 = new ModelRenderer(this);
		Noga1.setRotationPoint(1.5F, 1.6F, 0.744F);
		setRotationAngle(Noga1, -0.4136F, 0.0F, 0.0F);
		Noga1.cubeList.add(new ModelBox(Noga1, 72, 0, 0.0F, 0.0F, 0.0F, 10, 16, 10, 0.0F, false));

		Lydka1 = new ModelRenderer(this);
		Lydka1.setRotationPoint(0.0F, 15.7F, 0.0F);
		setRotationAngle(Lydka1, 0.6374F, 0.0F, 0.0F);
		Noga1.addChild(Lydka1);
		Lydka1.cubeList.add(new ModelBox(Lydka1, 86, 88, 0.0F, 0.0F, 0.0F, 10, 10, 10, 0.0F, false));

		Noga2 = new ModelRenderer(this);
		Noga2.setRotationPoint(-10.5F, 1.6F, 0.744F);
		setRotationAngle(Noga2, -0.4136F, 0.0F, 0.0F);
		Noga2.cubeList.add(new ModelBox(Noga2, 0, 76, 0.0F, 0.0F, 0.0F, 10, 16, 10, 0.0F, false));

		Lydka2 = new ModelRenderer(this);
		Lydka2.setRotationPoint(0.0F, 15.7F, 0.0F);
		setRotationAngle(Lydka2, 0.6374F, 0.0F, 0.0F);
		Noga2.addChild(Lydka2);
		Lydka2.cubeList.add(new ModelBox(Lydka2, 88, 52, 0.0F, 0.0F, 0.0F, 10, 10, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		Noga1.render(f5);
		Noga2.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    	this.Noga1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.6F * limbSwingAmount;
    	this.Noga2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.6F * limbSwingAmount;
    }
}
