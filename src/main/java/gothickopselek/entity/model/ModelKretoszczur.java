package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelKretoszczur - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelKretoszczur extends ModelBase {
    public ModelRenderer Tw;
    public ModelRenderer Gowa;
    public ModelRenderer Noga1;
    public ModelRenderer Noga2;
    public ModelRenderer Noga3;
    public ModelRenderer Noga4;
    public ModelRenderer ogon1;
    public ModelRenderer ydka1;
    public ModelRenderer stopa1;
    public ModelRenderer ydka2;
    public ModelRenderer stopa2;
    public ModelRenderer ydka3;
    public ModelRenderer stopa3;
    public ModelRenderer ydka4;
    public ModelRenderer stopa4;

    public ModelKretoszczur() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Noga1 = new ModelRenderer(this, 2, 28);
        this.Noga1.setRotationPoint(-4.0F, 6.9F, 1.7F);
        this.Noga1.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(Noga1, 0.3497639820996636F, 0.0F, 0.0F);
        this.stopa2 = new ModelRenderer(this, 69, 12);
        this.stopa2.setRotationPoint(0.4F, 0.3F, -2.4F);
        this.stopa2.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(stopa2, -0.5323254218582705F, 0.0F, 0.0F);
        this.ydka1 = new ModelRenderer(this, 2, 16);
        this.ydka1.setRotationPoint(0.5F, 5.4F, -1.9F);
        this.ydka1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(ydka1, 0.4106759729942658F, 0.0F, 0.0F);
        this.ydka3 = new ModelRenderer(this, 31, 58);
        this.ydka3.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.ydka3.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
        this.Noga2 = new ModelRenderer(this, 85, 22);
        this.Noga2.setRotationPoint(-5.0F, 7.8F, 10.4F);
        this.Noga2.addBox(0.0F, 0.0F, 0.0F, 5, 5, 7, 0.0F);
        this.setRotateAngle(Noga2, 0.5932374127528727F, 0.0F, 0.0F);
        this.Noga4 = new ModelRenderer(this, 6, 76);
        this.Noga4.setRotationPoint(11.9F, 6.9F, 1.7F);
        this.Noga4.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(Noga4, 0.3497639820996636F, 0.0F, 0.0F);
        this.ydka2 = new ModelRenderer(this, 90, 11);
        this.ydka2.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.ydka2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
        this.stopa3 = new ModelRenderer(this, 52, 58);
        this.stopa3.setRotationPoint(0.4F, 0.3F, -2.4F);
        this.stopa3.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(stopa3, -0.5323254218582705F, 0.0F, 0.0F);
        this.Gowa = new ModelRenderer(this, 45, 22);
        this.Gowa.setRotationPoint(1.5F, 0.5F, -8.0F);
        this.Gowa.addBox(0.0F, 0.0F, 0.0F, 9, 7, 8, 0.0F);
        this.Noga3 = new ModelRenderer(this, 2, 54);
        this.Noga3.setRotationPoint(12.0F, 7.8F, 10.4F);
        this.Noga3.addBox(0.0F, 0.0F, 0.0F, 5, 5, 7, 0.0F);
        this.setRotateAngle(Noga3, 0.5932374127528727F, 0.0F, 0.0F);
        this.ogon1 = new ModelRenderer(this, 44, 0);
        this.ogon1.setRotationPoint(5.0F, 1.0F, 19.8F);
        this.ogon1.addBox(0.0F, 0.0F, 0.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(ogon1, 0.21293016874330817F, 0.0F, 0.0F);
        this.Tw = new ModelRenderer(this, 0, 20);
        this.Tw.setRotationPoint(-6.0F, 9.3F, -8.7F);
        this.Tw.addBox(0.0F, 0.0F, 0.0F, 12, 10, 20, 0.0F);
        this.stopa4 = new ModelRenderer(this, 46, 78);
        this.stopa4.setRotationPoint(0.0F, -1.4F, -1.6F);
        this.stopa4.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(stopa4, -0.7452555906015788F, 0.0F, 0.0F);
        this.stopa1 = new ModelRenderer(this, 4, 4);
        this.stopa1.setRotationPoint(0.0F, -1.4F, -1.6F);
        this.stopa1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(stopa1, -0.7452555906015788F, 0.0F, 0.0F);
        this.ydka4 = new ModelRenderer(this, 27, 77);
        this.ydka4.setRotationPoint(0.5F, 5.4F, -1.9F);
        this.ydka4.addBox(0.0F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(ydka4, 0.4106759729942658F, 0.0F, 0.0F);
        this.Tw.addChild(this.Noga1);
        this.ydka2.addChild(this.stopa2);
        this.Noga1.addChild(this.ydka1);
        this.Noga3.addChild(this.ydka3);
        this.Tw.addChild(this.Noga2);
        this.Tw.addChild(this.Noga4);
        this.Noga2.addChild(this.ydka2);
        this.ydka3.addChild(this.stopa3);
        this.Tw.addChild(this.Gowa);
        this.Tw.addChild(this.Noga3);
        this.Tw.addChild(this.ogon1);
        this.ydka4.addChild(this.stopa4);
        this.ydka1.addChild(this.stopa1);
        this.Noga4.addChild(this.ydka4);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Tw.render(f5);
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
    	this.Noga1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.Noga2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.Noga3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.Noga4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
