package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * topielecv3 - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelTopielec extends ModelBase {
    public ModelRenderer tlow;
    public ModelRenderer Glowa;
    public ModelRenderer Grzbiet1;
    public ModelRenderer Grzbiet2;
    public ModelRenderer Ogon1;
    public ModelRenderer Noga1fix;
    public ModelRenderer Noga2fix;
    public ModelRenderer Noga3fix;
    public ModelRenderer Noga4fix;
    public ModelRenderer Ogon2;
    public ModelRenderer Ogon3;
    public ModelRenderer Lydka1;
    public ModelRenderer palec1;
    public ModelRenderer palec1_1;
    public ModelRenderer palec1_2;
    public ModelRenderer Lydka2;
    public ModelRenderer palec2;
    public ModelRenderer palec2_1;
    public ModelRenderer palec2_2;
    public ModelRenderer ydka3;
    public ModelRenderer Piszczel3;
    public ModelRenderer palec3;
    public ModelRenderer palec3_1;
    public ModelRenderer palec3_2;
    public ModelRenderer ydka4;
    public ModelRenderer Piszczel4;
    public ModelRenderer palec4;
    public ModelRenderer palec4_1;
    public ModelRenderer palec4_2;

    public ModelTopielec() {
        this.textureWidth = 500;
        this.textureHeight = 500;
        this.ydka4 = new ModelRenderer(this, 112, 150);
        this.ydka4.setRotationPoint(0.9F, 4.9F, 24.0F);
        this.ydka4.addBox(0.0F, 0.0F, 0.0F, 8, 8, 23, 0.0F);
        this.setRotateAngle(ydka4, 0.9560913642424937F, 0.0F, 0.0F);
        this.palec2_1 = new ModelRenderer(this, 100, 101);
        this.palec2_1.setRotationPoint(1.6F, 31.0F, -17.4F);
        this.palec2_1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 22, 0.0F);
        this.setRotateAngle(palec2_1, 0.23387411976724018F, 0.0F, 0.0F);
        this.palec3 = new ModelRenderer(this, 260, 155);
        this.palec3.setRotationPoint(1.9F, 8.6F, -14.5F);
        this.palec3.addBox(0.0F, 0.0F, 0.0F, 4, 4, 20, 0.0F);
        this.palec3_1 = new ModelRenderer(this, 260, 155);
        this.palec3_1.setRotationPoint(-5.5F, 8.4F, -12.2F);
        this.palec3_1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 18, 0.0F);
        this.setRotateAngle(palec3_1, 0.0F, 0.27314402793711257F, 0.0F);
        this.palec4 = new ModelRenderer(this, 260, 155);
        this.palec4.setRotationPoint(1.9F, 8.6F, -17.4F);
        this.palec4.addBox(0.0F, 0.0F, 0.0F, 4, 4, 20, 0.0F);
        this.ydka3 = new ModelRenderer(this, 112, 150);
        this.ydka3.setRotationPoint(1.2F, 4.9F, 24.0F);
        this.ydka3.addBox(0.0F, 0.0F, 0.0F, 8, 8, 23, 0.0F);
        this.setRotateAngle(ydka3, 0.9560913642424937F, 0.0F, 0.0F);
        this.Noga3fix = new ModelRenderer(this, 12, 140);
        this.Noga3fix.setRotationPoint(-10.0F, 9.6F, 48.2F);
        this.Noga3fix.addBox(0.0F, 0.0F, 0.0F, 10, 10, 32, 0.0F);
        this.setRotateAngle(Noga3fix, -0.5846852994181004F, 0.0F, 0.0F);
        this.palec3_2 = new ModelRenderer(this, 260, 155);
        this.palec3_2.setRotationPoint(9.7F, 8.5F, -13.9F);
        this.palec3_2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 20, 0.0F);
        this.setRotateAngle(palec3_2, 0.0F, -0.27314402793711257F, 0.0F);
        this.Ogon3 = new ModelRenderer(this, 303, 5);
        this.Ogon3.setRotationPoint(2.6F, 0.2F, 18.9F);
        this.Ogon3.addBox(0.0F, 0.0F, 0.0F, 13, 10, 15, 0.0F);
        this.setRotateAngle(Ogon3, -0.36425021489121656F, 0.0F, 0.0F);
        this.Glowa = new ModelRenderer(this, 100, 250);
        this.Glowa.setRotationPoint(3.3F, 1.5F, -21.7F);
        this.Glowa.addBox(0.0F, 0.0F, 0.0F, 22, 17, 22, 0.0F);
        this.Grzbiet1 = new ModelRenderer(this, 197, 0);
        this.Grzbiet1.setRotationPoint(12.4F, -3.0F, 4.5F);
        this.Grzbiet1.addBox(0.0F, 0.0F, 0.0F, 3, 14, 14, 0.0F);
        this.setRotateAngle(Grzbiet1, 0.7740535232594852F, 0.0F, 0.0F);
        this.Lydka1 = new ModelRenderer(this, 59, 90);
        this.Lydka1.setRotationPoint(0.0F, 23.9F, 1.1F);
        this.Lydka1.addBox(0.0F, 0.0F, 0.0F, 8, 29, 8, 0.0F);
        this.setRotateAngle(Lydka1, -1.593485607070823F, 0.0F, 0.0F);
        this.Piszczel4 = new ModelRenderer(this, 200, 160);
        this.Piszczel4.setRotationPoint(0.0F, 2.2F, 16.4F);
        this.Piszczel4.addBox(0.0F, 0.0F, 0.0F, 8, 12, 7, 0.0F);
        this.setRotateAngle(Piszczel4, 0.31869712141416456F, 0.0F, 0.0F);
        this.Noga2fix = new ModelRenderer(this, 12, 92);
        this.Noga2fix.setRotationPoint(28.0F, 18.0F, 1.2F);
        this.Noga2fix.addBox(0.0F, 0.0F, 0.0F, 8, 30, 8, 0.0F);
        this.setRotateAngle(Noga2fix, 0.5846852994181004F, 0.0F, 0.0F);
        this.Noga4fix = new ModelRenderer(this, 12, 140);
        this.Noga4fix.setRotationPoint(27.7F, 9.6F, 48.2F);
        this.Noga4fix.addBox(0.0F, 0.0F, 0.0F, 10, 10, 32, 0.0F);
        this.setRotateAngle(Noga4fix, -0.5846852994181004F, 0.0F, 0.0F);
        this.palec2_2 = new ModelRenderer(this, 100, 101);
        this.palec2_2.setRotationPoint(-8.7F, 30.8F, -13.5F);
        this.palec2_2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 22, 0.0F);
        this.setRotateAngle(palec2_2, 0.23387411976724018F, 0.40980330836826856F, 0.0F);
        this.Lydka2 = new ModelRenderer(this, 59, 90);
        this.Lydka2.setRotationPoint(0.0F, 23.9F, 1.1F);
        this.Lydka2.addBox(0.0F, 0.0F, 0.0F, 8, 28, 8, 0.0F);
        this.setRotateAngle(Lydka2, -1.593485607070823F, 0.0F, 0.0F);
        this.palec1_1 = new ModelRenderer(this, 100, 101);
        this.palec1_1.setRotationPoint(-7.8F, 30.3F, -11.1F);
        this.palec1_1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 20, 0.0F);
        this.setRotateAngle(palec1_1, 0.22759093446006054F, 0.40980330836826856F, 0.0F);
        this.tlow = new ModelRenderer(this, 0, 0);
        this.tlow.setRotationPoint(-13.7F, -28.8F, -25.9F);
        this.tlow.addBox(0.0F, 0.0F, 0.0F, 28, 22, 54, 0.0F);
        this.Ogon1 = new ModelRenderer(this, 176, 45);
        this.Ogon1.setRotationPoint(2.7F, 0.6F, 52.1F);
        this.Ogon1.addBox(0.0F, 0.0F, 0.0F, 22, 18, 24, 0.0F);
        this.setRotateAngle(Ogon1, -0.36425021489121656F, 0.0F, 0.0F);
        this.palec1_2 = new ModelRenderer(this, 100, 101);
        this.palec1_2.setRotationPoint(9.2F, 30.3F, -13.2F);
        this.palec1_2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 20, 0.0F);
        this.setRotateAngle(palec1_2, 0.22759093446006054F, -0.27314402793711257F, 0.0F);
        this.palec1 = new ModelRenderer(this, 100, 101);
        this.palec1.setRotationPoint(1.9F, 31.5F, -17.4F);
        this.palec1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 20, 0.0F);
        this.setRotateAngle(palec1, 0.22759093446006054F, 0.0F, 0.0F);
        this.Noga1fix = new ModelRenderer(this, 12, 92);
        this.Noga1fix.setRotationPoint(-7.8F, 18.0F, 1.2F);
        this.Noga1fix.addBox(0.0F, 0.0F, 0.0F, 8, 32, 8, 0.0F);
        this.setRotateAngle(Noga1fix, 0.5089969389957472F, 0.0F, 0.0F);
        this.Ogon2 = new ModelRenderer(this, 286, 50);
        this.Ogon2.setRotationPoint(2.0F, 0.2F, 21.1F);
        this.Ogon2.addBox(0.0F, 0.0F, 0.0F, 18, 13, 22, 0.0F);
        this.setRotateAngle(Ogon2, -0.5009094953223726F, 0.0F, 0.0F);
        this.palec4_1 = new ModelRenderer(this, 260, 155);
        this.palec4_1.setRotationPoint(-6.3F, 8.6F, -14.4F);
        this.palec4_1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 20, 0.0F);
        this.setRotateAngle(palec4_1, 0.0F, 0.31869712141416456F, 0.0F);
        this.Grzbiet2 = new ModelRenderer(this, 246, 0);
        this.Grzbiet2.setRotationPoint(12.4F, -3.0F, 30.0F);
        this.Grzbiet2.addBox(0.0F, 0.0F, 0.0F, 3, 14, 14, 0.0F);
        this.setRotateAngle(Grzbiet2, 0.7740535232594852F, 0.0F, 0.0F);
        this.palec4_2 = new ModelRenderer(this, 260, 155);
        this.palec4_2.setRotationPoint(8.1F, 8.6F, -14.4F);
        this.palec4_2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 20, 0.0F);
        this.setRotateAngle(palec4_2, 0.0F, -0.22759093446006054F, 0.0F);
        this.Piszczel3 = new ModelRenderer(this, 200, 160);
        this.Piszczel3.setRotationPoint(0.0F, 2.2F, 16.4F);
        this.Piszczel3.addBox(0.0F, 0.0F, 0.0F, 8, 12, 7, 0.0F);
        this.setRotateAngle(Piszczel3, 0.31869712141416456F, 0.0F, 0.0F);
        this.palec2 = new ModelRenderer(this, 100, 101);
        this.palec2.setRotationPoint(9.7F, 30.3F, -14.9F);
        this.palec2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 22, 0.0F);
        this.setRotateAngle(palec2, 0.22759093446006054F, -0.27314402793711257F, 0.0F);
        this.Noga4fix.addChild(this.ydka4);
        this.Lydka2.addChild(this.palec2_1);
        this.Piszczel3.addChild(this.palec3);
        this.Piszczel3.addChild(this.palec3_1);
        this.Piszczel4.addChild(this.palec4);
        this.Noga3fix.addChild(this.ydka3);
        this.tlow.addChild(this.Noga3fix);
        this.Piszczel3.addChild(this.palec3_2);
        this.Ogon2.addChild(this.Ogon3);
        this.tlow.addChild(this.Glowa);
        this.tlow.addChild(this.Grzbiet1);
        this.Noga1fix.addChild(this.Lydka1);
        this.ydka4.addChild(this.Piszczel4);
        this.tlow.addChild(this.Noga2fix);
        this.tlow.addChild(this.Noga4fix);
        this.Lydka2.addChild(this.palec2_2);
        this.Noga2fix.addChild(this.Lydka2);
        this.Lydka1.addChild(this.palec1_1);
        this.tlow.addChild(this.Ogon1);
        this.Lydka1.addChild(this.palec1_2);
        this.Lydka1.addChild(this.palec1);
        this.tlow.addChild(this.Noga1fix);
        this.Ogon1.addChild(this.Ogon2);
        this.Piszczel4.addChild(this.palec4_1);
        this.tlow.addChild(this.Grzbiet2);
        this.Piszczel4.addChild(this.palec4_2);
        this.ydka3.addChild(this.Piszczel3);
        this.Lydka2.addChild(this.palec2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.tlow.render(f5);
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
    	this.Noga1fix.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.Noga2fix.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.Noga3fix.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.Noga4fix.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
