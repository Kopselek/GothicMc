package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * OrkoweZiele - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelFlower11 extends ModelBase {
    public ModelRenderer Trzon1;
    public ModelRenderer Lisc6;
    public ModelRenderer Lisc5;
    public ModelRenderer Lisc1;
    public ModelRenderer Lisc2;
    public ModelRenderer Lisc3;
    public ModelRenderer Trzon2;
    public ModelRenderer Lisc4;
    public ModelRenderer Lisc5_1;
    public ModelRenderer lisc1_1;
    public ModelRenderer lisc2_2;
    public ModelRenderer lisc3_3;
    public ModelRenderer lisc4_4;
    public ModelRenderer Lisc5_5;
    public ModelRenderer lisc1_6;
    public ModelRenderer Lisc5_5_1;

    public ModelFlower11() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.Lisc1 = new ModelRenderer(this, 60, 0);
        this.Lisc1.setRotationPoint(0.5F, 17.6F, 2.2F);
        this.Lisc1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 12, 0.0F);
        this.setRotateAngle(Lisc1, 0.5462880558742251F, 0.9560913642424937F, 0.0F);
        this.Lisc5_1 = new ModelRenderer(this, 60, 40);
        this.Lisc5_1.setRotationPoint(2.2F, 3.6F, -4.5F);
        this.Lisc5_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Lisc5_1, -0.31869712141416456F, -0.40980330836826856F, 0.0F);
        this.lisc1_6 = new ModelRenderer(this, 50, 0);
        this.lisc1_6.setRotationPoint(0.0F, 0.0F, 12.1F);
        this.lisc1_6.addBox(0.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(lisc1_6, -1.0016444577195458F, 0.0F, 0.0F);
        this.Lisc3 = new ModelRenderer(this, 60, 0);
        this.Lisc3.setRotationPoint(2.8F, 17.5F, 2.5F);
        this.Lisc3.addBox(0.0F, 0.0F, 0.0F, 3, 2, 12, 0.0F);
        this.setRotateAngle(Lisc3, 0.5462880558742251F, 2.4586453172844123F, 0.0F);
        this.Lisc5_5_1 = new ModelRenderer(this, 40, 40);
        this.Lisc5_5_1.setRotationPoint(0.0F, 2.0F, -2.1F);
        this.Lisc5_5_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Lisc5_5_1, 0.7740535232594852F, 0.0F, 0.0F);
        this.lisc4_4 = new ModelRenderer(this, 40, 40);
        this.lisc4_4.setRotationPoint(0.0F, 0.0F, 6.1F);
        this.lisc4_4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(lisc4_4, -0.8651597102135892F, 0.0F, 0.0F);
        this.lisc1_1 = new ModelRenderer(this, 50, 0);
        this.lisc1_1.setRotationPoint(0.0F, 0.0F, 12.1F);
        this.lisc1_1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(lisc1_1, -1.0016444577195458F, 0.0F, 0.0F);
        this.Lisc2 = new ModelRenderer(this, 60, 0);
        this.Lisc2.setRotationPoint(1.9F, 17.0F, -0.1F);
        this.Lisc2.addBox(0.0F, 0.0F, 0.0F, 3, 2, 12, 0.0F);
        this.setRotateAngle(Lisc2, 0.5009094953223726F, -1.9577358219620393F, 0.0F);
        this.Lisc4 = new ModelRenderer(this, 60, 40);
        this.Lisc4.setRotationPoint(0.6F, 2.3F, 1.3F);
        this.Lisc4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Lisc4, 0.40980330836826856F, -0.9105382707654417F, 0.0F);
        this.Trzon2 = new ModelRenderer(this, 0, 40);
        this.Trzon2.setRotationPoint(2.1F, -6.5F, 0.0F);
        this.Trzon2.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(Trzon2, 0.0F, 0.0F, 0.31869712141416456F);
        this.Lisc5_5 = new ModelRenderer(this, 40, 40);
        this.Lisc5_5.setRotationPoint(0.0F, 2.0F, -2.1F);
        this.Lisc5_5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Lisc5_5, 0.7740535232594852F, 0.0F, 0.0F);
        this.lisc3_3 = new ModelRenderer(this, 50, 0);
        this.lisc3_3.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.lisc3_3.addBox(0.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(lisc3_3, -1.1838568316277536F, 0.0F, 0.0F);
        this.Lisc5 = new ModelRenderer(this, 60, 40);
        this.Lisc5.setRotationPoint(2.2F, 8.8F, 4.8F);
        this.Lisc5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Lisc5, -0.5918411493512771F, -2.6406831582674206F, 0.0F);
        this.lisc2_2 = new ModelRenderer(this, 50, 0);
        this.lisc2_2.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.lisc2_2.addBox(0.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(lisc2_2, -0.8651597102135892F, 0.0F, 0.0F);
        this.Trzon1 = new ModelRenderer(this, 0, 0);
        this.Trzon1.setRotationPoint(-2.6F, 4.9F, 0.0F);
        this.Trzon1.addBox(0.0F, 0.0F, 0.0F, 3, 19, 3, 0.0F);
        this.Lisc6 = new ModelRenderer(this, 60, 0);
        this.Lisc6.setRotationPoint(-2.2F, 22.5F, 0.2F);
        this.Lisc6.addBox(0.0F, 0.0F, 0.0F, 3, 2, 12, 0.0F);
        this.setRotateAngle(Lisc6, 0.6373942428283291F, -0.5462880558742251F, 0.0F);
        this.Trzon1.addChild(this.Lisc1);
        this.Trzon1.addChild(this.Lisc5_1);
        this.Lisc6.addChild(this.lisc1_6);
        this.Trzon1.addChild(this.Lisc3);
        this.Lisc5.addChild(this.Lisc5_5_1);
        this.Lisc4.addChild(this.lisc4_4);
        this.Lisc1.addChild(this.lisc1_1);
        this.Trzon1.addChild(this.Lisc2);
        this.Trzon1.addChild(this.Lisc4);
        this.Trzon1.addChild(this.Trzon2);
        this.Lisc5_1.addChild(this.Lisc5_5);
        this.Lisc3.addChild(this.lisc3_3);
        this.Lisc2.addChild(this.lisc2_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Lisc5.render(f5);
        this.Trzon1.render(f5);
        this.Lisc6.render(f5);
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
