package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Scierwojad - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelScierwojad extends ModelBase {
    public ModelRenderer Tw;
    public ModelRenderer Noga1;
    public ModelRenderer Noga2;
    public ModelRenderer Szyja1;
    public ModelRenderer Ogon;
    public ModelRenderer ydka1;
    public ModelRenderer Stopa1;
    public ModelRenderer paluch1;
    public ModelRenderer paluch2;
    public ModelRenderer paluch3;
    public ModelRenderer ydka2;
    public ModelRenderer Stopa2;
    public ModelRenderer paluch1_1;
    public ModelRenderer paluch2_1;
    public ModelRenderer paluch2_2;
    public ModelRenderer Szyja2;
    public ModelRenderer Gowa;
    public ModelRenderer Dziub;
    public ModelRenderer Ogon2;
    public ModelRenderer Ogon3;

    public ModelScierwojad() {
        this.textureWidth = 500;
        this.textureHeight = 500;
        this.paluch3 = new ModelRenderer(this, 260, 94);
        this.paluch3.setRotationPoint(4.7F, 1.5F, 0.4F);
        this.paluch3.addBox(0.0F, 0.0F, 0.0F, 5, 27, 8, 0.0F);
        this.paluch1_1 = new ModelRenderer(this, 193, 156);
        this.paluch1_1.setRotationPoint(3.5F, 1.5F, 0.5F);
        this.paluch1_1.addBox(0.0F, 0.0F, 0.0F, 5, 22, 8, 0.0F);
        this.setRotateAngle(paluch1_1, 0.0F, 0.0F, 0.36425021489121656F);
        this.Stopa2 = new ModelRenderer(this, 140, 165);
        this.Stopa2.setRotationPoint(0.0F, 26.8F, 7.9F);
        this.Stopa2.addBox(0.0F, 0.0F, 0.0F, 13, 12, 8, 0.0F);
        this.setRotateAngle(Stopa2, -0.982794901798007F, 0.0F, 0.0F);
        this.Ogon3 = new ModelRenderer(this, 161, 302);
        this.Ogon3.setRotationPoint(2.1F, 11.6F, 0.0F);
        this.Ogon3.addBox(0.0F, 0.0F, 0.0F, 10, 6, 8, 0.0F);
        this.Noga1 = new ModelRenderer(this, 13, 94);
        this.Noga1.setRotationPoint(31.8F, 36.6F, -0.1F);
        this.Noga1.addBox(0.0F, 0.0F, 0.0F, 16, 22, 15, 0.0F);
        this.setRotateAngle(Noga1, -0.23527038316883564F, 0.0F, 0.0F);
        this.Szyja2 = new ModelRenderer(this, 78, 215);
        this.Szyja2.setRotationPoint(0.0F, 8.8F, 0.0F);
        this.Szyja2.addBox(0.0F, 0.0F, 0.0F, 12, 30, 12, 0.0F);
        this.setRotateAngle(Szyja2, 1.3658946726107624F, 0.0F, 0.0F);
        this.ydka2 = new ModelRenderer(this, 81, 148);
        this.ydka2.setRotationPoint(1.5F, 8.3F, 1.4F);
        this.ydka2.addBox(0.0F, 0.0F, 0.0F, 13, 33, 13, 0.0F);
        this.setRotateAngle(ydka2, -1.377064779823526F, 0.0F, 0.0F);
        this.paluch2_1 = new ModelRenderer(this, 236, 160);
        this.paluch2_1.setRotationPoint(4.8F, 1.5F, 0.5F);
        this.paluch2_1.addBox(0.0F, 0.0F, 0.0F, 5, 24, 8, 0.0F);
        this.Szyja1 = new ModelRenderer(this, 12, 214);
        this.Szyja1.setRotationPoint(10.3F, -17.1F, 4.7F);
        this.Szyja1.addBox(0.0F, 0.0F, 0.0F, 12, 26, 12, 0.0F);
        this.setRotateAngle(Szyja1, 0.5009094953223726F, 0.0F, 0.0F);
        this.Ogon = new ModelRenderer(this, 13, 290);
        this.Ogon.setRotationPoint(5.6F, 45.6F, 11.6F);
        this.Ogon.addBox(0.0F, 0.0F, 0.0F, 20, 16, 16, 0.0F);
        this.setRotateAngle(Ogon, -0.31869712141416456F, 0.0F, 0.0F);
        this.Noga2 = new ModelRenderer(this, 4, 150);
        this.Noga2.setRotationPoint(-15.7F, 36.6F, -0.1F);
        this.Noga2.addBox(0.0F, 0.0F, 0.0F, 16, 22, 15, 0.0F);
        this.setRotateAngle(Noga2, -0.23387411976724018F, 0.0F, 0.0F);
        this.Tw = new ModelRenderer(this, 0, 0);
        this.Tw.setRotationPoint(-16.0F, -35.3F, -20.0F);
        this.Tw.addBox(0.0F, 0.0F, 0.0F, 32, 52, 30, 0.0F);
        this.setRotateAngle(Tw, 1.0197958819402868F, 0.0F, 0.0F);
        this.Dziub = new ModelRenderer(this, 241, 215);
        this.Dziub.setRotationPoint(0.0F, -0.2F, 21.0F);
        this.Dziub.addBox(0.0F, 0.0F, 0.0F, 22, 14, 20, 0.0F);
        this.setRotateAngle(Dziub, 0.18203784098300857F, 0.0F, 0.0F);
        this.Stopa1 = new ModelRenderer(this, 142, 106);
        this.Stopa1.setRotationPoint(0.0F, 26.8F, 7.9F);
        this.Stopa1.addBox(0.0F, 0.0F, 0.0F, 13, 12, 8, 0.0F);
        this.setRotateAngle(Stopa1, -0.982794901798007F, 0.0F, 0.0F);
        this.Gowa = new ModelRenderer(this, 141, 215);
        this.Gowa.setRotationPoint(-4.4F, 29.4F, 0.0F);
        this.Gowa.addBox(0.0F, 0.0F, 0.0F, 22, 22, 24, 0.0F);
        this.setRotateAngle(Gowa, 0.5462880558742251F, 0.0F, 0.0F);
        this.paluch1 = new ModelRenderer(this, 196, 98);
        this.paluch1.setRotationPoint(3.6F, 2.4F, 0.3F);
        this.paluch1.addBox(0.0F, 0.0F, 0.0F, 5, 22, 8, 0.0F);
        this.setRotateAngle(paluch1, 0.0F, 0.0F, 0.3754203221039803F);
        this.Ogon2 = new ModelRenderer(this, 100, 290);
        this.Ogon2.setRotationPoint(2.5F, 12.0F, 3.2F);
        this.Ogon2.addBox(0.0F, 0.0F, 0.0F, 14, 12, 12, 0.0F);
        this.setRotateAngle(Ogon2, -0.27314402793711257F, 0.0F, 0.0F);
        this.ydka1 = new ModelRenderer(this, 83, 88);
        this.ydka1.setRotationPoint(1.5F, 8.3F, 1.4F);
        this.ydka1.addBox(0.0F, 0.0F, 0.0F, 13, 33, 13, 0.0F);
        this.setRotateAngle(ydka1, -1.3775883785991245F, 0.0F, 0.0F);
        this.paluch2 = new ModelRenderer(this, 225, 97);
        this.paluch2.setRotationPoint(6.0F, 4.1F, 0.4F);
        this.paluch2.addBox(0.0F, 0.0F, 0.0F, 5, 22, 8, 0.0F);
        this.setRotateAngle(paluch2, 0.0F, 0.0F, -0.36425021489121656F);
        this.paluch2_2 = new ModelRenderer(this, 280, 159);
        this.paluch2_2.setRotationPoint(6.4F, 1.5F, 0.5F);
        this.paluch2_2.addBox(0.0F, 0.0F, 0.0F, 5, 22, 8, 0.0F);
        this.setRotateAngle(paluch2_2, 0.0F, 0.0F, -0.31869712141416456F);
        this.Stopa1.addChild(this.paluch3);
        this.Stopa2.addChild(this.paluch1_1);
        this.ydka2.addChild(this.Stopa2);
        this.Ogon2.addChild(this.Ogon3);
        this.Tw.addChild(this.Noga1);
        this.Szyja1.addChild(this.Szyja2);
        this.Noga2.addChild(this.ydka2);
        this.Stopa2.addChild(this.paluch2_1);
        this.Tw.addChild(this.Szyja1);
        this.Tw.addChild(this.Ogon);
        this.Tw.addChild(this.Noga2);
        this.Gowa.addChild(this.Dziub);
        this.ydka1.addChild(this.Stopa1);
        this.Szyja2.addChild(this.Gowa);
        this.Stopa1.addChild(this.paluch1);
        this.Ogon.addChild(this.Ogon2);
        this.Noga1.addChild(this.ydka1);
        this.Stopa1.addChild(this.paluch2);
        this.Stopa2.addChild(this.paluch2_2);
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
    }
}
