package net.lilwhiteshark.olympianarmors.item;

import net.lilwhiteshark.olympianarmors.OlympianArmors;
import net.lilwhiteshark.olympianarmors.item.custom.FarmerArmorItem;
import net.lilwhiteshark.olympianarmors.item.custom.ModArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OlympianArmors.MOD_ID);

    public static final RegistryObject<Item> CADUCEUS = ITEMS.register("caduceus",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> FARMER_HELMET = ITEMS.register("farmer_helmet",
            () -> new FarmerArmorItem(ModArmorMaterials.FARMER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> FARMER_CHESTPLATE = ITEMS.register("farmer_chestplate",
            () -> new FarmerArmorItem(ModArmorMaterials.FARMER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> FARMER_LEGGINGS = ITEMS.register("farmer_leggings",
            () -> new FarmerArmorItem(ModArmorMaterials.FARMER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> FARMER_BOOTS = ITEMS.register("farmer_boots",
            () -> new FarmerArmorItem(ModArmorMaterials.FARMER, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
