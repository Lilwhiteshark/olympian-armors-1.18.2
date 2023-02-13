package net.lilwhiteshark.olympianarmors.event;

import net.lilwhiteshark.olympianarmors.OlympianArmors;
import net.lilwhiteshark.olympianarmors.entity.client.armor.FarmerArmorRenderer;
import net.lilwhiteshark.olympianarmors.item.custom.FarmerArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;


@Mod.EventBusSubscriber(modid = OlympianArmors.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(FarmerArmorItem.class, new FarmerArmorRenderer());
    }
}

