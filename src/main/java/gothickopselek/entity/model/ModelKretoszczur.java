package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Kretoszczur - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelKretoszczur extends ModelBase {
    public ModelRenderer Tw;
    public ModelRenderer Noga;
    public ModelRenderer Noga2;
    public ModelRenderer shape8;
    public ModelRenderer shape8_1;
    public ModelRenderer shape12;
    public ModelRenderer shape13;
    public ModelRenderer shape4;
    public ModelRenderer stopa;
    public ModelRenderer shape4_1;
    public ModelRenderer stopa_1;
    public ModelRenderer shape10;
    public ModelRenderer shape14;
    public ModelRenderer shape10_1;
    public ModelRenderer shape14_1;

    public ModelKretoszczur() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.shape13 = new ModelRenderer(this, 190, 0);
        this.shape13.setRotationPoint(-4.0F, 11.0F, 10.0F);
        this.shape13.addBox(0.0F, 0.0F, 0.0F, 8, 7, 8, 0.0F);
        this.shape10 = new ModelRenderer(this, 65, 0);
        this.shape10.setRotationPoint(0.5F, 3.0F, 2.0F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(shape10, -0.4845034003536259F, 0.0F, 0.0F);
        this.shape10_1 = new ModelRenderer(this, 65, 0);
        this.shape10_1.setRotationPoint(0.5F, 3.0F, 2.5F);
        this.shape10_1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(shape10_1, -0.48345620280242924F, 0.0F, 0.0F);
        this.Tw = new ModelRenderer(this, 0, 0);
        this.Tw.setRotationPoint(-5.5F, 10.0F, -9.0F);
        this.Tw.addBox(0.0F, 0.0F, 0.0F, 11, 9, 19, 0.0F);
        this.Noga = new ModelRenderer(this, 110, 0);
        this.Noga.setRotationPoint(5.0F, 13.0F, -7.0F);
        this.Noga.addBox(0.0F, 0.0F, 0.0F, 5, 4, 7, 0.0F);
        this.setRotateAngle(Noga, -0.455181868920118F, 0.0F, 0.0F);
        this.shape4 = new ModelRenderer(this, 140, 0);
        this.shape4.setRotationPoint(0.75F, 8.0F, 4.0F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(shape4, -4.705058597526313F, 0.0F, 0.0F);
        this.Noga2 = new ModelRenderer(this, 110, 0);
        this.Noga2.setRotationPoint(-10.5F, 13.0F, -7.0F);
        this.Noga2.addBox(0.0F, 0.0F, 0.0F, 5, 4, 7, 0.0F);
        this.setRotateAngle(Noga2, -0.453785605518535F, 0.0F, 0.0F);
        this.shape8 = new ModelRenderer(this, 90, 0);
        this.shape8.setRotationPoint(5.0F, 15.0F, 4.5F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(shape8, -0.5637413483941687F, 0.0F, 0.0F);
        this.stopa = new ModelRenderer(this, 45, 0);
        this.stopa.setRotationPoint(0.5F, 0.5F, 0.5F);
        this.stopa.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(stopa, -1.137954672300303F, 0.0F, 0.0F);
        this.stopa_1 = new ModelRenderer(this, 45, 0);
        this.stopa_1.setRotationPoint(0.5F, 0.5F, 0.5F);
        this.stopa_1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(stopa_1, -1.1388273369263F, 0.0F, 0.0F);
        this.shape14_1 = new ModelRenderer(this, 45, 0);
        this.shape14_1.setRotationPoint(0.0F, 2.5F, 2.5F);
        this.shape14_1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(shape14_1, -5.239129348636578F, 0.0F, 0.0F);
        this.shape14 = new ModelRenderer(this, 45, 0);
        this.shape14.setRotationPoint(0.0F, 2.5F, 2.5F);
        this.shape14.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(shape14, -5.253441048502932F, 0.0F, 0.0F);
        this.shape8_1 = new ModelRenderer(this, 90, 0);
        this.shape8_1.setRotationPoint(-9.5F, 15.0F, 4.5F);
        this.shape8_1.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(shape8_1, -0.5637413483941832F, 0.0F, 0.0F);
        this.shape12 = new ModelRenderer(this, 230, 0);
        this.shape12.setRotationPoint(-1.5F, 12.0F, -8.0F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(shape12, -2.0985838925979814F, 0.0F, 0.0F);
        this.shape4_1 = new ModelRenderer(this, 140, 0);
        this.shape4_1.setRotationPoint(0.5F, 8.0F, 4.0F);
        this.shape4_1.addBox(0.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(shape4_1, -4.696283993163981F, 0.0F, 0.0F);
        this.shape8.addChild(this.shape10);
        this.shape8_1.addChild(this.shape10_1);
        this.Noga.addChild(this.shape4);
        this.shape4.addChild(this.stopa);
        this.shape4_1.addChild(this.stopa_1);
        this.shape10_1.addChild(this.shape14_1);
        this.shape10.addChild(this.shape14);
        this.Noga2.addChild(this.shape4_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape13.render(f5);
        this.Tw.render(f5);
        this.Noga.render(f5);
        this.Noga2.render(f5);
        this.shape8.render(f5);
        this.shape8_1.render(f5);
        this.shape12.render(f5);
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
    	super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    	
    }
}
