package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Warg - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelWarg extends ModelBase {
    public ModelRenderer Tlow1;
    public ModelRenderer Tlow2;
    public ModelRenderer Noga1;
    public ModelRenderer Noga2;
    public ModelRenderer Glowa1;
    public ModelRenderer Tlow3;
    public ModelRenderer ogon1;
    public ModelRenderer Noga3;
    public ModelRenderer Noga4;
    public ModelRenderer Ogon2;
    public ModelRenderer Lyda3;
    public ModelRenderer Stopa3;
    public ModelRenderer Lyda4;
    public ModelRenderer Stopa4;
    public ModelRenderer Lydka1;
    public ModelRenderer Stopa1;
    public ModelRenderer Lydka2;
    public ModelRenderer Stopa2;
    public ModelRenderer glowa2;
    public ModelRenderer glowa3;
    public ModelRenderer ucho1;
    public ModelRenderer ucho1_1;
    public ModelRenderer Glowa4;
    public ModelRenderer Zab1;
    public ModelRenderer Zab1_1;
    public ModelRenderer Zab1_2;
    public ModelRenderer Zab1_3;
    public ModelRenderer Zab1_4;
    public ModelRenderer Zab1_5;
    public ModelRenderer Zab1_6;
    public ModelRenderer Zab1_7;
    public ModelRenderer Zab1_8;
    public ModelRenderer Zab1_9;
    public ModelRenderer Zab1_10;
    public ModelRenderer Zab1_11;
    public ModelRenderer Zab1_12;
    public ModelRenderer Zab1_13;
    public ModelRenderer Zab1_14;
    public ModelRenderer Zab1_15;
    public ModelRenderer Tlow4;

    public ModelWarg() {
        this.textureWidth = 500;
        this.textureHeight = 500;
        this.Zab1_2 = new ModelRenderer(this, 400, 0);
        this.Zab1_2.setRotationPoint(1.5F, -0.5F, 0.2F);
        this.Zab1_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Glowa4 = new ModelRenderer(this, 155, 250);
        this.Glowa4.setRotationPoint(0.0F, 3.3F, 0.0F);
        this.Glowa4.addBox(0.0F, 0.0F, 0.0F, 10, 2, 10, 0.0F);
        this.setRotateAngle(Glowa4, 0.091106186954104F, 0.0F, 0.0F);
        this.Lydka1 = new ModelRenderer(this, 40, 180);
        this.Lydka1.setRotationPoint(0.5F, 11.8F, 2.3F);
        this.Lydka1.addBox(0.0F, 0.0F, 0.0F, 6, 16, 8, 0.0F);
        this.setRotateAngle(Lydka1, -0.7740535232594852F, 0.0F, 0.0F);
        this.Zab1_9 = new ModelRenderer(this, 400, 0);
        this.Zab1_9.setRotationPoint(0.2F, -0.5F, 3.1F);
        this.Zab1_9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Stopa2 = new ModelRenderer(this, 80, 180);
        this.Stopa2.setRotationPoint(0.0F, 16.4F, -2.9F);
        this.Stopa2.addBox(0.0F, 0.0F, 0.0F, 6, 4, 10, 0.0F);
        this.setRotateAngle(Stopa2, 0.36425021489121656F, 0.0F, 0.0F);
        this.glowa3 = new ModelRenderer(this, 110, 250);
        this.glowa3.setRotationPoint(2.0F, 7.0F, -8.4F);
        this.glowa3.addBox(0.0F, 0.0F, 0.0F, 10, 2, 10, 0.0F);
        this.setRotateAngle(glowa3, 0.045553093477052F, 0.0F, 0.0F);
        this.Stopa4 = new ModelRenderer(this, 100, 140);
        this.Stopa4.setRotationPoint(0.0F, 8.2F, -1.4F);
        this.Stopa4.addBox(0.0F, 0.0F, 0.0F, 6, 4, 10, 0.0F);
        this.setRotateAngle(Stopa4, -0.36425021489121656F, 0.0F, 0.0F);
        this.Zab1_11 = new ModelRenderer(this, 400, 0);
        this.Zab1_11.setRotationPoint(0.2F, -0.5F, 6.4F);
        this.Zab1_11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Zab1_3 = new ModelRenderer(this, 400, 0);
        this.Zab1_3.setRotationPoint(2.7F, -0.5F, 0.2F);
        this.Zab1_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Zab1_13 = new ModelRenderer(this, 400, 0);
        this.Zab1_13.setRotationPoint(8.7F, -0.5F, 2.8F);
        this.Zab1_13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Stopa3 = new ModelRenderer(this, 100, 140);
        this.Stopa3.setRotationPoint(0.0F, 8.2F, -1.4F);
        this.Stopa3.addBox(0.0F, 0.0F, 0.0F, 6, 4, 10, 0.0F);
        this.setRotateAngle(Stopa3, -0.36425021489121656F, 0.0F, 0.0F);
        this.Zab1_14 = new ModelRenderer(this, 400, 0);
        this.Zab1_14.setRotationPoint(8.7F, -0.5F, 4.2F);
        this.Zab1_14.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Zab1_15 = new ModelRenderer(this, 400, 0);
        this.Zab1_15.setRotationPoint(8.7F, -0.5F, 5.6F);
        this.Zab1_15.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.glowa2 = new ModelRenderer(this, 50, 240);
        this.glowa2.setRotationPoint(-2.0F, -0.5F, -10.4F);
        this.glowa2.addBox(0.0F, 0.0F, 0.0F, 14, 12, 12, 0.0F);
        this.setRotateAngle(glowa2, 0.091106186954104F, 0.0F, 0.0F);
        this.Tlow1 = new ModelRenderer(this, 15, 15);
        this.Tlow1.setRotationPoint(-10.5F, -11.3F, -26.4F);
        this.Tlow1.addBox(0.0F, 0.0F, 0.0F, 20, 17, 23, 0.0F);
        this.Glowa1 = new ModelRenderer(this, 0, 240);
        this.Glowa1.setRotationPoint(5.0F, 1.0F, -3.1F);
        this.Glowa1.addBox(0.0F, 0.0F, 0.0F, 10, 10, 4, 0.0F);
        this.setRotateAngle(Glowa1, 0.045553093477052F, 0.0F, 0.0F);
        this.Zab1_1 = new ModelRenderer(this, 400, 0);
        this.Zab1_1.setRotationPoint(8.7F, -1.0F, 0.2F);
        this.Zab1_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Tlow2 = new ModelRenderer(this, 100, 1);
        this.Tlow2.setRotationPoint(1.0F, 0.0F, 38.6F);
        this.Tlow2.addBox(0.0F, 0.0F, 0.0F, 18, 16, 15, 0.0F);
        this.setRotateAngle(Tlow2, -0.18203784098300857F, 0.0F, 0.0F);
        this.ucho1_1 = new ModelRenderer(this, 50, 300);
        this.ucho1_1.setRotationPoint(11.0F, 0.5F, 6.0F);
        this.ucho1_1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(ucho1_1, 0.8651597102135892F, 0.0F, 0.0F);
        this.Noga1 = new ModelRenderer(this, 0, 180);
        this.Noga1.setRotationPoint(-7.0F, 7.0F, 3.0F);
        this.Noga1.addBox(0.0F, 0.0F, 0.0F, 7, 18, 8, 0.0F);
        this.setRotateAngle(Noga1, 0.40980330836826856F, 0.0F, 0.0F);
        this.Noga4 = new ModelRenderer(this, 0, 140);
        this.Noga4.setRotationPoint(18.0F, 9.0F, 9.0F);
        this.Noga4.addBox(0.0F, 0.0F, 0.0F, 7, 14, 8, 0.0F);
        this.setRotateAngle(Noga4, -0.18203784098300857F, 0.0F, 0.0F);
        this.Zab1_7 = new ModelRenderer(this, 400, 0);
        this.Zab1_7.setRotationPoint(7.5F, -0.5F, 0.2F);
        this.Zab1_7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Tlow3 = new ModelRenderer(this, 183, 0);
        this.Tlow3.setRotationPoint(1.4F, 0.2F, 16.6F);
        this.Tlow3.addBox(0.0F, 0.0F, 0.0F, 17, 15, 12, 0.0F);
        this.setRotateAngle(Tlow3, 0.18203784098300857F, 0.0F, 0.0F);
        this.Zab1_5 = new ModelRenderer(this, 400, 0);
        this.Zab1_5.setRotationPoint(5.1F, -0.5F, 0.2F);
        this.Zab1_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Zab1_4 = new ModelRenderer(this, 400, 0);
        this.Zab1_4.setRotationPoint(3.9F, -0.5F, 0.2F);
        this.Zab1_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Stopa1 = new ModelRenderer(this, 80, 180);
        this.Stopa1.setRotationPoint(0.0F, 16.4F, -2.9F);
        this.Stopa1.addBox(0.0F, 0.0F, 0.0F, 6, 4, 10, 0.0F);
        this.setRotateAngle(Stopa1, 0.36425021489121656F, 0.0F, 0.0F);
        this.ucho1 = new ModelRenderer(this, 0, 300);
        this.ucho1.setRotationPoint(1.0F, 0.5F, 6.0F);
        this.ucho1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(ucho1, 0.8651597102135892F, 0.0F, 0.0F);
        this.Zab1_6 = new ModelRenderer(this, 400, 0);
        this.Zab1_6.setRotationPoint(6.3F, -0.5F, 0.2F);
        this.Zab1_6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Zab1_10 = new ModelRenderer(this, 400, 0);
        this.Zab1_10.setRotationPoint(0.2F, -0.5F, 4.6F);
        this.Zab1_10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Zab1_8 = new ModelRenderer(this, 400, 0);
        this.Zab1_8.setRotationPoint(0.2F, -0.5F, 1.6F);
        this.Zab1_8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Lydka2 = new ModelRenderer(this, 40, 180);
        this.Lydka2.setRotationPoint(0.5F, 12.5F, 2.2F);
        this.Lydka2.addBox(0.0F, 0.0F, 0.0F, 6, 16, 8, 0.0F);
        this.setRotateAngle(Lydka2, -0.7740535232594852F, 0.0F, 0.0F);
        this.Lyda3 = new ModelRenderer(this, 50, 140);
        this.Lyda3.setRotationPoint(0.5F, 14.0F, 0.0F);
        this.Lyda3.addBox(0.0F, 0.0F, 0.0F, 6, 12, 8, 0.0F);
        this.setRotateAngle(Lyda3, 0.7740535232594852F, 0.0F, 0.0F);
        this.Zab1_12 = new ModelRenderer(this, 400, 0);
        this.Zab1_12.setRotationPoint(8.7F, -0.5F, 1.5F);
        this.Zab1_12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Ogon2 = new ModelRenderer(this, 30, 80);
        this.Ogon2.setRotationPoint(0.0F, 14.1F, 0.0F);
        this.Ogon2.addBox(0.0F, 0.0F, 0.0F, 5, 12, 2, 0.0F);
        this.setRotateAngle(Ogon2, -0.18203784098300857F, 0.0F, 0.0F);
        this.ogon1 = new ModelRenderer(this, 0, 80);
        this.ogon1.setRotationPoint(7.0F, 1.5F, 13.0F);
        this.ogon1.addBox(0.0F, 0.0F, 0.0F, 5, 15, 2, 0.0F);
        this.setRotateAngle(ogon1, 0.31869712141416456F, 0.0F, 0.0F);
        this.Noga2 = new ModelRenderer(this, 0, 180);
        this.Noga2.setRotationPoint(20.2F, 7.0F, 3.0F);
        this.Noga2.addBox(0.0F, 0.0F, 0.0F, 7, 18, 8, 0.0F);
        this.setRotateAngle(Noga2, 0.40980330836826856F, 0.0F, 0.0F);
        this.Zab1 = new ModelRenderer(this, 400, 0);
        this.Zab1.setRotationPoint(0.3F, -1.0F, 0.2F);
        this.Zab1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Noga3 = new ModelRenderer(this, 0, 140);
        this.Noga3.setRotationPoint(-7.0F, 9.5F, 4.5F);
        this.Noga3.addBox(0.0F, 0.0F, 0.0F, 7, 14, 8, 0.0F);
        this.setRotateAngle(Noga3, -0.18203784098300857F, 0.0F, 0.0F);
        this.Lyda4 = new ModelRenderer(this, 50, 140);
        this.Lyda4.setRotationPoint(0.5F, 14.0F, 0.0F);
        this.Lyda4.addBox(0.0F, 0.0F, 0.0F, 6, 12, 8, 0.0F);
        this.setRotateAngle(Lyda4, 0.7740535232594852F, 0.0F, 0.0F);
        this.Tlow4 = new ModelRenderer(this, 264, 0);
        this.Tlow4.setRotationPoint(1.0F, 0.0F, 10.9F);
        this.Tlow4.addBox(0.0F, 0.0F, 0.0F, 15, 13, 12, 0.0F);
        this.setRotateAngle(Tlow4, -0.36425021489121656F, 0.0F, 0.0F);
        this.Glowa4.addChild(this.Zab1_2);
        this.glowa3.addChild(this.Glowa4);
        this.Noga1.addChild(this.Lydka1);
        this.Glowa4.addChild(this.Zab1_9);
        this.Lydka2.addChild(this.Stopa2);
        this.glowa2.addChild(this.glowa3);
        this.Lyda4.addChild(this.Stopa4);
        this.Glowa4.addChild(this.Zab1_11);
        this.Glowa4.addChild(this.Zab1_3);
        this.Glowa4.addChild(this.Zab1_13);
        this.Lyda3.addChild(this.Stopa3);
        this.Glowa4.addChild(this.Zab1_14);
        this.Glowa4.addChild(this.Zab1_15);
        this.Glowa1.addChild(this.glowa2);
        this.Tlow1.addChild(this.Glowa1);
        this.Glowa4.addChild(this.Zab1_1);
        this.Tlow1.addChild(this.Tlow2);
        this.glowa2.addChild(this.ucho1_1);
        this.Tlow1.addChild(this.Noga1);
        this.Tlow2.addChild(this.Noga4);
        this.Glowa4.addChild(this.Zab1_7);
        this.Tlow1.addChild(this.Tlow3);
        this.Glowa4.addChild(this.Zab1_5);
        this.Glowa4.addChild(this.Zab1_4);
        this.Lydka1.addChild(this.Stopa1);
        this.glowa2.addChild(this.ucho1);
        this.Glowa4.addChild(this.Zab1_6);
        this.Glowa4.addChild(this.Zab1_10);
        this.Glowa4.addChild(this.Zab1_8);
        this.Noga2.addChild(this.Lydka2);
        this.Noga3.addChild(this.Lyda3);
        this.Glowa4.addChild(this.Zab1_12);
        this.ogon1.addChild(this.Ogon2);
        this.Tlow2.addChild(this.ogon1);
        this.Tlow1.addChild(this.Noga2);
        this.Glowa4.addChild(this.Zab1);
        this.Tlow2.addChild(this.Noga3);
        this.Noga4.addChild(this.Lyda4);
        this.Tlow3.addChild(this.Tlow4);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Tlow1.render(f5);
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
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
    		float headPitch, float scaleFactor, Entity entityIn) 
    {
        this.Noga1.rotateAngleX = 0.40980330836826856F + MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.Noga2.rotateAngleX = 0.40980330836826856F + MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.Noga3.rotateAngleX = -0.18203784098300857F + MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.Noga4.rotateAngleX = -0.18203784098300857F + MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
