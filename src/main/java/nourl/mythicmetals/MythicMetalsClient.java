package nourl.mythicmetals;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderingRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import nourl.mythicmetals.armor.HallowedArmor;
import nourl.mythicmetals.armor.MetallurgiumArmor;
import nourl.mythicmetals.blocks.MythicMetalsChains;
import nourl.mythicmetals.registry.RegisterArmor;

public class MythicMetalsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        makeOpaque();
        renderHallowedArmorModel();
        renderMetallurgiumArmorModel();
    }

    // Makes custom model blocks see trough, like chains
    public void makeOpaque() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
                MythicMetalsChains.ADAMANTITE_CHAIN,
                MythicMetalsChains.AETHERIUM_CHAIN,
                MythicMetalsChains.AQUARIUM_CHAIN,
                MythicMetalsChains.ARGONIUM_CHAIN,
                MythicMetalsChains.BANGLUM_CHAIN,
                MythicMetalsChains.BRASS_CHAIN,
                MythicMetalsChains.BRONZE_CHAIN,
                MythicMetalsChains.CARMOT_CHAIN,
                MythicMetalsChains.CELESTIUM_CHAIN,
                MythicMetalsChains.DISCORDIUM_CHAIN,
                MythicMetalsChains.DURASTEEL_CHAIN,
                MythicMetalsChains.ELECTRUM_CHAIN,
                MythicMetalsChains.ETHERITE_CHAIN,
                MythicMetalsChains.KYBER_CHAIN,
                MythicMetalsChains.HALLOWED_CHAIN,
                MythicMetalsChains.MANGANESE_CHAIN,
                MythicMetalsChains.METALLURGIUM_CHAIN,
                MythicMetalsChains.MIDAS_GOLD_CHAIN,
                MythicMetalsChains.MYTHRIL_CHAIN,
                MythicMetalsChains.ORICHALCUM_CHAIN,
                MythicMetalsChains.OSMIUM_CHAIN,
                MythicMetalsChains.PLATINUM_CHAIN,
                MythicMetalsChains.PROMETHEUM_CHAIN,
                MythicMetalsChains.QUADRILLUM_CHAIN,
                MythicMetalsChains.QUICKSILVER_CHAIN,
                MythicMetalsChains.RUNITE_CHAIN,
                MythicMetalsChains.SILVER_CHAIN,
                MythicMetalsChains.SLOWSILVER_CHAIN,
                MythicMetalsChains.STARRITE_CHAIN,
                MythicMetalsChains.STEEL_CHAIN,
                MythicMetalsChains.STORMYX_CHAIN,
                MythicMetalsChains.TANTALITE_CHAIN,
                MythicMetalsChains.TRUESILVER_CHAIN,
                MythicMetalsChains.UR_CHAIN
        );
    }
    // Adds custom entity models to hallowed and metallurgium armor
    public void renderHallowedArmorModel() {
        ArmorRenderingRegistry.ModelProvider modelProvider = (entity, stack, slot, original) -> ((HallowedArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        ArmorRenderingRegistry.TextureProvider textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((HallowedArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, RegisterArmor.HALLOWED_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, RegisterArmor.HALLOWED_HELMET);
        ArmorRenderingRegistry.registerModel(modelProvider, RegisterArmor.HALLOWED_CHESTPLATE);
        ArmorRenderingRegistry.registerTexture(textureProvider, RegisterArmor.HALLOWED_CHESTPLATE);
        ArmorRenderingRegistry.registerModel(modelProvider, RegisterArmor.HALLOWED_LEGGINGS);
        ArmorRenderingRegistry.registerTexture(textureProvider, RegisterArmor.HALLOWED_LEGGINGS);
    }

    public void renderMetallurgiumArmorModel() {
        ArmorRenderingRegistry.ModelProvider modelProvider = (entity, stack, slot, original) -> ((MetallurgiumArmor) stack.getItem()).getArmorModel(entity, stack, slot, original);
        ArmorRenderingRegistry.TextureProvider textureProvider = (entity, stack, slot, secondLayer, suffix, original) -> new Identifier(((MetallurgiumArmor) stack.getItem()).getArmorTexture(stack, slot));
        ArmorRenderingRegistry.registerModel(modelProvider, RegisterArmor.METALLURGIUM_HELMET);
        ArmorRenderingRegistry.registerTexture(textureProvider, RegisterArmor.METALLURGIUM_HELMET);
    }

}
