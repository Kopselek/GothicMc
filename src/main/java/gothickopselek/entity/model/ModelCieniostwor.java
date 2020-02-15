package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Cieniostworv2 - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelCieniostwor extends ModelBase {
    public ModelRenderer Tw;
    public ModelRenderer Tw2;
    public ModelRenderer Tw3;
    public ModelRenderer Noga1;
    public ModelRenderer Noga2;
    public ModelRenderer lydka1;
    public ModelRenderer stopa1;
    public ModelRenderer lydka2;
    public ModelRenderer stopa2;
    public ModelRenderer Noga3;
    public ModelRenderer Noga4;
    public ModelRenderer szyja;
    public ModelRenderer lydka3;
    public ModelRenderer stopa3;
    public ModelRenderer lydka4;
    public ModelRenderer stopa4;
    public ModelRenderer gowa;
    public ModelRenderer Rog1;
    public ModelRenderer Broda;
    public ModelRenderer Rog2;
    public ModelRenderer Broda2;

    public ModelCieniostwor() {
        this.textureWidth = 500;
        this.textureHeight = 500;
        this.Noga4 = new ModelRenderer(this, 10, 250);
        this.Noga4.setRotationPoint(46.0F, 18.3F, 7.3F);
        this.Noga4.addBox(0.0F, 0.0F, 0.0F, 16, 18, 16, 0.0F);
        this.setRotateAngle(Noga4, 0.2326523892908441F, 0.0F, 0.0F);
        this.stopa3 = new ModelRenderer(this, 164, 208);
        this.stopa3.setRotationPoint(0.0F, 24.8F, -7.1F);
        this.stopa3.addBox(0.0F, 0.0F, 0.0F, 16, 9, 19, 0.0F);
        this.setRotateAngle(stopa3, 0.4754276882432553F, 0.0F, 0.0F);
        this.stopa4 = new ModelRenderer(this, 168, 260);
        this.stopa4.setRotationPoint(0.0F, 24.8F, -7.1F);
        this.stopa4.addBox(0.0F, 0.0F, 0.0F, 16, 9, 19, 0.0F);
        this.setRotateAngle(stopa4, 0.4754276882432553F, 0.0F, 0.0F);
        this.gowa = new ModelRenderer(this, 100, 350);
        this.gowa.setRotationPoint(-4.2F, -2.4F, -21.6F);
        this.gowa.addBox(0.0F, 0.0F, 0.0F, 34, 26, 25, 0.0F);
        this.setRotateAngle(gowa, 0.18203784098300857F, 0.0F, 0.0F);
        this.lydka2 = new ModelRenderer(this, 80, 147);
        this.lydka2.setRotationPoint(0.0F, 21.3F, 0.0F);
        this.lydka2.addBox(0.0F, 0.0F, 0.0F, 12, 17, 12, 0.0F);
        this.setRotateAngle(lydka2, 0.5462880558742251F, 0.0F, 0.0F);
        this.lydka3 = new ModelRenderer(this, 90, 200);
        this.lydka3.setRotationPoint(0.0F, 9.1F, 5.2F);
        this.lydka3.addBox(0.0F, 0.0F, 0.0F, 16, 24, 14, 0.0F);
        this.setRotateAngle(lydka3, -0.6829473363053812F, 0.0F, 0.0F);
        this.Noga1 = new ModelRenderer(this, 8, 88);
        this.Noga1.setRotationPoint(-11.8F, 13.4F, 12.1F);
        this.Noga1.addBox(0.0F, 0.0F, 0.0F, 12, 22, 14, 0.0F);
        this.stopa2 = new ModelRenderer(this, 139, 148);
        this.stopa2.setRotationPoint(0.0F, 9.5F, -5.7F);
        this.stopa2.addBox(0.0F, 0.0F, 0.0F, 12, 6, 19, 0.0F);
        this.setRotateAngle(stopa2, -0.36425021489121656F, 0.0F, 0.0F);
        this.szyja = new ModelRenderer(this, 10, 340);
        this.szyja.setRotationPoint(10.0F, -0.3F, -6.5F);
        this.szyja.addBox(0.0F, 0.0F, 0.0F, 26, 17, 11, 0.0F);
        this.setRotateAngle(szyja, -0.1785471824790199F, 0.0F, 0.0F);
        this.Noga2 = new ModelRenderer(this, 18, 140);
        this.Noga2.setRotationPoint(37.9F, 13.4F, 12.1F);
        this.Noga2.addBox(0.0F, 0.0F, 0.0F, 12, 22, 14, 0.0F);
        this.Rog2 = new ModelRenderer(this, 315, 423);
        this.Rog2.setRotationPoint(1.0F, -10.0F, 4.5F);
        this.Rog2.addBox(0.0F, 0.0F, 0.0F, 6, 12, 7, 0.0F);
        this.setRotateAngle(Rog2, -0.36425021489121656F, 0.0F, 0.0F);
        this.Tw = new ModelRenderer(this, 0, 0);
        this.Tw.setRotationPoint(-19.0F, -31.5F, -12.0F);
        this.Tw.addBox(0.0F, 0.0F, 0.0F, 42, 30, 36, 0.0F);
        this.setRotateAngle(Tw, -0.055326937288220246F, 0.0F, 0.0F);
        this.Broda2 = new ModelRenderer(this, 0, 0);
        this.Broda2.setRotationPoint(4.4F, 3.3F, 2.0F);
        this.Broda2.addBox(0.0F, 0.0F, 0.0F, 9, 5, 4, 0.0F);
        this.Noga3 = new ModelRenderer(this, 10, 200);
        this.Noga3.setRotationPoint(-15.9F, 18.3F, 7.3F);
        this.Noga3.addBox(0.0F, 0.0F, 0.0F, 16, 18, 16, 0.0F);
        this.setRotateAngle(Noga3, 0.2326523892908441F, 0.0F, 0.0F);
        this.Tw3 = new ModelRenderer(this, 326, 9);
        this.Tw3.setRotationPoint(-1.8F, 2.0F, -23.1F);
        this.Tw3.addBox(0.0F, 0.0F, 0.0F, 46, 33, 38, 0.0F);
        this.setRotateAngle(Tw3, 0.09302604913129776F, 0.0F, 0.0F);
        this.stopa1 = new ModelRenderer(this, 132, 105);
        this.stopa1.setRotationPoint(0.0F, 9.5F, -5.7F);
        this.stopa1.addBox(0.0F, 0.0F, 0.0F, 12, 6, 19, 0.0F);
        this.setRotateAngle(stopa1, -0.36425021489121656F, 0.0F, 0.0F);
        this.lydka1 = new ModelRenderer(this, 72, 95);
        this.lydka1.setRotationPoint(0.0F, 21.3F, 0.0F);
        this.lydka1.addBox(0.0F, 0.0F, 0.0F, 12, 17, 12, 0.0F);
        this.setRotateAngle(lydka1, 0.5462880558742251F, 0.0F, 0.0F);
        this.Broda = new ModelRenderer(this, 127, 410);
        this.Broda.setRotationPoint(7.4F, 25.1F, 0.3F);
        this.Broda.addBox(0.0F, 0.0F, 0.0F, 19, 5, 10, 0.0F);
        this.lydka4 = new ModelRenderer(this, 90, 249);
        this.lydka4.setRotationPoint(0.0F, 9.1F, 5.2F);
        this.lydka4.addBox(0.0F, 0.0F, 0.0F, 16, 24, 14, 0.0F);
        this.setRotateAngle(lydka4, -0.6829473363053812F, 0.0F, 0.0F);
        this.Tw2 = new ModelRenderer(this, 179, 19);
        this.Tw2.setRotationPoint(1.8F, 0.8F, 31.6F);
        this.Tw2.addBox(0.0F, 0.0F, 0.0F, 38, 26, 30, 0.0F);
        this.setRotateAngle(Tw2, -0.091106186954104F, 0.0F, 0.0F);
        this.Rog1 = new ModelRenderer(this, 264, 421);
        this.Rog1.setRotationPoint(13.0F, 0.4F, -9.9F);
        this.Rog1.addBox(0.0F, 0.0F, 0.0F, 8, 15, 8, 0.0F);
        this.setRotateAngle(Rog1, 0.7285004297824331F, 0.0F, 0.0F);
        this.Tw3.addChild(this.Noga4);
        this.lydka3.addChild(this.stopa3);
        this.lydka4.addChild(this.stopa4);
        this.szyja.addChild(this.gowa);
        this.Noga2.addChild(this.lydka2);
        this.Noga3.addChild(this.lydka3);
        this.Tw2.addChild(this.Noga1);
        this.lydka2.addChild(this.stopa2);
        this.Tw3.addChild(this.szyja);
        this.Tw2.addChild(this.Noga2);
        this.Rog1.addChild(this.Rog2);
        this.Broda.addChild(this.Broda2);
        this.Tw3.addChild(this.Noga3);
        this.Tw.addChild(this.Tw3);
        this.lydka1.addChild(this.stopa1);
        this.Noga1.addChild(this.lydka1);
        this.gowa.addChild(this.Broda);
        this.Noga4.addChild(this.lydka4);
        this.Tw.addChild(this.Tw2);
        this.gowa.addChild(this.Rog1);
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
    	this.gowa.rotateAngleX = MathHelper.cos(limbSwing * 0.2220F) * 0.2F * limbSwingAmount;
    	this.Noga1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.6F * limbSwingAmount;
    	this.Noga4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.6F * limbSwingAmount;
    	this.Noga3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.6F * limbSwingAmount;
    	this.Noga2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.6F * limbSwingAmount;
    }
}
