package gothickopselek.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Piekielnik - Sprint2DJ
 * Created using Tabula 7.0.1
 */
public class ModelFlower3 extends ModelBase {
    public ModelRenderer Trzon;
    public ModelRenderer Kapelusz;
    public ModelRenderer Kapelusz2;

    public ModelFlower3() {
        this.textureWidth = 500;
        this.textureHeight = 500;
        this.Trzon = new ModelRenderer(this, 0, 0);
        this.Trzon.setRotationPoint(-5.1F, 2.1F, -5.3F);
        this.Trzon.addBox(0.0F, 0.0F, 0.0F, 10, 22, 10, 0.0F);
        this.Kapelusz = new ModelRenderer(this, 55, 0);
        this.Kapelusz.setRotationPoint(-7.0F, -2.3F, -7.0F);
        this.Kapelusz.addBox(0.0F, 0.0F, 0.0F, 24, 3, 24, 0.0F);
        this.Kapelusz2 = new ModelRenderer(this, 135, 0);
        this.Kapelusz2.setRotationPoint(3.0F, -2.7F, 3.0F);
        this.Kapelusz2.addBox(0.0F, 0.0F, 0.0F, 18, 3, 18, 0.0F);
        this.Trzon.addChild(this.Kapelusz);
        this.Kapelusz.addChild(this.Kapelusz2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Trzon.render(f5);
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
