package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * PolnaBestia - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelPolnaBestia extends ModelBase {
    public ModelRenderer tlow1;
    public ModelRenderer tlow2;
    public ModelRenderer tlow3;
    public ModelRenderer Noga1;
    public ModelRenderer Noga1_1;
    public ModelRenderer Noga2;
    public ModelRenderer Noga2_1;
    public ModelRenderer Glowa1;
    public ModelRenderer reka1;
    public ModelRenderer reka2;
    public ModelRenderer Tlow4;
    public ModelRenderer Czulka1;
    public ModelRenderer Czulka2;
    public ModelRenderer przedramie1;
    public ModelRenderer Dlon1;
    public ModelRenderer przedramie2;
    public ModelRenderer Dlon2;
    public ModelRenderer lyda1;
    public ModelRenderer lyda1_1;
    public ModelRenderer lyda2;
    public ModelRenderer lyda2_1;

    public ModelPolnaBestia() {
        this.textureWidth = 500;
        this.textureHeight = 500;
        this.Noga1_1 = new ModelRenderer(this, 0, 180);
        this.Noga1_1.setRotationPoint(16.1F, 8.5F, 0.1F);
        this.Noga1_1.addBox(0.0F, 0.0F, 0.0F, 8, 5, 5, 0.0F);
        this.setRotateAngle(Noga1_1, 0.0F, 0.4553564018453205F, 0.0F);
        this.lyda1_1 = new ModelRenderer(this, 40, 180);
        this.lyda1_1.setRotationPoint(3.9F, 0.2F, 0.0F);
        this.lyda1_1.addBox(0.0F, 0.0F, 0.0F, 4, 19, 5, 0.0F);
        this.Glowa1 = new ModelRenderer(this, 0, 0);
        this.Glowa1.setRotationPoint(5.0F, -1.1F, -7.5F);
        this.Glowa1.addBox(0.0F, 0.0F, 0.0F, 14, 14, 14, 0.0F);
        this.setRotateAngle(Glowa1, -0.22759093446006054F, 0.0F, 0.0F);
        this.tlow1 = new ModelRenderer(this, 0, 40);
        this.tlow1.setRotationPoint(-11.5F, -17.0F, 0.0F);
        this.tlow1.addBox(0.0F, 0.0F, 0.0F, 22, 18, 18, 0.0F);
        this.lyda1 = new ModelRenderer(this, 40, 180);
        this.lyda1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lyda1.addBox(0.0F, 0.0F, 0.0F, 4, 19, 5, 0.0F);
        this.Czulka1 = new ModelRenderer(this, 69, 0);
        this.Czulka1.setRotationPoint(-1.5F, -9.0F, 0.0F);
        this.Czulka1.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(Czulka1, 0.0F, 0.0F, -0.22759093446006054F);
        this.tlow3 = new ModelRenderer(this, 180, 45);
        this.tlow3.setRotationPoint(-2.0F, -18.6F, -8.0F);
        this.tlow3.addBox(0.0F, 0.0F, 0.0F, 24, 14, 18, 0.0F);
        this.setRotateAngle(tlow3, 0.5462880558742251F, 0.0F, 0.0F);
        this.Dlon2 = new ModelRenderer(this, 100, 100);
        this.Dlon2.setRotationPoint(16.1F, 0.0F, -7.6F);
        this.Dlon2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 30, 0.0F);
        this.setRotateAngle(Dlon2, 0.0F, -0.5462880558742251F, 0.0F);
        this.Dlon1 = new ModelRenderer(this, 100, 100);
        this.Dlon1.setRotationPoint(-15.8F, 0.0F, -5.5F);
        this.Dlon1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 30, 0.0F);
        this.setRotateAngle(Dlon1, 0.0F, 0.5462880558742251F, 0.0F);
        this.lyda2_1 = new ModelRenderer(this, 50, 240);
        this.lyda2_1.setRotationPoint(7.9F, 0.1F, 0.0F);
        this.lyda2_1.addBox(0.0F, 0.0F, 0.0F, 4, 19, 5, 0.0F);
        this.setRotateAngle(lyda2_1, 1.593485607070823F, 0.0F, -3.141592653589793F);
        this.Noga2_1 = new ModelRenderer(this, 0, 240);
        this.Noga2_1.setRotationPoint(17.7F, 7.0F, 15.0F);
        this.Noga2_1.addBox(0.0F, 0.0F, 0.0F, 8, 5, 5, 0.0F);
        this.setRotateAngle(Noga2_1, -1.0927506446736497F, -0.5462880558742251F, -0.31869712141416456F);
        this.reka1 = new ModelRenderer(this, 0, 100);
        this.reka1.setRotationPoint(-6.0F, 7.0F, -9.3F);
        this.reka1.addBox(0.0F, 0.0F, 0.0F, 14, 4, 4, 0.0F);
        this.setRotateAngle(reka1, 0.0F, -0.8196066167365371F, 0.0F);
        this.przedramie2 = new ModelRenderer(this, 50, 100);
        this.przedramie2.setRotationPoint(10.0F, 0.3F, 0.0F);
        this.przedramie2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 20, 0.0F);
        this.setRotateAngle(przedramie2, 1.5707963267948966F, 0.0F, 0.18203784098300857F);
        this.Noga2 = new ModelRenderer(this, 0, 240);
        this.Noga2.setRotationPoint(-6.1F, 7.0F, 15.0F);
        this.Noga2.addBox(0.0F, 0.0F, 0.0F, 8, 5, 5, 0.0F);
        this.setRotateAngle(Noga2, 0.6373942428283291F, 0.5918411493512771F, 0.31869712141416456F);
        this.reka2 = new ModelRenderer(this, 0, 100);
        this.reka2.setRotationPoint(21.6F, 7.1F, 0.0F);
        this.reka2.addBox(0.0F, 0.0F, 0.0F, 14, 4, 4, 0.0F);
        this.setRotateAngle(reka2, 0.0F, 0.8196066167365371F, 0.0F);
        this.lyda2 = new ModelRenderer(this, 50, 240);
        this.lyda2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lyda2.addBox(0.0F, 0.0F, 0.0F, 4, 19, 5, 0.0F);
        this.tlow2 = new ModelRenderer(this, 90, 45);
        this.tlow2.setRotationPoint(1.0F, 12.5F, 0.0F);
        this.tlow2.addBox(0.0F, 0.0F, 0.0F, 20, 14, 18, 0.0F);
        this.setRotateAngle(tlow2, -0.22759093446006054F, 0.0F, 0.0F);
        this.Czulka2 = new ModelRenderer(this, 84, 0);
        this.Czulka2.setRotationPoint(13.8F, -9.0F, 0.0F);
        this.Czulka2.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(Czulka2, 0.0F, 0.0F, 0.22759093446006054F);
        this.przedramie1 = new ModelRenderer(this, 50, 100);
        this.przedramie1.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.przedramie1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 20, 0.0F);
        this.setRotateAngle(przedramie1, 1.5707963267948966F, 0.0F, -0.27314402793711257F);
        this.Noga1 = new ModelRenderer(this, 0, 180);
        this.Noga1.setRotationPoint(-3.0F, 8.6F, -3.2F);
        this.Noga1.addBox(0.0F, 0.0F, 0.0F, 8, 5, 5, 0.0F);
        this.setRotateAngle(Noga1, 0.0F, -0.4553564018453205F, 0.0F);
        this.Tlow4 = new ModelRenderer(this, 290, 50);
        this.Tlow4.setRotationPoint(3.0F, -1.6F, -0.1F);
        this.Tlow4.addBox(0.0F, 0.0F, 0.0F, 18, 8, 18, 0.0F);
        this.tlow2.addChild(this.Noga1_1);
        this.Noga1_1.addChild(this.lyda1_1);
        this.tlow3.addChild(this.Glowa1);
        this.Noga1.addChild(this.lyda1);
        this.Glowa1.addChild(this.Czulka1);
        this.tlow2.addChild(this.tlow3);
        this.przedramie2.addChild(this.Dlon2);
        this.przedramie1.addChild(this.Dlon1);
        this.Noga2_1.addChild(this.lyda2_1);
        this.tlow2.addChild(this.Noga2_1);
        this.tlow3.addChild(this.reka1);
        this.reka2.addChild(this.przedramie2);
        this.tlow2.addChild(this.Noga2);
        this.tlow3.addChild(this.reka2);
        this.Noga2.addChild(this.lyda2);
        this.tlow1.addChild(this.tlow2);
        this.Glowa1.addChild(this.Czulka2);
        this.reka1.addChild(this.przedramie1);
        this.tlow2.addChild(this.Noga1);
        this.tlow3.addChild(this.Tlow4);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.tlow1.render(f5);
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
        this.Noga1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount;
        this.Noga2.rotateAngleX = 0.6373942428283291F + MathHelper.cos(limbSwing * 0.6662F) * limbSwingAmount;
        this.Noga2_1.rotateAngleX = -1.0927506446736497F + MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * limbSwingAmount;
        this.Noga1_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * limbSwingAmount;
    }
}
