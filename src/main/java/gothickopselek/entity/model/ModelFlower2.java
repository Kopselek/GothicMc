package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * roslina_lecznicza - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelFlower2 extends ModelBase {
    public ModelRenderer trzon;
    public ModelRenderer lisc4;
    public ModelRenderer lisc5;
    public ModelRenderer lisc6;
    public ModelRenderer lisc1;
    public ModelRenderer lisc2;
    public ModelRenderer lisc3;
    public ModelRenderer lisc1_1;
    public ModelRenderer lisc2_2;
    public ModelRenderer lisc3_3;
    public ModelRenderer lisc4_4;
    public ModelRenderer lisc5_5;
    public ModelRenderer lisc6_6;

    public ModelFlower2() {
        this.textureWidth = 500;
        this.textureHeight = 500;
        this.lisc6_6 = new ModelRenderer(this, 110, 40);
        this.lisc6_6.setRotationPoint(0.0F, 1.3F, 10.3F);
        this.lisc6_6.addBox(0.0F, 0.0F, 0.0F, 7, 8, 2, 0.0F);
        this.setRotateAngle(lisc6_6, 0.6373942428283291F, 0.0F, 0.0F);
        this.lisc6 = new ModelRenderer(this, 40, 40);
        this.lisc6.setRotationPoint(0.0F, 18.8F, -3.8F);
        this.lisc6.addBox(0.0F, 0.0F, 0.0F, 7, 2, 12, 0.0F);
        this.setRotateAngle(lisc6, 0.36425021489121656F, -1.3658946726107624F, 0.0F);
        this.trzon = new ModelRenderer(this, 0, 0);
        this.trzon.setRotationPoint(-3.2F, 18.6F, -4.3F);
        this.trzon.addBox(0.0F, 0.0F, 0.0F, 7, 5, 7, 0.0F);
        this.lisc1 = new ModelRenderer(this, 40, 0);
        this.lisc1.setRotationPoint(-7.9F, -3.6F, -2.2F);
        this.lisc1.addBox(0.0F, 0.0F, 0.0F, 7, 2, 12, 0.0F);
        this.setRotateAngle(lisc1, -0.31869712141416456F, 0.8196066167365371F, 0.0F);
        this.lisc4_4 = new ModelRenderer(this, 110, 40);
        this.lisc4_4.setRotationPoint(0.0F, 1.3F, 10.3F);
        this.lisc4_4.addBox(0.0F, 0.0F, 0.0F, 7, 8, 2, 0.0F);
        this.setRotateAngle(lisc4_4, 0.6373942428283291F, 0.0F, 0.0F);
        this.lisc3 = new ModelRenderer(this, 40, 0);
        this.lisc3.setRotationPoint(0.3F, 0.0F, 3.7F);
        this.lisc3.addBox(0.0F, 0.0F, 0.0F, 7, 2, 12, 0.0F);
        this.setRotateAngle(lisc3, 0.31869712141416456F, -0.36425021489121656F, 0.0F);
        this.lisc5 = new ModelRenderer(this, 40, 40);
        this.lisc5.setRotationPoint(4.4F, 19.9F, 0.0F);
        this.lisc5.addBox(0.0F, 0.0F, 0.0F, 7, 2, 12, 0.0F);
        this.setRotateAngle(lisc5, 0.5462880558742251F, 2.8228955321756284F, 0.0F);
        this.lisc2_2 = new ModelRenderer(this, 110, 0);
        this.lisc2_2.setRotationPoint(0.0F, 1.0F, 10.2F);
        this.lisc2_2.addBox(0.0F, 0.0F, 0.0F, 7, 8, 2, 0.0F);
        this.setRotateAngle(lisc2_2, 0.4553564018453205F, 0.0F, 0.0F);
        this.lisc1_1 = new ModelRenderer(this, 110, 0);
        this.lisc1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lisc1_1.addBox(0.0F, 0.0F, 0.0F, 7, 8, 2, 0.0F);
        this.setRotateAngle(lisc1_1, -0.5462880558742251F, 0.0F, 0.0F);
        this.lisc3_3 = new ModelRenderer(this, 110, 0);
        this.lisc3_3.setRotationPoint(0.0F, 1.3F, 10.3F);
        this.lisc3_3.addBox(0.0F, 0.0F, 0.0F, 7, 8, 2, 0.0F);
        this.setRotateAngle(lisc3_3, 0.6373942428283291F, 0.0F, 0.0F);
        this.lisc5_5 = new ModelRenderer(this, 110, 40);
        this.lisc5_5.setRotationPoint(0.0F, 1.3F, 10.3F);
        this.lisc5_5.addBox(0.0F, 0.0F, 0.0F, 7, 8, 2, 0.0F);
        this.setRotateAngle(lisc5_5, 0.6373942428283291F, 0.0F, 0.0F);
        this.lisc4 = new ModelRenderer(this, 40, 40);
        this.lisc4.setRotationPoint(-3.4F, 18.6F, 1.9F);
        this.lisc4.addBox(0.0F, 0.0F, 0.0F, 7, 2, 12, 0.0F);
        this.setRotateAngle(lisc4, 0.36425021489121656F, 0.7285004297824331F, 0.0F);
        this.lisc2 = new ModelRenderer(this, 40, 0);
        this.lisc2.setRotationPoint(5.3F, 0.2F, 7.0F);
        this.lisc2.addBox(0.0F, 0.0F, 0.0F, 7, 2, 12, 0.0F);
        this.setRotateAngle(lisc2, 0.40980330836826856F, 1.8212510744560826F, 0.0F);
        this.lisc6.addChild(this.lisc6_6);
        this.trzon.addChild(this.lisc1);
        this.lisc4.addChild(this.lisc4_4);
        this.trzon.addChild(this.lisc3);
        this.lisc2.addChild(this.lisc2_2);
        this.lisc1.addChild(this.lisc1_1);
        this.lisc3.addChild(this.lisc3_3);
        this.lisc5.addChild(this.lisc5_5);
        this.trzon.addChild(this.lisc2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.lisc6.render(f5);
        this.trzon.render(f5);
        this.lisc5.render(f5);
        this.lisc4.render(f5);
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
