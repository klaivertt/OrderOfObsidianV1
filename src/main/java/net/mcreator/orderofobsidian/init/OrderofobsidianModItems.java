
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.orderofobsidian.item.XPberryItem;
import net.mcreator.orderofobsidian.item.Wooden_armorArmorItem;
import net.mcreator.orderofobsidian.item.WoodKatanaItem;
import net.mcreator.orderofobsidian.item.WoodHammerItem;
import net.mcreator.orderofobsidian.item.WoodBattleAxeItem;
import net.mcreator.orderofobsidian.item.WirecoilCopperItem;
import net.mcreator.orderofobsidian.item.UrukSwordItem;
import net.mcreator.orderofobsidian.item.UrukShovelItem;
import net.mcreator.orderofobsidian.item.UrukPickaxeItem;
import net.mcreator.orderofobsidian.item.UrukIngotItem;
import net.mcreator.orderofobsidian.item.UrukHoeItem;
import net.mcreator.orderofobsidian.item.UrukBattleaxeItem;
import net.mcreator.orderofobsidian.item.UrukAxeItem;
import net.mcreator.orderofobsidian.item.UrukArmorItem;
import net.mcreator.orderofobsidian.item.UruckMetalPowderItem;
import net.mcreator.orderofobsidian.item.UruckHammerItem;
import net.mcreator.orderofobsidian.item.UruckDaggerItem;
import net.mcreator.orderofobsidian.item.UltimateswordItem;
import net.mcreator.orderofobsidian.item.TinyRubberItem;
import net.mcreator.orderofobsidian.item.SushiItem;
import net.mcreator.orderofobsidian.item.Stone_armorArmorItem;
import net.mcreator.orderofobsidian.item.StoneStoveItem;
import net.mcreator.orderofobsidian.item.StoneKatanaItem;
import net.mcreator.orderofobsidian.item.StoneHammerItem;
import net.mcreator.orderofobsidian.item.StoneBattleAxeItem;
import net.mcreator.orderofobsidian.item.StickswordItem;
import net.mcreator.orderofobsidian.item.SteelSwordItem;
import net.mcreator.orderofobsidian.item.SteelSnaffleItem;
import net.mcreator.orderofobsidian.item.SteelShovelItem;
import net.mcreator.orderofobsidian.item.SteelPlateItem;
import net.mcreator.orderofobsidian.item.SteelPickaxeItem;
import net.mcreator.orderofobsidian.item.SteelIngotItem;
import net.mcreator.orderofobsidian.item.SteelHoeItem;
import net.mcreator.orderofobsidian.item.SteelDustItem;
import net.mcreator.orderofobsidian.item.SteelAxeItem;
import net.mcreator.orderofobsidian.item.SteelArmorItem;
import net.mcreator.orderofobsidian.item.SilverPlateItem;
import net.mcreator.orderofobsidian.item.SilverIngotItem;
import net.mcreator.orderofobsidian.item.RubberItem;
import net.mcreator.orderofobsidian.item.RiceSeedItem;
import net.mcreator.orderofobsidian.item.RiceItem;
import net.mcreator.orderofobsidian.item.RangerArmorItem;
import net.mcreator.orderofobsidian.item.ProcesseurTierIItem;
import net.mcreator.orderofobsidian.item.ProcesseurTierIIItem;
import net.mcreator.orderofobsidian.item.PlastiqueItem;
import net.mcreator.orderofobsidian.item.OxysstoveItem;
import net.mcreator.orderofobsidian.item.OxysappleItem;
import net.mcreator.orderofobsidian.item.OxysSwordItem;
import net.mcreator.orderofobsidian.item.OxysStickItem;
import net.mcreator.orderofobsidian.item.OxysSpearItem;
import net.mcreator.orderofobsidian.item.OxysShovelItem;
import net.mcreator.orderofobsidian.item.OxysPickaxeItem;
import net.mcreator.orderofobsidian.item.OxysItem;
import net.mcreator.orderofobsidian.item.OxysHoeItem;
import net.mcreator.orderofobsidian.item.OxysHammerItem;
import net.mcreator.orderofobsidian.item.OxysBowItem;
import net.mcreator.orderofobsidian.item.OxysAxeItem;
import net.mcreator.orderofobsidian.item.OxysArmorItem;
import net.mcreator.orderofobsidian.item.ObsidianhammerItem;
import net.mcreator.orderofobsidian.item.Obsidian_toolSwordItem;
import net.mcreator.orderofobsidian.item.Obsidian_toolShovelItem;
import net.mcreator.orderofobsidian.item.Obsidian_toolPickaxeItem;
import net.mcreator.orderofobsidian.item.Obsidian_toolHoeItem;
import net.mcreator.orderofobsidian.item.Obsidian_toolAxeItem;
import net.mcreator.orderofobsidian.item.Obsidian_armorArmorItem;
import net.mcreator.orderofobsidian.item.ObsidianSpearItem;
import net.mcreator.orderofobsidian.item.ObsidianSnaffleItem;
import net.mcreator.orderofobsidian.item.NtehritAppleItem;
import net.mcreator.orderofobsidian.item.NetheritestoveItem;
import net.mcreator.orderofobsidian.item.NetheriteHammerItem;
import net.mcreator.orderofobsidian.item.NetherackarmorArmorItem;
import net.mcreator.orderofobsidian.item.MitrilIngotItem;
import net.mcreator.orderofobsidian.item.MitrilArmorItem;
import net.mcreator.orderofobsidian.item.MelstoneItem;
import net.mcreator.orderofobsidian.item.LeadPlateItem;
import net.mcreator.orderofobsidian.item.LeadIngotItem;
import net.mcreator.orderofobsidian.item.LeadDustItem;
import net.mcreator.orderofobsidian.item.IronstoveItem;
import net.mcreator.orderofobsidian.item.IronplateItem;
import net.mcreator.orderofobsidian.item.IronbarreItem;
import net.mcreator.orderofobsidian.item.IronSpearItem;
import net.mcreator.orderofobsidian.item.IronKatanaItem;
import net.mcreator.orderofobsidian.item.IronHammerItem;
import net.mcreator.orderofobsidian.item.IronBattleAxeItem;
import net.mcreator.orderofobsidian.item.HueersiteItem;
import net.mcreator.orderofobsidian.item.GraphiteIngotItem;
import net.mcreator.orderofobsidian.item.GraphiteDustItem;
import net.mcreator.orderofobsidian.item.GoldstoveItem;
import net.mcreator.orderofobsidian.item.GoldenchieldItem;
import net.mcreator.orderofobsidian.item.GoldenchielblokingItem;
import net.mcreator.orderofobsidian.item.GoldSpearItem;
import net.mcreator.orderofobsidian.item.GoldKatanaItem;
import net.mcreator.orderofobsidian.item.GoldHammerItem;
import net.mcreator.orderofobsidian.item.GoldBattleAxeItem;
import net.mcreator.orderofobsidian.item.FriedEggItem;
import net.mcreator.orderofobsidian.item.FlourItem;
import net.mcreator.orderofobsidian.item.FaradayArmorItem;
import net.mcreator.orderofobsidian.item.EnergySettingDeviceItem;
import net.mcreator.orderofobsidian.item.EnergySettingDevice0Item;
import net.mcreator.orderofobsidian.item.ElectroniqueCircuitItem;
import net.mcreator.orderofobsidian.item.DynamiteOxysItem;
import net.mcreator.orderofobsidian.item.DynamiteItem;
import net.mcreator.orderofobsidian.item.DynamiteBauheriteItem;
import net.mcreator.orderofobsidian.item.DynamiteAvenroniteItem;
import net.mcreator.orderofobsidian.item.DynamiteAikigiteItem;
import net.mcreator.orderofobsidian.item.DimondhammerItem;
import net.mcreator.orderofobsidian.item.DiamondstoveItem;
import net.mcreator.orderofobsidian.item.DiamondSpearItem;
import net.mcreator.orderofobsidian.item.DiamondSnaffleItem;
import net.mcreator.orderofobsidian.item.DiamondShardItem;
import net.mcreator.orderofobsidian.item.DiamondKatanaItem;
import net.mcreator.orderofobsidian.item.DiamondBattleAxeItem;
import net.mcreator.orderofobsidian.item.DiamondAppleItem;
import net.mcreator.orderofobsidian.item.CopperPlateItem;
import net.mcreator.orderofobsidian.item.CopperGearItem;
import net.mcreator.orderofobsidian.item.CookedRiceItem;
import net.mcreator.orderofobsidian.item.CompresedXpBerryItem;
import net.mcreator.orderofobsidian.item.CompactedXPberryItem;
import net.mcreator.orderofobsidian.item.ChipsItem;
import net.mcreator.orderofobsidian.item.ChikenWhithBreadcrumbsItem;
import net.mcreator.orderofobsidian.item.ChickenwingItem;
import net.mcreator.orderofobsidian.item.BlakUrukItem;
import net.mcreator.orderofobsidian.item.BlackUrukDaggerItem;
import net.mcreator.orderofobsidian.item.BigdynamiteOxysItem;
import net.mcreator.orderofobsidian.item.BigdynamiteBauheriteItem;
import net.mcreator.orderofobsidian.item.BigdynamiteAvenroniteItem;
import net.mcreator.orderofobsidian.item.BigDynamiteItem;
import net.mcreator.orderofobsidian.item.BigDynamiteAikigiteItem;
import net.mcreator.orderofobsidian.item.BauheritehammerItem;
import net.mcreator.orderofobsidian.item.BauheriteSwordItem;
import net.mcreator.orderofobsidian.item.BauheriteSnaffleItem;
import net.mcreator.orderofobsidian.item.BauheriteShovelItem;
import net.mcreator.orderofobsidian.item.BauheritePickaxeItem;
import net.mcreator.orderofobsidian.item.BauheriteMixedCoalItem;
import net.mcreator.orderofobsidian.item.BauheriteIngotItem;
import net.mcreator.orderofobsidian.item.BauheriteAxeItem;
import net.mcreator.orderofobsidian.item.BauheriteArmorItem;
import net.mcreator.orderofobsidian.item.BatterieCellItem;
import net.mcreator.orderofobsidian.item.AvenronitehammerItem;
import net.mcreator.orderofobsidian.item.AvenroniteSwordItem;
import net.mcreator.orderofobsidian.item.AvenroniteShovelItem;
import net.mcreator.orderofobsidian.item.AvenronitePickaxeItem;
import net.mcreator.orderofobsidian.item.AvenroniteMixedCoalItem;
import net.mcreator.orderofobsidian.item.AvenroniteIngotItem;
import net.mcreator.orderofobsidian.item.AvenroniteAxeItem;
import net.mcreator.orderofobsidian.item.AvenroniteArmorItem;
import net.mcreator.orderofobsidian.item.AngmarSwordItem;
import net.mcreator.orderofobsidian.item.AngmarShovelItem;
import net.mcreator.orderofobsidian.item.AngmarPickaxeItem;
import net.mcreator.orderofobsidian.item.AngmarHoeItem;
import net.mcreator.orderofobsidian.item.AngmarBattleAxeItem;
import net.mcreator.orderofobsidian.item.AngmarAxeItem;
import net.mcreator.orderofobsidian.item.AngmarArmorItem;
import net.mcreator.orderofobsidian.item.AngmaHammerItem;
import net.mcreator.orderofobsidian.item.AluminiumPlateItem;
import net.mcreator.orderofobsidian.item.AluminiumIngotItem;
import net.mcreator.orderofobsidian.item.AlluminiumSnaffleItem;
import net.mcreator.orderofobsidian.item.AikigitehammerItem;
import net.mcreator.orderofobsidian.item.AikigiteSwordItem;
import net.mcreator.orderofobsidian.item.AikigiteShovelItem;
import net.mcreator.orderofobsidian.item.AikigitePickaxeItem;
import net.mcreator.orderofobsidian.item.AikigiteMixedCoalItem;
import net.mcreator.orderofobsidian.item.AikigiteIngotItem;
import net.mcreator.orderofobsidian.item.AikigiteAxeItem;
import net.mcreator.orderofobsidian.item.AikigiteArmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OrderofobsidianModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item OXYSAPPLE = register(new OxysappleItem());
	public static final Item NETHERACKARMOR_ARMOR_HELMET = register(new NetherackarmorArmorItem.Helmet());
	public static final Item NETHERACKARMOR_ARMOR_CHESTPLATE = register(new NetherackarmorArmorItem.Chestplate());
	public static final Item NETHERACKARMOR_ARMOR_LEGGINGS = register(new NetherackarmorArmorItem.Leggings());
	public static final Item NETHERACKARMOR_ARMOR_BOOTS = register(new NetherackarmorArmorItem.Boots());
	public static final Item OBSIDIAN_ARMOR_ARMOR_HELMET = register(new Obsidian_armorArmorItem.Helmet());
	public static final Item OBSIDIAN_ARMOR_ARMOR_CHESTPLATE = register(new Obsidian_armorArmorItem.Chestplate());
	public static final Item OBSIDIAN_ARMOR_ARMOR_LEGGINGS = register(new Obsidian_armorArmorItem.Leggings());
	public static final Item OBSIDIAN_ARMOR_ARMOR_BOOTS = register(new Obsidian_armorArmorItem.Boots());
	public static final Item DIAMOND_APPLE = register(new DiamondAppleItem());
	public static final Item OXYS = register(new OxysItem());
	public static final Item OXYS_ORE = register(OrderofobsidianModBlocks.OXYS_ORE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item OXYS_BLOCK = register(OrderofobsidianModBlocks.OXYS_BLOCK, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item OXYS_PICKAXE = register(new OxysPickaxeItem());
	public static final Item OXYS_AXE = register(new OxysAxeItem());
	public static final Item OXYS_SWORD = register(new OxysSwordItem());
	public static final Item OXYS_SHOVEL = register(new OxysShovelItem());
	public static final Item OXYS_HOE = register(new OxysHoeItem());
	public static final Item OXYS_ARMOR_HELMET = register(new OxysArmorItem.Helmet());
	public static final Item OXYS_ARMOR_CHESTPLATE = register(new OxysArmorItem.Chestplate());
	public static final Item OXYS_ARMOR_LEGGINGS = register(new OxysArmorItem.Leggings());
	public static final Item OXYS_ARMOR_BOOTS = register(new OxysArmorItem.Boots());
	public static final Item OXYS_STICK = register(new OxysStickItem());
	public static final Item OXYS_BOW = register(new OxysBowItem());
	public static final Item BURNEDTREE_WOOD = register(OrderofobsidianModBlocks.BURNEDTREE_WOOD, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_LOG = register(OrderofobsidianModBlocks.BURNEDTREE_LOG, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_PLANKS = register(OrderofobsidianModBlocks.BURNEDTREE_PLANKS, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_LEAVES = register(OrderofobsidianModBlocks.BURNEDTREE_LEAVES, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_STAIRS = register(OrderofobsidianModBlocks.BURNEDTREE_STAIRS, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_SLAB = register(OrderofobsidianModBlocks.BURNEDTREE_SLAB, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_FENCE = register(OrderofobsidianModBlocks.BURNEDTREE_FENCE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_FENCE_GATE = register(OrderofobsidianModBlocks.BURNEDTREE_FENCE_GATE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_PRESSURE_PLATE = register(OrderofobsidianModBlocks.BURNEDTREE_PRESSURE_PLATE,
			OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_BUTTON = register(OrderofobsidianModBlocks.BURNEDTREE_BUTTON, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item WOODEN_ARMOR_ARMOR_HELMET = register(new Wooden_armorArmorItem.Helmet());
	public static final Item WOODEN_ARMOR_ARMOR_CHESTPLATE = register(new Wooden_armorArmorItem.Chestplate());
	public static final Item WOODEN_ARMOR_ARMOR_LEGGINGS = register(new Wooden_armorArmorItem.Leggings());
	public static final Item WOODEN_ARMOR_ARMOR_BOOTS = register(new Wooden_armorArmorItem.Boots());
	public static final Item OBSIDIAN_TOOL_PICKAXE = register(new Obsidian_toolPickaxeItem());
	public static final Item OBSIDIAN_TOOL_AXE = register(new Obsidian_toolAxeItem());
	public static final Item OBSIDIAN_TOOL_SWORD = register(new Obsidian_toolSwordItem());
	public static final Item OBSIDIAN_TOOL_SHOVEL = register(new Obsidian_toolShovelItem());
	public static final Item OBSIDIAN_TOOL_HOE = register(new Obsidian_toolHoeItem());
	public static final Item ULTIMATESWORD = register(new UltimateswordItem());
	public static final Item OBSIDIAN_GOLEM = register(
			new SpawnEggItem(OrderofobsidianModEntities.OBSIDIAN_GOLEM, -1, -1, new Item.Properties().tab(null))
					.setRegistryName("obsidian_golem_spawn_egg"));
	public static final Item NETHERITEGOLEM = register(
			new SpawnEggItem(OrderofobsidianModEntities.NETHERITEGOLEM, -16777216, -13421824, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("netheritegolem_spawn_egg"));
	public static final Item OBSIDIAN_GOLEMHEAD = register(OrderofobsidianModBlocks.OBSIDIAN_GOLEMHEAD, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NETHERITE_GOLEM_HEAD = register(OrderofobsidianModBlocks.NETHERITE_GOLEM_HEAD, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item DIAMONDHAMMER = register(new DimondhammerItem());
	public static final Item IRON_HAMMER = register(new IronHammerItem());
	public static final Item GOLD_HAMMER = register(new GoldHammerItem());
	public static final Item NETHERITE_HAMMER = register(new NetheriteHammerItem());
	public static final Item STONE_HAMMER = register(new StoneHammerItem());
	public static final Item WOOD_HAMMER = register(new WoodHammerItem());
	public static final Item FORGE = register(OrderofobsidianModBlocks.FORGE, OrderofobsidianModTabs.TAB_MACHINE);
	public static final Item COPPER_GEAR = register(new CopperGearItem());
	public static final Item FORGEON = register(OrderofobsidianModBlocks.FORGEON, null);
	public static final Item BATTERIE_1 = register(OrderofobsidianModBlocks.BATTERIE_1, OrderofobsidianModTabs.TAB_MACHINE);
	public static final Item FAN = register(OrderofobsidianModBlocks.FAN, OrderofobsidianModTabs.TAB_MACHINE);
	public static final Item GOLDENCHIELD = register(new GoldenchieldItem());
	public static final Item GOLDENCHIELBLOKING = register(new GoldenchielblokingItem());
	public static final Item LEAD_DUST = register(new LeadDustItem());
	public static final Item LEAD_INGOT = register(new LeadIngotItem());
	public static final Item LEAD_PLATE = register(new LeadPlateItem());
	public static final Item WIRECOIL_COPPER = register(new WirecoilCopperItem());
	public static final Item BATTERIE_CELL = register(new BatterieCellItem());
	public static final Item IRONPLATE = register(new IronplateItem());
	public static final Item ELECTRIQUE_FURNACE = register(OrderofobsidianModBlocks.ELECTRIQUE_FURNACE, OrderofobsidianModTabs.TAB_MACHINE);
	public static final Item STEEL_DUST = register(new SteelDustItem());
	public static final Item STEEL_INGOT = register(new SteelIngotItem());
	public static final Item STEEL_PLATE = register(new SteelPlateItem());
	public static final Item COPPER_PLATE = register(new CopperPlateItem());
	public static final Item PROCESSEUR_TIER_I = register(new ProcesseurTierIItem());
	public static final Item PROCESSEUR_TIER_II = register(new ProcesseurTierIIItem());
	public static final Item ALUMINIUM_INGOT = register(new AluminiumIngotItem());
	public static final Item ALUMINIUM_PLATE = register(new AluminiumPlateItem());
	public static final Item STEEL_ARMOR_HELMET = register(new SteelArmorItem.Helmet());
	public static final Item STEEL_ARMOR_CHESTPLATE = register(new SteelArmorItem.Chestplate());
	public static final Item STEEL_ARMOR_LEGGINGS = register(new SteelArmorItem.Leggings());
	public static final Item STEEL_ARMOR_BOOTS = register(new SteelArmorItem.Boots());
	public static final Item STEEL_PICKAXE = register(new SteelPickaxeItem());
	public static final Item STEEL_AXE = register(new SteelAxeItem());
	public static final Item STEEL_SWORD = register(new SteelSwordItem());
	public static final Item STEEL_SHOVEL = register(new SteelShovelItem());
	public static final Item STEEL_HOE = register(new SteelHoeItem());
	public static final Item ALUMINIUM_ORE = register(OrderofobsidianModBlocks.ALUMINIUM_ORE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item FARADAY_ARMOR_HELMET = register(new FaradayArmorItem.Helmet());
	public static final Item FARADAY_ARMOR_CHESTPLATE = register(new FaradayArmorItem.Chestplate());
	public static final Item FARADAY_ARMOR_LEGGINGS = register(new FaradayArmorItem.Leggings());
	public static final Item FARADAY_ARMOR_BOOTS = register(new FaradayArmorItem.Boots());
	public static final Item NYLIUM_WOOD = register(OrderofobsidianModBlocks.NYLIUM_WOOD, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_LOG = register(OrderofobsidianModBlocks.NYLIUM_LOG, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_PLANKS = register(OrderofobsidianModBlocks.NYLIUM_PLANKS, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_LEAVES = register(OrderofobsidianModBlocks.NYLIUM_LEAVES, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_STAIRS = register(OrderofobsidianModBlocks.NYLIUM_STAIRS, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_SLAB = register(OrderofobsidianModBlocks.NYLIUM_SLAB, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_FENCE = register(OrderofobsidianModBlocks.NYLIUM_FENCE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_FENCE_GATE = register(OrderofobsidianModBlocks.NYLIUM_FENCE_GATE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_PRESSURE_PLATE = register(OrderofobsidianModBlocks.NYLIUM_PRESSURE_PLATE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_BUTTON = register(OrderofobsidianModBlocks.NYLIUM_BUTTON, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item GOLD_SPEAR = register(new GoldSpearItem());
	public static final Item DIAMOND_SPEAR = register(new DiamondSpearItem());
	public static final Item OBSIDIAN_SPEAR = register(new ObsidianSpearItem());
	public static final Item OXYS_SPEAR = register(new OxysSpearItem());
	public static final Item DIAMOND_BATTLE_AXE = register(new DiamondBattleAxeItem());
	public static final Item GOLD_BATTLE_AXE = register(new GoldBattleAxeItem());
	public static final Item IRON_BATTLE_AXE = register(new IronBattleAxeItem());
	public static final Item STONE_BATTLE_AXE = register(new StoneBattleAxeItem());
	public static final Item WOOD_BATTLE_AXE = register(new WoodBattleAxeItem());
	public static final Item DIAMOND_KATANA = register(new DiamondKatanaItem());
	public static final Item GOLD_KATANA = register(new GoldKatanaItem());
	public static final Item IRON_KATANA = register(new IronKatanaItem());
	public static final Item STONE_KATANA = register(new StoneKatanaItem());
	public static final Item WOOD_KATANA = register(new WoodKatanaItem());
	public static final Item IRONBARRE = register(new IronbarreItem());
	public static final Item CHIPS = register(new ChipsItem());
	public static final Item SUSHI = register(new SushiItem());
	public static final Item RICE_SEED = register(new RiceSeedItem());
	public static final Item RICE_STAGE_0 = register(OrderofobsidianModBlocks.RICE_STAGE_0, null);
	public static final Item RICE_STAGE_1 = register(OrderofobsidianModBlocks.RICE_STAGE_1, null);
	public static final Item RICE_STAGE_2 = register(OrderofobsidianModBlocks.RICE_STAGE_2, null);
	public static final Item RICE_STAGE_3 = register(OrderofobsidianModBlocks.RICE_STAGE_3, null);
	public static final Item RICE_STAGE_4 = register(OrderofobsidianModBlocks.RICE_STAGE_4, null);
	public static final Item RICE_STAGE_5 = register(OrderofobsidianModBlocks.RICE_STAGE_5, null);
	public static final Item RICE_STAGE_6 = register(OrderofobsidianModBlocks.RICE_STAGE_6, null);
	public static final Item RICE_STAGE_7 = register(OrderofobsidianModBlocks.RICE_STAGE_7, null);
	public static final Item RICE = register(new RiceItem());
	public static final Item SILVER_ORE = register(OrderofobsidianModBlocks.SILVER_ORE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item SILVER_INGOT = register(new SilverIngotItem());
	public static final Item SILVER_PLATE = register(new SilverPlateItem());
	public static final Item GRAPHITE_DUST = register(new GraphiteDustItem());
	public static final Item GRAPHITE_INGOT = register(new GraphiteIngotItem());
	public static final Item GRAPHITE_ORE = register(OrderofobsidianModBlocks.GRAPHITE_ORE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item DIAMOND_SHARD = register(new DiamondShardItem());
	public static final Item ELECTRONIQUE_CIRCUIT = register(new ElectroniqueCircuitItem());
	public static final Item TINY_RUBBER = register(new TinyRubberItem());
	public static final Item RUBBER = register(new RubberItem());
	public static final Item PLASTIQUE = register(new PlastiqueItem());
	public static final Item COOKED_RICE = register(new CookedRiceItem());
	public static final Item DIAMOND_GLASS = register(OrderofobsidianModBlocks.DIAMOND_GLASS, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item GRAPHITE_GLASS = register(OrderofobsidianModBlocks.GRAPHITE_GLASS, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item FRIED_EGG = register(new FriedEggItem());
	public static final Item FLOUR = register(new FlourItem());
	public static final Item CHICKENWING = register(new ChickenwingItem());
	public static final Item CHIKEN_WHITH_BREADCRUMBS = register(new ChikenWhithBreadcrumbsItem());
	public static final Item STICKSWORD = register(new StickswordItem());
	public static final Item X_PBERRY = register(new XPberryItem());
	public static final Item STONE_STOVE = register(new StoneStoveItem());
	public static final Item IRONSTOVE = register(new IronstoveItem());
	public static final Item GOLDSTOVE = register(new GoldstoveItem());
	public static final Item DIAMONDSTOVE = register(new DiamondstoveItem());
	public static final Item NETHERITESTOVE = register(new NetheritestoveItem());
	public static final Item OXYSSTOVE = register(new OxysstoveItem());
	public static final Item NTEHRIT_APPLE = register(new NtehritAppleItem());
	public static final Item STONE_ARMOR_ARMOR_HELMET = register(new Stone_armorArmorItem.Helmet());
	public static final Item STONE_ARMOR_ARMOR_CHESTPLATE = register(new Stone_armorArmorItem.Chestplate());
	public static final Item STONE_ARMOR_ARMOR_LEGGINGS = register(new Stone_armorArmorItem.Leggings());
	public static final Item STONE_ARMOR_ARMOR_BOOTS = register(new Stone_armorArmorItem.Boots());
	public static final Item BAUHERITE_PICKAXE = register(new BauheritePickaxeItem());
	public static final Item BAUHERITE_AXE = register(new BauheriteAxeItem());
	public static final Item BAUHERITE_SWORD = register(new BauheriteSwordItem());
	public static final Item BAUHERITE_SHOVEL = register(new BauheriteShovelItem());
	public static final Item BAUHERITE_ARMOR_HELMET = register(new BauheriteArmorItem.Helmet());
	public static final Item BAUHERITE_ARMOR_CHESTPLATE = register(new BauheriteArmorItem.Chestplate());
	public static final Item BAUHERITE_ARMOR_LEGGINGS = register(new BauheriteArmorItem.Leggings());
	public static final Item BAUHERITE_ARMOR_BOOTS = register(new BauheriteArmorItem.Boots());
	public static final Item BAUHERITE_MIXED_COAL = register(new BauheriteMixedCoalItem());
	public static final Item AVENRONITE_PICKAXE = register(new AvenronitePickaxeItem());
	public static final Item AVENRONITE_AXE = register(new AvenroniteAxeItem());
	public static final Item AVENRONITE_SWORD = register(new AvenroniteSwordItem());
	public static final Item AVENRONITE_SHOVEL = register(new AvenroniteShovelItem());
	public static final Item AVENRONITE_ARMOR_HELMET = register(new AvenroniteArmorItem.Helmet());
	public static final Item AVENRONITE_ARMOR_CHESTPLATE = register(new AvenroniteArmorItem.Chestplate());
	public static final Item AVENRONITE_ARMOR_LEGGINGS = register(new AvenroniteArmorItem.Leggings());
	public static final Item AVENRONITE_ARMOR_BOOTS = register(new AvenroniteArmorItem.Boots());
	public static final Item AVENRONITE_MIXED_COAL = register(new AvenroniteMixedCoalItem());
	public static final Item AIKIGITE_INGOT = register(new AikigiteIngotItem());
	public static final Item AIKIGITE_ORE = register(OrderofobsidianModBlocks.AIKIGITE_ORE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item AIKIGITE_BLOCK = register(OrderofobsidianModBlocks.AIKIGITE_BLOCK, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item AIKIGITE_ARMOR_HELMET = register(new AikigiteArmorItem.Helmet());
	public static final Item AIKIGITE_ARMOR_CHESTPLATE = register(new AikigiteArmorItem.Chestplate());
	public static final Item AIKIGITE_ARMOR_LEGGINGS = register(new AikigiteArmorItem.Leggings());
	public static final Item AIKIGITE_ARMOR_BOOTS = register(new AikigiteArmorItem.Boots());
	public static final Item AIKIGITE_PICKAXE = register(new AikigitePickaxeItem());
	public static final Item AIKIGITE_AXE = register(new AikigiteAxeItem());
	public static final Item AIKIGITE_SWORD = register(new AikigiteSwordItem());
	public static final Item AIKIGITE_SHOVEL = register(new AikigiteShovelItem());
	public static final Item AIKIGITE_MIXED_COAL = register(new AikigiteMixedCoalItem());
	public static final Item CAVEBLOCK = register(OrderofobsidianModBlocks.CAVEBLOCK, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item COMPRESED_XP_BERRY = register(new CompresedXpBerryItem());
	public static final Item COMPACTED_X_PBERRY = register(new CompactedXPberryItem());
	public static final Item STEEL_SNAFFLE = register(new SteelSnaffleItem());
	public static final Item XPBUSH_1 = register(OrderofobsidianModBlocks.XPBUSH_1, null);
	public static final Item XP_BUSH_2 = register(OrderofobsidianModBlocks.XP_BUSH_2, null);
	public static final Item IRONBOOKSHELF = register(OrderofobsidianModBlocks.IRONBOOKSHELF, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item COPPERBOOKSHELF = register(OrderofobsidianModBlocks.COPPERBOOKSHELF, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item GOLDBOOKSHELF = register(OrderofobsidianModBlocks.GOLDBOOKSHELF, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item OBSIDIANBOOKSHELF = register(OrderofobsidianModBlocks.OBSIDIANBOOKSHELF, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item DIAMONDBOOKSHELF = register(OrderofobsidianModBlocks.DIAMONDBOOKSHELF, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item EMERALDBOOKSHELF = register(OrderofobsidianModBlocks.EMERALDBOOKSHELF, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item OXYS_HAMMER = register(new OxysHammerItem());
	public static final Item OBSIDIANHAMMER = register(new ObsidianhammerItem());
	public static final Item AIKIGITEHAMMER = register(new AikigitehammerItem());
	public static final Item BAUHERITEHAMMER = register(new BauheritehammerItem());
	public static final Item AVENRONITEHAMMER = register(new AvenronitehammerItem());
	public static final Item BAUHERITE_INGOT = register(new BauheriteIngotItem());
	public static final Item BAUHERITE_ORE = register(OrderofobsidianModBlocks.BAUHERITE_ORE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BAUHERITE_BLOCK = register(OrderofobsidianModBlocks.BAUHERITE_BLOCK, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item AVENRONITE_INGOT = register(new AvenroniteIngotItem());
	public static final Item AVENRONITE_ORE = register(OrderofobsidianModBlocks.AVENRONITE_ORE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item AVENRONITE_BLOCK = register(OrderofobsidianModBlocks.AVENRONITE_BLOCK, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item IRON_SPEAR = register(new IronSpearItem());
	public static final Item DYNAMITE = register(new DynamiteItem());
	public static final Item BIG_DYNAMITE = register(new BigDynamiteItem());
	public static final Item DYNAMITE_AIKIGITE = register(new DynamiteAikigiteItem());
	public static final Item BIG_DYNAMITE_AIKIGITE = register(new BigDynamiteAikigiteItem());
	public static final Item DYNAMITE_BAUHERITE = register(new DynamiteBauheriteItem());
	public static final Item BIGDYNAMITE_BAUHERITE = register(new BigdynamiteBauheriteItem());
	public static final Item DYNAMITE_AVENRONITE = register(new DynamiteAvenroniteItem());
	public static final Item BIGDYNAMITE_AVENRONITE = register(new BigdynamiteAvenroniteItem());
	public static final Item DYNAMITE_OXYS = register(new DynamiteOxysItem());
	public static final Item BIGDYNAMITE_OXYS = register(new BigdynamiteOxysItem());
	public static final Item X_PBUSH_ORE = register(OrderofobsidianModBlocks.X_PBUSH_ORE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item LAZARUS_TNT = register(OrderofobsidianModBlocks.LAZARUS_TNT, CreativeModeTab.TAB_REDSTONE);
	public static final Item OCULUS_TNT = register(OrderofobsidianModBlocks.OCULUS_TNT, CreativeModeTab.TAB_REDSTONE);
	public static final Item INFAMY_TNT = register(OrderofobsidianModBlocks.INFAMY_TNT, CreativeModeTab.TAB_REDSTONE);
	public static final Item EPILOGUE_TNT = register(OrderofobsidianModBlocks.EPILOGUE_TNT, CreativeModeTab.TAB_REDSTONE);
	public static final Item URUK_INGOT = register(new UrukIngotItem());
	public static final Item URUCK_METAL_POWDER = register(new UruckMetalPowderItem());
	public static final Item MITRIL_INGOT = register(new MitrilIngotItem());
	public static final Item MITRIL_ORE = register(OrderofobsidianModBlocks.MITRIL_ORE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item MITRIL_BLOCK = register(OrderofobsidianModBlocks.MITRIL_BLOCK, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item MITRIL_ARMOR_HELMET = register(new MitrilArmorItem.Helmet());
	public static final Item MITRIL_ARMOR_CHESTPLATE = register(new MitrilArmorItem.Chestplate());
	public static final Item MITRIL_ARMOR_LEGGINGS = register(new MitrilArmorItem.Leggings());
	public static final Item MITRIL_ARMOR_BOOTS = register(new MitrilArmorItem.Boots());
	public static final Item THERMALGENERATOR = register(OrderofobsidianModBlocks.THERMALGENERATOR, OrderofobsidianModTabs.TAB_MACHINE);
	public static final Item ENERGY_SETTING_DEVICE = register(new EnergySettingDeviceItem());
	public static final Item ENERGY_SETTING_DEVICE_0 = register(new EnergySettingDevice0Item());
	public static final Item SOLAR_PANEL = register(OrderofobsidianModBlocks.SOLAR_PANEL, OrderofobsidianModTabs.TAB_MACHINE);
	public static final Item SOLAR_PANEL_LOW = register(OrderofobsidianModBlocks.SOLAR_PANEL_LOW, null);
	public static final Item SOLAR_PANEL_MEDIUM = register(OrderofobsidianModBlocks.SOLAR_PANEL_MEDIUM, null);
	public static final Item SOLAR_PANEL_HIGH = register(OrderofobsidianModBlocks.SOLAR_PANEL_HIGH, null);
	public static final Item SOLAR_PANEL_NIGHT = register(OrderofobsidianModBlocks.SOLAR_PANEL_NIGHT, null);
	public static final Item ALLUMINIUM_SNAFFLE = register(new AlluminiumSnaffleItem());
	public static final Item DIAMOND_SNAFFLE = register(new DiamondSnaffleItem());
	public static final Item OBSIDIAN_SNAFFLE = register(new ObsidianSnaffleItem());
	public static final Item BAUHERITE_SNAFFLE = register(new BauheriteSnaffleItem());
	public static final Item URUK_BATTLEAXE = register(new UrukBattleaxeItem());
	public static final Item ANGMAR_ARMOR_HELMET = register(new AngmarArmorItem.Helmet());
	public static final Item ANGMAR_ARMOR_CHESTPLATE = register(new AngmarArmorItem.Chestplate());
	public static final Item ANGMAR_ARMOR_LEGGINGS = register(new AngmarArmorItem.Leggings());
	public static final Item ANGMAR_ARMOR_BOOTS = register(new AngmarArmorItem.Boots());
	public static final Item URUK_PICKAXE = register(new UrukPickaxeItem());
	public static final Item URUK_AXE = register(new UrukAxeItem());
	public static final Item URUK_SWORD = register(new UrukSwordItem());
	public static final Item URUK_SHOVEL = register(new UrukShovelItem());
	public static final Item URUK_HOE = register(new UrukHoeItem());
	public static final Item ANGMAR_PICKAXE = register(new AngmarPickaxeItem());
	public static final Item ANGMAR_AXE = register(new AngmarAxeItem());
	public static final Item ANGMAR_SWORD = register(new AngmarSwordItem());
	public static final Item ANGMAR_SHOVEL = register(new AngmarShovelItem());
	public static final Item ANGMAR_HOE = register(new AngmarHoeItem());
	public static final Item BLACK_URUK_DAGGER = register(new BlackUrukDaggerItem());
	public static final Item URUCK_DAGGER = register(new UruckDaggerItem());
	public static final Item URUCK_HAMMER = register(new UruckHammerItem());
	public static final Item URUK_ARMOR_HELMET = register(new UrukArmorItem.Helmet());
	public static final Item URUK_ARMOR_CHESTPLATE = register(new UrukArmorItem.Chestplate());
	public static final Item URUK_ARMOR_LEGGINGS = register(new UrukArmorItem.Leggings());
	public static final Item URUK_ARMOR_BOOTS = register(new UrukArmorItem.Boots());
	public static final Item BLAK_URUK_HELMET = register(new BlakUrukItem.Helmet());
	public static final Item BLAK_URUK_CHESTPLATE = register(new BlakUrukItem.Chestplate());
	public static final Item BLAK_URUK_LEGGINGS = register(new BlakUrukItem.Leggings());
	public static final Item BLAK_URUK_BOOTS = register(new BlakUrukItem.Boots());
	public static final Item ANGMA_HAMMER = register(new AngmaHammerItem());
	public static final Item ANGMAR_BATTLE_AXE = register(new AngmarBattleAxeItem());
	public static final Item RANGER_ARMOR_HELMET = register(new RangerArmorItem.Helmet());
	public static final Item RANGER_ARMOR_CHESTPLATE = register(new RangerArmorItem.Chestplate());
	public static final Item RANGER_ARMOR_LEGGINGS = register(new RangerArmorItem.Leggings());
	public static final Item RANGER_ARMOR_BOOTS = register(new RangerArmorItem.Boots());
	public static final Item MELSTONE = register(new MelstoneItem());
	public static final Item HUEERSITE = register(new HueersiteItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
