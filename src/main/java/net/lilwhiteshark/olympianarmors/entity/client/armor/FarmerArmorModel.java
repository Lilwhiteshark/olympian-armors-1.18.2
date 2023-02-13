package net.lilwhiteshark.olympianarmors.entity.client.armor;

import net.lilwhiteshark.olympianarmors.OlympianArmors;
import net.lilwhiteshark.olympianarmors.item.custom.FarmerArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FarmerArmorModel extends AnimatedGeoModel<FarmerArmorItem> {
    @Override
    public ResourceLocation getModelLocation(FarmerArmorItem object) {
        return new ResourceLocation(OlympianArmors.MOD_ID, "geo/farmer_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FarmerArmorItem object) {
        return new ResourceLocation(OlympianArmors.MOD_ID, "textures/models/armor/farmer_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FarmerArmorItem animatable) {
        return new ResourceLocation(OlympianArmors.MOD_ID, "animations/armor_animation.json");
    }
}

