package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * kretoszczurv4 - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelKretoszczur extends ModelBase {
    public ModelRenderer Tlow;
    public ModelRenderer Noga1;
    public ModelRenderer Glowa;
    public ModelRenderer Ogon;
    public ModelRenderer Noga2;
    public ModelRenderer Noga3;
    public ModelRenderer Noga4;
    public ModelRenderer Lydka2;
    public ModelRenderer Stopa2;
    public ModelRenderer Lydka3;
    public ModelRenderer stopa3;
    public ModelRenderer Lydka4;
    public ModelRenderer stopa3_1;
    public ModelRenderer Lydka1;
    public ModelRenderer Stopa1;

    public ModelKretoszczur() {
        this.textureWidth = 500;
        this.textureHeight = 500;
        this.Stopa1 = new ModelRenderer(this, 125, 105);
        this.Stopa1.setRotationPoint(0.0F, 13.8F, -5.5F);
        this.Stopa1.addBox(0.0F, 0.0F, 0.0F, 8, 15, 5, 0.0F);
        this.setRotateAngle(Stopa1, 1.0471975511965976F, 0.0F, 0.0F);
        this.stopa3 = new ModelRenderer(this, 100, 210);
        this.stopa3.setRotationPoint(0.0F, 20.1F, -3.7F);
        this.stopa3.addBox(0.0F, 0.0F, 0.0F, 7, 4, 10, 0.0F);
        this.setRotateAngle(stopa3, 1.0016444577195458F, 0.0F, 0.0F);
        this.Noga2 = new ModelRenderer(this, 10, 100);
        this.Noga2.setRotationPoint(33.8F, 12.8F, 39.3F);
        this.Noga2.addBox(0.0F, 0.0F, 0.0F, 10, 16, 11, 0.0F);
        this.setRotateAngle(Noga2, -0.9983283321407564F, 0.0F, 0.0F);
        this.Stopa2 = new ModelRenderer(this, 125, 105);
        this.Stopa2.setRotationPoint(0.0F, 13.8F, -5.5F);
        this.Stopa2.addBox(0.0F, 0.0F, 0.0F, 8, 15, 5, 0.0F);
        this.setRotateAngle(Stopa2, 1.0471975511965976F, 0.0F, 0.0F);
        this.Ogon = new ModelRenderer(this, 290, 30);
        this.Ogon.setRotationPoint(14.2F, 2.4F, 46.6F);
        this.Ogon.addBox(0.0F, 0.0F, 0.0F, 6, 22, 4, 0.0F);
        this.setRotateAngle(Ogon, 0.22759093446006054F, 0.0F, 0.0F);
        this.Lydka1 = new ModelRenderer(this, 70, 100);
        this.Lydka1.setRotationPoint(1.0F, 15.8F, 1.5F);
        this.Lydka1.addBox(0.0F, 0.0F, 0.0F, 8, 17, 10, 0.0F);
        this.setRotateAngle(Lydka1, 1.5481070465189704F, 0.0F, 0.0F);
        this.Lydka4 = new ModelRenderer(this, 60, 205);
        this.Lydka4.setRotationPoint(1.1F, 13.5F, 8.8F);
        this.Lydka4.addBox(0.0F, 0.0F, 0.0F, 7, 14, 5, 0.0F);
        this.setRotateAngle(Lydka4, -1.5481070465189704F, 0.0F, 0.0F);
        this.stopa3_1 = new ModelRenderer(this, 100, 210);
        this.stopa3_1.setRotationPoint(0.0F, 20.1F, -3.7F);
        this.stopa3_1.addBox(0.0F, 0.0F, 0.0F, 7, 4, 10, 0.0F);
        this.setRotateAngle(stopa3_1, 1.0016444577195458F, 0.0F, 0.0F);
        this.Tlow = new ModelRenderer(this, 0, 0);
        this.Tlow.setRotationPoint(-16.0F, -13.5F, -20.0F);
        this.Tlow.addBox(0.0F, 0.0F, 0.0F, 34, 26, 48, 0.0F);
        this.Lydka3 = new ModelRenderer(this, 60, 205);
        this.Lydka3.setRotationPoint(1.1F, 13.5F, 8.8F);
        this.Lydka3.addBox(0.0F, 0.0F, 0.0F, 7, 14, 5, 0.0F);
        this.setRotateAngle(Lydka3, -1.5481070465189704F, 0.0F, 0.0F);
        this.Noga1 = new ModelRenderer(this, 10, 100);
        this.Noga1.setRotationPoint(-9.9F, 1.0F, 39.3F);
        this.Noga1.addBox(0.0F, 0.0F, 0.0F, 10, 16, 11, 0.0F);
        this.setRotateAngle(Noga1, -0.9998991284675514F, 0.0F, 0.0F);
        this.Glowa = new ModelRenderer(this, 171, 27);
        this.Glowa.setRotationPoint(4.0F, 1.1F, -22.2F);
        this.Glowa.addBox(0.0F, 0.0F, 0.0F, 26, 18, 24, 0.0F);
        this.Noga3 = new ModelRenderer(this, 10, 200);
        this.Noga3.setRotationPoint(-8.5F, 19.3F, 1.4F);
        this.Noga3.addBox(0.0F, 0.0F, 0.0F, 9, 16, 9, 0.0F);
        this.setRotateAngle(Noga3, 0.5846852994181004F, 0.0F, 0.0F);
        this.Lydka2 = new ModelRenderer(this, 70, 100);
        this.Lydka2.setRotationPoint(1.0F, 15.8F, 1.5F);
        this.Lydka2.addBox(0.0F, 0.0F, 0.0F, 8, 17, 10, 0.0F);
        this.setRotateAngle(Lydka2, 1.5481070465189704F, 0.0F, 0.0F);
        this.Noga4 = new ModelRenderer(this, 10, 200);
        this.Noga4.setRotationPoint(33.5F, 19.3F, 1.4F);
        this.Noga4.addBox(0.0F, 0.0F, 0.0F, 9, 16, 9, 0.0F);
        this.setRotateAngle(Noga4, 0.5846852994181004F, 0.0F, 0.0F);
        this.Lydka1.addChild(this.Stopa1);
        this.Lydka3.addChild(this.stopa3);
        this.Tlow.addChild(this.Noga2);
        this.Lydka2.addChild(this.Stopa2);
        this.Tlow.addChild(this.Ogon);
        this.Noga1.addChild(this.Lydka1);
        this.Noga4.addChild(this.Lydka4);
        this.Lydka4.addChild(this.stopa3_1);
        this.Noga3.addChild(this.Lydka3);
        this.Tlow.addChild(this.Glowa);
        this.Tlow.addChild(this.Noga3);
        this.Noga2.addChild(this.Lydka2);
        this.Tlow.addChild(this.Noga4);
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
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.Noga1.rotateAngleX = -0.9998991284675514F + MathHelper.cos(limbSwing * 0.6662F) * 0.6F * limbSwingAmount;
    	this.Noga4.rotateAngleX = 0.5846852994181004F + MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.6F * limbSwingAmount;
    	this.Noga3.rotateAngleX = 0.5846852994181004F + MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.6F * limbSwingAmount;
    	this.Noga2.rotateAngleX = -0.9983283321407564F + MathHelper.cos(limbSwing * 0.6662F) * 0.6F * limbSwingAmount;
    }
    
}
