package net.lilwhiteshark.olympianarmors.entity.client.armor;

import net.lilwhiteshark.olympianarmors.item.custom.FarmerArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FarmerArmorRenderer extends GeoArmorRenderer<FarmerArmorItem> {
    public FarmerArmorRenderer() {
        super(new FarmerArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
