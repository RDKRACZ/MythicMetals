package nourl.mythicmetals.registry;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nourl.mythicmetals.MythicMetals;

public class RegisterNuggets {
    //Normal Ingots
    public static final Item Adamantite_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Aetherium_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Aquarium_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Argonium_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Banglum_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Brass_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Bronze_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Carmot_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Celestium_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Copper_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Discordium_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Durasteel_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Electrum_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Etherite_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Ferrite_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Kyber_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Lutetium_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Manganese_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Metallurgium_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS).fireproof());
    public static final Item Midas_Gold_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Mythril_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Orichalcum_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Osmium_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Platinum_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Prometheum_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Quadrillum_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Quicksilver_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Runite_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Silver_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Slowsilver_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Starrite_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Steel_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Stormyx_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Tantalite_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Tin_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Truesilver_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Unobtainium_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS).fireproof());
    public static final Item Ur_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Zinc_Nugget = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));

    public static void register() {
        //Register Ingots
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "adamantite_nugget"), Adamantite_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "aetherium_nugget"), Aetherium_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "aquarium_nugget"), Aquarium_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "argonium_nugget"), Argonium_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "banglum_nugget"), Banglum_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "brass_nugget"), Brass_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "bronze_nugget"), Bronze_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "carmot_nugget"), Carmot_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "celestium_nugget"), Celestium_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "copper_nugget"), Copper_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "discordium_nugget"), Discordium_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "durasteel_nugget"), Durasteel_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "electrum_nugget"), Electrum_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "etherite_nugget"), Etherite_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "ferrite_nugget"), Ferrite_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "kyber_nugget"), Kyber_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "lutetium_nugget"), Lutetium_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "manganese_nugget"), Manganese_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "metallurgium_nugget"), Metallurgium_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "midas_gold_nugget"), Midas_Gold_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "mythril_nugget"), Mythril_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "orichalcum_nugget"), Orichalcum_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "osmium_nugget"), Osmium_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "platinum_nugget"), Platinum_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "prometheum_nugget"), Prometheum_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "quadrillum_nugget"), Quadrillum_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "quicksilver_nugget"), Quicksilver_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "runite_nugget"), Runite_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "silver_nugget"), Silver_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "slowsilver_nugget"), Slowsilver_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "starrite_nugget"), Starrite_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "steel_nugget"), Steel_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "stormyx_nugget"), Stormyx_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "tantalite_nugget"), Tantalite_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "tin_nugget"), Tin_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "truesilver_nugget"), Truesilver_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "unobtainium_nugget"), Unobtainium_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "ur_nugget"), Ur_Nugget);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "zinc_nugget"), Zinc_Nugget);
    }
}