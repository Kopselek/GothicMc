package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * SzczawKrolewski - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelFlower12 extends ModelBase {
    public ModelRenderer Trzon1;
    public ModelRenderer Lisc1;
    public ModelRenderer Lisc1_1;
    public ModelRenderer Lisc1_2;
    public ModelRenderer Lisc1_3;
    public ModelRenderer Trzon2;
    public ModelRenderer Lisc2;
    public ModelRenderer Lisc2_1;
    public ModelRenderer Lisc2_2;
    public ModelRenderer Lisc2_3;
    public ModelRenderer Lisc1_4;
    public ModelRenderer Lisc1_5;
    public ModelRenderer Lisc1_6;
    public ModelRenderer Lisc1_7;
    public ModelRenderer Lisc2_4;
    public ModelRenderer Lisc2_5;
    public ModelRenderer Lisc2_6;
    public ModelRenderer Lisc2_7;

    public ModelFlower12() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Lisc1_5 = new ModelRenderer(this, 30, 0);
        this.Lisc1_5.setRotationPoint(2.7F, 15.7F, -3.0F);
        this.Lisc1_5.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Lisc1_5, 1.0016444577195458F, -0.7740535232594852F, 0.0F);
        this.Lisc2_6 = new ModelRenderer(this, 20, 10);
        this.Lisc2_6.setRotationPoint(1.5F, -0.3F, -0.4F);
        this.Lisc2_6.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(Lisc2_6, 0.0F, 0.5009094953223726F, 1.5707963267948966F);
        this.Lisc2_7 = new ModelRenderer(this, 20, 10);
        this.Lisc2_7.setRotationPoint(-2.4F, 3.3F, -0.4F);
        this.Lisc2_7.addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(Lisc2_7, 0.0F, 0.0F, -1.1383037381507017F);
        this.Lisc1_3 = new ModelRenderer(this, 30, 0);
        this.Lisc1_3.setRotationPoint(4.0F, 12.3F, -4.4F);
        this.Lisc1_3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Lisc1_3, -0.40980330836826856F, -0.6829473363053812F, 0.0F);
        this.Lisc1_1 = new ModelRenderer(this, 30, 0);
        this.Lisc1_1.setRotationPoint(0.2F, 14.8F, 0.5F);
        this.Lisc1_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Lisc1_1, 0.40980330836826856F, -0.9105382707654417F, 0.0F);
        this.Lisc1_2 = new ModelRenderer(this, 30, 0);
        this.Lisc1_2.setRotationPoint(-3.2F, 12.4F, -3.0F);
        this.Lisc1_2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Lisc1_2, -0.40980330836826856F, 0.5918411493512771F, 0.0F);
        this.Lisc1_7 = new ModelRenderer(this, 30, 0);
        this.Lisc1_7.setRotationPoint(1.0F, 10.5F, -0.8F);
        this.Lisc1_7.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Lisc1_7, -0.8651597102135892F, -2.6406831582674206F, 0.0F);
        this.Lisc2_1 = new ModelRenderer(this, 20, 10);
        this.Lisc2_1.setRotationPoint(-1.6F, -3.8F, -4.6F);
        this.Lisc2_1.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(Lisc2_1, 1.5707963267948966F, 1.730144887501979F, 0.0F);
        this.Lisc2_4 = new ModelRenderer(this, 20, 10);
        this.Lisc2_4.setRotationPoint(1.9F, -0.5F, -0.4F);
        this.Lisc2_4.addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(Lisc2_4, 0.0F, 0.0F, 1.1383037381507017F);
        this.Lisc2_2 = new ModelRenderer(this, 20, 10);
        this.Lisc2_2.setRotationPoint(0.0F, 2.9F, 8.8F);
        this.Lisc2_2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(Lisc2_2, 1.5707963267948966F, 2.367539130330308F, 1.5707963267948966F);
        this.Trzon2 = new ModelRenderer(this, 0, 30);
        this.Trzon2.setRotationPoint(0.5F, -11.6F, 0.5F);
        this.Trzon2.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1, 0.0F);
        this.Lisc1 = new ModelRenderer(this, 30, 0);
        this.Lisc1.setRotationPoint(0.2F, 15.0F, 1.6F);
        this.Lisc1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Lisc1, 0.40980330836826856F, 0.7285004297824331F, 0.0F);
        this.Lisc2 = new ModelRenderer(this, 20, 10);
        this.Lisc2.setRotationPoint(2.0F, 0.7F, 5.4F);
        this.Lisc2.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(Lisc2, 0.0F, -0.7742280561846846F, 1.574636051149284F);
        this.Lisc2_3 = new ModelRenderer(this, 20, 10);
        this.Lisc2_3.setRotationPoint(0.0F, 0.8F, 0.7F);
        this.Lisc2_3.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(Lisc2_3, 0.091106186954104F, 2.276432943376204F, -1.5025539530419183F);
        this.Lisc1_4 = new ModelRenderer(this, 30, 0);
        this.Lisc1_4.setRotationPoint(0.0F, 10.6F, 1.8F);
        this.Lisc1_4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Lisc1_4, -0.8651597102135892F, 0.40980330836826856F, 0.0F);
        this.Lisc1_6 = new ModelRenderer(this, 30, 0);
        this.Lisc1_6.setRotationPoint(-1.0F, 10.7F, 0.0F);
        this.Lisc1_6.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Lisc1_6, -0.8651597102135892F, -1.0016444577195458F, 0.0F);
        this.Trzon1 = new ModelRenderer(this, 0, 0);
        this.Trzon1.setRotationPoint(-1.5F, 8.7F, -1.5F);
        this.Trzon1.addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
        this.Lisc2_5 = new ModelRenderer(this, 20, 10);
        this.Lisc2_5.setRotationPoint(1.5F, 0.0F, 1.0F);
        this.Lisc2_5.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(Lisc2_5, 0.0F, -0.40980330836826856F, 1.593485607070823F);
        this.Trzon2.addChild(this.Lisc1_5);
        this.Trzon2.addChild(this.Lisc2_6);
        this.Trzon2.addChild(this.Lisc2_7);
        this.Trzon1.addChild(this.Lisc1_3);
        this.Trzon1.addChild(this.Lisc1_1);
        this.Trzon1.addChild(this.Lisc1_2);
        this.Trzon2.addChild(this.Lisc1_7);
        this.Lisc1_1.addChild(this.Lisc2_1);
        this.Trzon2.addChild(this.Lisc2_4);
        this.Lisc1_1.addChild(this.Lisc2_2);
        this.Trzon1.addChild(this.Trzon2);
        this.Trzon1.addChild(this.Lisc1);
        this.Lisc1.addChild(this.Lisc2);
        this.Lisc1_2.addChild(this.Lisc2_3);
        this.Trzon2.addChild(this.Lisc1_4);
        this.Trzon2.addChild(this.Lisc1_6);
        this.Trzon2.addChild(this.Lisc2_5);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Trzon1.render(f5);
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
