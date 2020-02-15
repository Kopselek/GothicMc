package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * roslina_lecznicza - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelFlower4 extends ModelBase {
    public ModelRenderer trzon;
    public ModelRenderer lisc1;
    public ModelRenderer lisc2;
    public ModelRenderer lisc3;
    public ModelRenderer lisc1_1;
    public ModelRenderer lisc2_2;
    public ModelRenderer lisc3_3;

    public ModelFlower4() {
        this.textureWidth = 500;
        this.textureHeight = 500;
        this.lisc3_3 = new ModelRenderer(this, 110, 0);
        this.lisc3_3.setRotationPoint(0.0F, 1.3F, 10.3F);
        this.lisc3_3.addBox(0.0F, 0.0F, 0.0F, 7, 8, 2, 0.0F);
        this.setRotateAngle(lisc3_3, 0.6373942428283291F, 0.0F, 0.0F);
        this.lisc3 = new ModelRenderer(this, 40, 0);
        this.lisc3.setRotationPoint(0.3F, 0.0F, 3.7F);
        this.lisc3.addBox(0.0F, 0.0F, 0.0F, 7, 2, 12, 0.0F);
        this.setRotateAngle(lisc3, 0.31869712141416456F, -0.36425021489121656F, 0.0F);
        this.lisc2_2 = new ModelRenderer(this, 110, 0);
        this.lisc2_2.setRotationPoint(0.0F, 1.0F, 10.2F);
        this.lisc2_2.addBox(0.0F, 0.0F, 0.0F, 7, 8, 2, 0.0F);
        this.setRotateAngle(lisc2_2, 0.4553564018453205F, 0.0F, 0.0F);
        this.trzon = new ModelRenderer(this, 0, 0);
        this.trzon.setRotationPoint(-3.2F, 18.6F, -4.3F);
        this.trzon.addBox(0.0F, 0.0F, 0.0F, 7, 5, 7, 0.0F);
        this.lisc1 = new ModelRenderer(this, 40, 0);
        this.lisc1.setRotationPoint(-7.9F, -3.6F, -2.2F);
        this.lisc1.addBox(0.0F, 0.0F, 0.0F, 7, 2, 12, 0.0F);
        this.setRotateAngle(lisc1, -0.31869712141416456F, 0.8196066167365371F, 0.0F);
        this.lisc1_1 = new ModelRenderer(this, 110, 0);
        this.lisc1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lisc1_1.addBox(0.0F, 0.0F, 0.0F, 7, 8, 2, 0.0F);
        this.setRotateAngle(lisc1_1, -0.5462880558742251F, 0.0F, 0.0F);
        this.lisc2 = new ModelRenderer(this, 40, 0);
        this.lisc2.setRotationPoint(5.3F, 0.2F, 7.0F);
        this.lisc2.addBox(0.0F, 0.0F, 0.0F, 7, 2, 12, 0.0F);
        this.setRotateAngle(lisc2, 0.40980330836826856F, 1.8212510744560826F, 0.0F);
        this.lisc3.addChild(this.lisc3_3);
        this.trzon.addChild(this.lisc3);
        this.lisc2.addChild(this.lisc2_2);
        this.trzon.addChild(this.lisc1);
        this.lisc1.addChild(this.lisc1_1);
        this.trzon.addChild(this.lisc2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.trzon.render(f5);
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
