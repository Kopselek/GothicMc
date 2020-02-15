package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Rzepa - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelFlower5 extends ModelBase {
    public ModelRenderer Bulwa1;
    public ModelRenderer Bulwa2;
    public ModelRenderer Lisc1;
    public ModelRenderer Lisc2;
    public ModelRenderer Lisc3;
    public ModelRenderer Lisc4;
    public ModelRenderer Lisc5;
    public ModelRenderer Lisc6;
    public ModelRenderer Lisc7;
    public ModelRenderer Lisc8;
    public ModelRenderer Lisc9;
    public ModelRenderer Lisc10;

    public ModelFlower5() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.Lisc10 = new ModelRenderer(this, 80, 0);
        this.Lisc10.setRotationPoint(2.9F, -14.3F, 1.8F);
        this.Lisc10.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.Bulwa2 = new ModelRenderer(this, 50, 0);
        this.Bulwa2.setRotationPoint(0.5F, -1.9F, 0.5F);
        this.Bulwa2.addBox(0.0F, 0.0F, 0.0F, 6, 2, 7, 0.0F);
        this.Lisc5 = new ModelRenderer(this, 80, 0);
        this.Lisc5.setRotationPoint(9.4F, -13.2F, -1.9F);
        this.Lisc5.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(Lisc5, 0.36425021489121656F, -0.9105382707654417F, 0.045553093477052F);
        this.Lisc6 = new ModelRenderer(this, 80, 0);
        this.Lisc6.setRotationPoint(5.8F, -15.9F, 3.3F);
        this.Lisc6.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(Lisc6, 0.0F, 0.0F, 0.091106186954104F);
        this.Lisc2 = new ModelRenderer(this, 80, 0);
        this.Lisc2.setRotationPoint(-2.5F, -14.4F, 2.3F);
        this.Lisc2.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(Lisc2, 0.0F, 0.0F, -0.18203784098300857F);
        this.Lisc7 = new ModelRenderer(this, 80, 0);
        this.Lisc7.setRotationPoint(6.1F, -13.7F, 7.8F);
        this.Lisc7.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(Lisc7, -0.18203784098300857F, 0.5462880558742251F, 0.091106186954104F);
        this.Bulwa1 = new ModelRenderer(this, 0, 0);
        this.Bulwa1.setRotationPoint(-3.3F, 18.6F, -5.0F);
        this.Bulwa1.addBox(0.0F, 0.0F, 0.0F, 7, 6, 8, 0.0F);
        this.Lisc1 = new ModelRenderer(this, 80, 0);
        this.Lisc1.setRotationPoint(-0.7F, -15.1F, -0.8F);
        this.Lisc1.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(Lisc1, 0.136659280431156F, 0.6373942428283291F, 0.0F);
        this.Lisc3 = new ModelRenderer(this, 80, 0);
        this.Lisc3.setRotationPoint(-2.6F, -14.9F, 7.8F);
        this.Lisc3.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(Lisc3, -0.18203784098300857F, -0.136659280431156F, -0.18203784098300857F);
        this.Lisc8 = new ModelRenderer(this, 80, 0);
        this.Lisc8.setRotationPoint(2.3F, -11.8F, 7.7F);
        this.Lisc8.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(Lisc8, -0.22759093446006054F, 0.0F, 0.0F);
        this.Lisc9 = new ModelRenderer(this, 80, 0);
        this.Lisc9.setRotationPoint(1.6F, -15.4F, 3.6F);
        this.Lisc9.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.Lisc4 = new ModelRenderer(this, 80, 0);
        this.Lisc4.setRotationPoint(2.8F, -12.6F, -2.8F);
        this.Lisc4.addBox(0.0F, 0.0F, 0.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(Lisc4, 0.22759093446006054F, 0.0F, 0.0F);
        this.Bulwa2.addChild(this.Lisc10);
        this.Bulwa1.addChild(this.Bulwa2);
        this.Bulwa2.addChild(this.Lisc5);
        this.Bulwa2.addChild(this.Lisc6);
        this.Bulwa2.addChild(this.Lisc2);
        this.Bulwa2.addChild(this.Lisc7);
        this.Bulwa2.addChild(this.Lisc1);
        this.Bulwa2.addChild(this.Lisc3);
        this.Bulwa2.addChild(this.Lisc8);
        this.Bulwa2.addChild(this.Lisc9);
        this.Bulwa2.addChild(this.Lisc4);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Bulwa1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
