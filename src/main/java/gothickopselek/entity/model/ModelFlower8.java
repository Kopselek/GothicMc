package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Alkojagoda - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelFlower8 extends ModelBase {
    public ModelRenderer Trzon1;
    public ModelRenderer Owoc1;
    public ModelRenderer Lisc;
    public ModelRenderer Lisc_1;
    public ModelRenderer Lisc_2;
    public ModelRenderer Lisc_3;
    public ModelRenderer Lisc_4;
    public ModelRenderer Owoc1_1;
    public ModelRenderer Owoc1_2;
    public ModelRenderer Lisc_5;
    public ModelRenderer Lisc_6;
    public ModelRenderer Lisc_7;
    public ModelRenderer Lisc_8;
    public ModelRenderer Lisc_9;

    public ModelFlower8() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.Lisc_3 = new ModelRenderer(this, 0, 0);
        this.Lisc_3.setRotationPoint(5.2F, 2.6F, -1.9F);
        this.Lisc_3.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lisc_3, 0.9105382707654417F, -1.0016444577195458F, 0.0F);
        this.Lisc_5 = new ModelRenderer(this, 0, 0);
        this.Lisc_5.setRotationPoint(0.9F, 1.3F, -0.3F);
        this.Lisc_5.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lisc_5, -0.091106186954104F, -0.22759093446006054F, 0.0F);
        this.Trzon1 = new ModelRenderer(this, 40, 0);
        this.Trzon1.setRotationPoint(-2.0F, 20.1F, -2.0F);
        this.Trzon1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Lisc = new ModelRenderer(this, 0, 0);
        this.Lisc.setRotationPoint(-0.6F, 2.5F, -2.4F);
        this.Lisc.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lisc, 0.9560913642424937F, 0.27314402793711257F, 0.0F);
        this.Lisc_6 = new ModelRenderer(this, 0, 0);
        this.Lisc_6.setRotationPoint(0.9F, 0.9F, 0.6F);
        this.Lisc_6.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lisc_6, -0.4553564018453205F, 0.36425021489121656F, 0.0F);
        this.Lisc_4 = new ModelRenderer(this, 0, 0);
        this.Lisc_4.setRotationPoint(2.4F, -0.7F, 4.5F);
        this.Lisc_4.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lisc_4, -0.8651597102135892F, 0.6829473363053812F, 0.0F);
        this.Lisc_2 = new ModelRenderer(this, 0, 0);
        this.Lisc_2.setRotationPoint(-0.2F, -0.6F, 0.0F);
        this.Lisc_2.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lisc_2, -0.8196066167365371F, -1.6845917940249266F, 0.0F);
        this.Owoc1 = new ModelRenderer(this, 0, 40);
        this.Owoc1.setRotationPoint(-0.7F, 18.8F, -2.3F);
        this.Owoc1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Lisc_9 = new ModelRenderer(this, 0, 0);
        this.Lisc_9.setRotationPoint(0.0F, 3.1F, -2.0F);
        this.Lisc_9.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lisc_9, 1.2292353921796064F, 0.0F, -0.40980330836826856F);
        this.Lisc_1 = new ModelRenderer(this, 0, 0);
        this.Lisc_1.setRotationPoint(-0.4F, -0.7F, 2.8F);
        this.Lisc_1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lisc_1, -0.7285004297824331F, -0.5918411493512771F, 0.0F);
        this.Owoc1_1 = new ModelRenderer(this, 0, 40);
        this.Owoc1_1.setRotationPoint(-0.6F, -1.6F, 0.5F);
        this.Owoc1_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Owoc1_2 = new ModelRenderer(this, 0, 40);
        this.Owoc1_2.setRotationPoint(1.9F, -2.0F, 1.5F);
        this.Owoc1_2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Lisc_7 = new ModelRenderer(this, 0, 0);
        this.Lisc_7.setRotationPoint(0.8F, 0.9F, -0.5F);
        this.Lisc_7.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lisc_7, -0.22759093446006054F, -0.22759093446006054F, 0.0F);
        this.Lisc_8 = new ModelRenderer(this, 0, 0);
        this.Lisc_8.setRotationPoint(2.7F, 2.4F, -0.4F);
        this.Lisc_8.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(Lisc_8, 0.36425021489121656F, -0.4553564018453205F, 0.0F);
        this.Trzon1.addChild(this.Lisc_3);
        this.Lisc.addChild(this.Lisc_5);
        this.Trzon1.addChild(this.Lisc);
        this.Lisc_1.addChild(this.Lisc_6);
        this.Trzon1.addChild(this.Lisc_4);
        this.Trzon1.addChild(this.Lisc_2);
        this.Lisc_4.addChild(this.Lisc_9);
        this.Trzon1.addChild(this.Lisc_1);
        this.Trzon1.addChild(this.Owoc1_1);
        this.Trzon1.addChild(this.Owoc1_2);
        this.Lisc_2.addChild(this.Lisc_7);
        this.Lisc_3.addChild(this.Lisc_8);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Trzon1.render(f5);
        this.Owoc1.render(f5);
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
