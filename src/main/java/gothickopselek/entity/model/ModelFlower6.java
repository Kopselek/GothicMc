package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * SmoczyKorzen - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelFlower6 extends ModelBase {
    public ModelRenderer Trzon1;
    public ModelRenderer Trzon2;
    public ModelRenderer Trzon3;
    public ModelRenderer Trzon4;
    public ModelRenderer Trzon5;

    public ModelFlower6() {
        this.textureWidth = 500;
        this.textureHeight = 500;
        this.Trzon1 = new ModelRenderer(this, 0, 0);
        this.Trzon1.setRotationPoint(-8.9F, 22.1F, -11.5F);
        this.Trzon1.addBox(0.0F, 0.0F, 0.0F, 18, 2, 22, 0.0F);
        this.Trzon2 = new ModelRenderer(this, 100, 0);
        this.Trzon2.setRotationPoint(-1.8F, 0.0F, -1.9F);
        this.Trzon2.addBox(0.0F, 0.0F, 0.0F, 8, 2, 10, 0.0F);
        this.Trzon5 = new ModelRenderer(this, 100, 0);
        this.Trzon5.setRotationPoint(7.3F, 0.0F, 16.7F);
        this.Trzon5.addBox(0.0F, 0.0F, 0.0F, 8, 2, 10, 0.0F);
        this.Trzon3 = new ModelRenderer(this, 100, 0);
        this.Trzon3.setRotationPoint(-1.1F, 0.0F, 7.9F);
        this.Trzon3.addBox(0.0F, 0.0F, 0.0F, 8, 2, 10, 0.0F);
        this.Trzon4 = new ModelRenderer(this, 100, 0);
        this.Trzon4.setRotationPoint(12.8F, 0.0F, 3.1F);
        this.Trzon4.addBox(0.0F, 0.0F, 0.0F, 8, 2, 10, 0.0F);
        this.Trzon1.addChild(this.Trzon2);
        this.Trzon1.addChild(this.Trzon5);
        this.Trzon1.addChild(this.Trzon3);
        this.Trzon1.addChild(this.Trzon4);
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
