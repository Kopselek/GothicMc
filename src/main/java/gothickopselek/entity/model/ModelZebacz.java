package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Zebacz - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelZebacz extends ModelBase {
    public ModelRenderer Tlow;
    public ModelRenderer Szyja;
    public ModelRenderer Udo1;
    public ModelRenderer Udo2;
    public ModelRenderer Ogon1;
    public ModelRenderer Glowa;
    public ModelRenderer Lydka1;
    public ModelRenderer Piszczel1;
    public ModelRenderer Stopa1;
    public ModelRenderer Lydka2;
    public ModelRenderer Piszczel2;
    public ModelRenderer Stopa2;
    public ModelRenderer Ogon2;
    public ModelRenderer Ogon3;

    public ModelZebacz() {
        this.textureWidth = 500;
        this.textureHeight = 500;
        this.Ogon1 = new ModelRenderer(this, 20, 150);
        this.Ogon1.setRotationPoint(2.0F, 1.3F, 32.0F);
        this.Ogon1.addBox(0.0F, 0.0F, 0.0F, 26, 18, 28, 0.0F);
        this.setRotateAngle(Ogon1, 0.22759093446006054F, 0.0F, 0.0F);
        this.Ogon2 = new ModelRenderer(this, 152, 160);
        this.Ogon2.setRotationPoint(1.9F, 0.6F, 25.2F);
        this.Ogon2.addBox(0.0F, 0.0F, 0.0F, 22, 14, 24, 0.0F);
        this.setRotateAngle(Ogon2, -0.27314402793711257F, 0.0F, 0.0F);
        this.Lydka2 = new ModelRenderer(this, 65, 94);
        this.Lydka2.setRotationPoint(0.0F, 22.0F, 0.1F);
        this.Lydka2.addBox(0.0F, 0.0F, 0.0F, 10, 20, 8, 0.0F);
        this.setRotateAngle(Lydka2, 0.9560913642424937F, 0.0F, 0.0F);
        this.Tlow = new ModelRenderer(this, 0, 0);
        this.Tlow.setRotationPoint(-14.0F, -37.7F, -20.0F);
        this.Tlow.addBox(0.0F, 0.0F, 0.0F, 30, 24, 42, 0.0F);
        this.Ogon3 = new ModelRenderer(this, 264, 168);
        this.Ogon3.setRotationPoint(3.0F, 1.5F, 23.0F);
        this.Ogon3.addBox(0.0F, 0.0F, 0.0F, 16, 12, 20, 0.0F);
        this.setRotateAngle(Ogon3, -0.4553564018453205F, 0.0F, 0.0F);
        this.Glowa = new ModelRenderer(this, 255, 25);
        this.Glowa.setRotationPoint(-1.0F, -4.0F, -0.4F);
        this.Glowa.addBox(0.0F, 0.0F, 0.0F, 24, 28, 18, 0.0F);
        this.setRotateAngle(Glowa, -0.9105382707654417F, 0.0F, 0.0F);
        this.Szyja = new ModelRenderer(this, 150, 20);
        this.Szyja.setRotationPoint(4.0F, -4.3F, -5.0F);
        this.Szyja.addBox(0.0F, 0.0F, 0.0F, 22, 18, 24, 0.0F);
        this.setRotateAngle(Szyja, -0.6373942428283291F, 0.0F, 0.0F);
        this.Piszczel1 = new ModelRenderer(this, 110, 101);
        this.Piszczel1.setRotationPoint(0.0F, 12.0F, 7.3F);
        this.Piszczel1.addBox(0.0F, 0.0F, 0.0F, 10, 20, 8, 0.0F);
        this.setRotateAngle(Piszczel1, -1.593485607070823F, 0.0F, 0.0F);
        this.Stopa2 = new ModelRenderer(this, 167, 112);
        this.Stopa2.setRotationPoint(0.0F, 15.9F, 3.7F);
        this.Stopa2.addBox(0.0F, 0.0F, 0.0F, 10, 11, 6, 0.0F);
        this.setRotateAngle(Stopa2, -0.7740535232594852F, 0.0F, 0.0F);
        this.Udo2 = new ModelRenderer(this, 11, 92);
        this.Udo2.setRotationPoint(29.8F, 14.8F, 26.7F);
        this.Udo2.addBox(0.0F, 0.0F, 0.0F, 10, 22, 12, 0.0F);
        this.setRotateAngle(Udo2, -0.136659280431156F, 0.0F, 0.0F);
        this.Lydka1 = new ModelRenderer(this, 65, 94);
        this.Lydka1.setRotationPoint(0.0F, 22.0F, 0.1F);
        this.Lydka1.addBox(0.0F, 0.0F, 0.0F, 10, 20, 8, 0.0F);
        this.setRotateAngle(Lydka1, 0.9560913642424937F, 0.0F, 0.0F);
        this.Stopa1 = new ModelRenderer(this, 167, 112);
        this.Stopa1.setRotationPoint(0.0F, 15.9F, 3.7F);
        this.Stopa1.addBox(0.0F, 0.0F, 0.0F, 10, 11, 6, 0.0F);
        this.setRotateAngle(Stopa1, -0.7740535232594852F, 0.0F, 0.0F);
        this.Udo1 = new ModelRenderer(this, 11, 92);
        this.Udo1.setRotationPoint(-9.5F, 14.8F, 26.7F);
        this.Udo1.addBox(0.0F, 0.0F, 0.0F, 10, 22, 12, 0.0F);
        this.setRotateAngle(Udo1, -0.136659280431156F, 0.0F, 0.0F);
        this.Piszczel2 = new ModelRenderer(this, 110, 101);
        this.Piszczel2.setRotationPoint(0.0F, 12.0F, 7.3F);
        this.Piszczel2.addBox(0.0F, 0.0F, 0.0F, 10, 20, 8, 0.0F);
        this.setRotateAngle(Piszczel2, -1.593485607070823F, 0.0F, 0.0F);
        this.Tlow.addChild(this.Ogon1);
        this.Ogon1.addChild(this.Ogon2);
        this.Udo2.addChild(this.Lydka2);
        this.Ogon2.addChild(this.Ogon3);
        this.Szyja.addChild(this.Glowa);
        this.Tlow.addChild(this.Szyja);
        this.Lydka1.addChild(this.Piszczel1);
        this.Piszczel2.addChild(this.Stopa2);
        this.Tlow.addChild(this.Udo2);
        this.Udo1.addChild(this.Lydka1);
        this.Piszczel1.addChild(this.Stopa1);
        this.Tlow.addChild(this.Udo1);
        this.Lydka2.addChild(this.Piszczel2);
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
    	this.Udo1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.Udo2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }
}
