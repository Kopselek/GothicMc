package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * GoblinskieJagody - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelFlower9 extends ModelBase {
    public ModelRenderer Trzon1;
    public ModelRenderer Lisc;
    public ModelRenderer Owoc1;
    public ModelRenderer Lisc_1;
    public ModelRenderer Lisc_2;
    public ModelRenderer Lisc_3;
    public ModelRenderer Lisc_4;
    public ModelRenderer Lisc_5;
    public ModelRenderer Lisc_6;
    public ModelRenderer Lisc_7;
    public ModelRenderer Owoc1_1;
    public ModelRenderer Owoc1_2;
    public ModelRenderer Owoc1_3;

    public ModelFlower9() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.Lisc_7 = new ModelRenderer(this, 0, 0);
        this.Lisc_7.setRotationPoint(1.4F, 10.9F, 0.0F);
        this.Lisc_7.addBox(0.0F, 0.0F, 0.0F, 6, 1, 3, 0.0F);
        this.setRotateAngle(Lisc_7, 0.0F, -0.22759093446006054F, 0.27314402793711257F);
        this.Owoc1 = new ModelRenderer(this, 30, 0);
        this.Owoc1.setRotationPoint(1.5F, 2.4F, 0.1F);
        this.Owoc1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Lisc = new ModelRenderer(this, 0, 0);
        this.Lisc.setRotationPoint(-0.7F, 15.8F, -1.4F);
        this.Lisc.addBox(0.0F, 0.0F, 0.0F, 6, 1, 3, 0.0F);
        this.setRotateAngle(Lisc, 0.6829473363053812F, 0.9105382707654417F, 0.40980330836826856F);
        this.Lisc_3 = new ModelRenderer(this, 0, 0);
        this.Lisc_3.setRotationPoint(0.8F, 0.2F, -0.8F);
        this.Lisc_3.addBox(2.4F, 0.0F, 0.0F, 6, 1, 3, 0.0F);
        this.setRotateAngle(Lisc_3, 0.0F, -0.5462880558742251F, 0.40980330836826856F);
        this.Lisc_4 = new ModelRenderer(this, 0, 0);
        this.Lisc_4.setRotationPoint(-3.0F, 5.1F, -3.3F);
        this.Lisc_4.addBox(0.0F, 0.0F, 0.0F, 6, 1, 3, 0.0F);
        this.setRotateAngle(Lisc_4, 0.0F, -0.5918411493512771F, -0.27314402793711257F);
        this.Lisc_1 = new ModelRenderer(this, 0, 0);
        this.Lisc_1.setRotationPoint(0.4F, -1.1F, 0.8F);
        this.Lisc_1.addBox(0.0F, 0.0F, 0.0F, 6, 1, 3, 0.0F);
        this.setRotateAngle(Lisc_1, -0.136659280431156F, -2.6862362517444724F, -0.5462880558742251F);
        this.Owoc1_2 = new ModelRenderer(this, 30, 0);
        this.Owoc1_2.setRotationPoint(3.0F, 16.2F, -1.5F);
        this.Owoc1_2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Lisc_6 = new ModelRenderer(this, 0, 0);
        this.Lisc_6.setRotationPoint(-2.9F, 20.0F, -2.3F);
        this.Lisc_6.addBox(0.0F, 0.0F, 0.0F, 6, 1, 3, 0.0F);
        this.setRotateAngle(Lisc_6, 0.0F, -0.4553564018453205F, -0.40980330836826856F);
        this.Trzon1 = new ModelRenderer(this, 50, 0);
        this.Trzon1.setRotationPoint(-1.3F, 0.1F, -1.9F);
        this.Trzon1.addBox(0.0F, 0.0F, 0.0F, 3, 24, 3, 0.0F);
        this.Lisc_5 = new ModelRenderer(this, 0, 0);
        this.Lisc_5.setRotationPoint(-4.4F, 11.6F, 3.7F);
        this.Lisc_5.addBox(0.0F, 0.0F, 0.0F, 6, 1, 3, 0.0F);
        this.setRotateAngle(Lisc_5, 0.0F, 0.5918411493512771F, -0.4553564018453205F);
        this.Owoc1_1 = new ModelRenderer(this, 30, 0);
        this.Owoc1_1.setRotationPoint(-2.1F, 10.6F, 2.0F);
        this.Owoc1_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Lisc_2 = new ModelRenderer(this, 0, 0);
        this.Lisc_2.setRotationPoint(3.0F, 18.5F, 0.9F);
        this.Lisc_2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 3, 0.0F);
        this.setRotateAngle(Lisc_2, -0.045553093477052F, -0.7285004297824331F, 0.40980330836826856F);
        this.Owoc1_3 = new ModelRenderer(this, 30, 0);
        this.Owoc1_3.setRotationPoint(0.3F, -1.7F, 0.3F);
        this.Owoc1_3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Trzon1.addChild(this.Lisc_7);
        this.Trzon1.addChild(this.Lisc_3);
        this.Trzon1.addChild(this.Lisc_4);
        this.Trzon1.addChild(this.Owoc1_2);
        this.Trzon1.addChild(this.Lisc_6);
        this.Trzon1.addChild(this.Lisc_5);
        this.Trzon1.addChild(this.Owoc1_1);
        this.Trzon1.addChild(this.Lisc_2);
        this.Trzon1.addChild(this.Owoc1_3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Owoc1.render(f5);
        this.Lisc.render(f5);
        this.Lisc_1.render(f5);
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
