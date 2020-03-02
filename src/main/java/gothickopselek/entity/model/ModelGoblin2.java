package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * CzarnyGoblin - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelGoblin2 extends ModelBase {
    public ModelRenderer Tlow;
    public ModelRenderer Noga1;
    public ModelRenderer Reka1;
    public ModelRenderer Noga2;
    public ModelRenderer Reka2;
    public ModelRenderer Glowa;
    public ModelRenderer Lydka1;
    public ModelRenderer Lydka2;

    public ModelGoblin2() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.Noga2 = new ModelRenderer(this, 50, 50);
        this.Noga2.setRotationPoint(0.0F, 23.5F, 2.2F);
        this.Noga2.addBox(0.0F, 0.0F, 0.0F, 10, 16, 10, 0.0F);
        this.setRotateAngle(Noga2, -0.6829473363053812F, 0.0F, 0.0F);
        this.Noga1 = new ModelRenderer(this, 50, 50);
        this.Noga1.setRotationPoint(11.9F, 23.5F, 2.2F);
        this.Noga1.addBox(0.0F, 0.0F, 0.0F, 10, 16, 10, 0.0F);
        this.setRotateAngle(Noga1, -0.6829473363053812F, 0.0F, 0.0F);
        this.Reka2 = new ModelRenderer(this, 0, 60);
        this.Reka2.setRotationPoint(22.0F, 0.5F, 1.5F);
        this.Reka2.addBox(0.0F, 0.0F, 0.0F, 8, 25, 8, 0.0F);
        this.setRotateAngle(Reka2, -0.22759093446006054F, 0.0F, 0.0F);
        this.Lydka2 = new ModelRenderer(this, 100, 50);
        this.Lydka2.setRotationPoint(0.0F, 15.7F, 0.0F);
        this.Lydka2.addBox(0.0F, 0.0F, 0.0F, 10, 10, 10, 0.0F);
        this.setRotateAngle(Lydka2, 0.6373942428283291F, 0.0F, 0.0F);
        this.Tlow = new ModelRenderer(this, 0, 0);
        this.Tlow.setRotationPoint(-11.5F, -21.2F, -5.0F);
        this.Tlow.addBox(0.0F, 0.0F, 0.0F, 22, 30, 10, 0.0F);
        this.setRotateAngle(Tlow, 0.18203784098300857F, 0.0F, 0.0F);
        this.Reka1 = new ModelRenderer(this, 0, 60);
        this.Reka1.setRotationPoint(-8.0F, 0.5F, 1.5F);
        this.Reka1.addBox(0.0F, 0.0F, 0.0F, 8, 26, 8, 0.0F);
        this.setRotateAngle(Reka1, -0.22759093446006054F, 0.0F, 0.0F);
        this.Lydka1 = new ModelRenderer(this, 100, 50);
        this.Lydka1.setRotationPoint(0.0F, 15.7F, 0.0F);
        this.Lydka1.addBox(0.0F, 0.0F, 0.0F, 10, 10, 10, 0.0F);
        this.setRotateAngle(Lydka1, 0.6373942428283291F, 0.0F, 0.0F);
        this.Glowa = new ModelRenderer(this, 120, 0);
        this.Glowa.setRotationPoint(2.0F, -18.0F, -4.0F);
        this.Glowa.addBox(0.0F, 0.0F, 0.0F, 18, 18, 18, 0.0F);
        this.Tlow.addChild(this.Noga2);
        this.Tlow.addChild(this.Noga1);
        this.Tlow.addChild(this.Reka2);
        this.Noga2.addChild(this.Lydka2);
        this.Tlow.addChild(this.Reka1);
        this.Noga1.addChild(this.Lydka1);
        this.Tlow.addChild(this.Glowa);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Tlow.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
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
