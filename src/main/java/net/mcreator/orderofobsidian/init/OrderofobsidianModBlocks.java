
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.orderofobsidian.block.Xpbush1Block;
import net.mcreator.orderofobsidian.block.XpBush2Block;
import net.mcreator.orderofobsidian.block.XPbushOreBlock;
import net.mcreator.orderofobsidian.block.ThermalgeneratorBlock;
import net.mcreator.orderofobsidian.block.SolarPanelNightBlock;
import net.mcreator.orderofobsidian.block.SolarPanelMediumBlock;
import net.mcreator.orderofobsidian.block.SolarPanelLowBlock;
import net.mcreator.orderofobsidian.block.SolarPanelHighBlock;
import net.mcreator.orderofobsidian.block.SolarPanelBlock;
import net.mcreator.orderofobsidian.block.SilverOreBlock;
import net.mcreator.orderofobsidian.block.RiceStage7Block;
import net.mcreator.orderofobsidian.block.RiceStage6Block;
import net.mcreator.orderofobsidian.block.RiceStage5Block;
import net.mcreator.orderofobsidian.block.RiceStage4Block;
import net.mcreator.orderofobsidian.block.RiceStage3Block;
import net.mcreator.orderofobsidian.block.RiceStage2Block;
import net.mcreator.orderofobsidian.block.RiceStage1Block;
import net.mcreator.orderofobsidian.block.RiceStage0Block;
import net.mcreator.orderofobsidian.block.OxysOreBlock;
import net.mcreator.orderofobsidian.block.OxysBlockBlock;
import net.mcreator.orderofobsidian.block.OculusTNTBlock;
import net.mcreator.orderofobsidian.block.ObsidianbookshelfBlock;
import net.mcreator.orderofobsidian.block.ObsidianGolemheadBlock;
import net.mcreator.orderofobsidian.block.NyliumWoodBlock;
import net.mcreator.orderofobsidian.block.NyliumStairsBlock;
import net.mcreator.orderofobsidian.block.NyliumSlabBlock;
import net.mcreator.orderofobsidian.block.NyliumPressurePlateBlock;
import net.mcreator.orderofobsidian.block.NyliumPlanksBlock;
import net.mcreator.orderofobsidian.block.NyliumLogBlock;
import net.mcreator.orderofobsidian.block.NyliumLeavesBlock;
import net.mcreator.orderofobsidian.block.NyliumFenceGateBlock;
import net.mcreator.orderofobsidian.block.NyliumFenceBlock;
import net.mcreator.orderofobsidian.block.NyliumButtonBlock;
import net.mcreator.orderofobsidian.block.NetheriteGolemHeadBlock;
import net.mcreator.orderofobsidian.block.MitrilOreBlock;
import net.mcreator.orderofobsidian.block.MitrilBlockBlock;
import net.mcreator.orderofobsidian.block.MaterialbreakerBlock;
import net.mcreator.orderofobsidian.block.LazarusTNTBlock;
import net.mcreator.orderofobsidian.block.IronbookshelfBlock;
import net.mcreator.orderofobsidian.block.InfamyTNTBlock;
import net.mcreator.orderofobsidian.block.GraphiteOreBlock;
import net.mcreator.orderofobsidian.block.GraphiteGlassBlock;
import net.mcreator.orderofobsidian.block.GoldbookshelfBlock;
import net.mcreator.orderofobsidian.block.ForgeonBlock;
import net.mcreator.orderofobsidian.block.ForgeBlock;
import net.mcreator.orderofobsidian.block.FanBlock;
import net.mcreator.orderofobsidian.block.EpilogueTNTBlock;
import net.mcreator.orderofobsidian.block.EmeraldbookshelfBlock;
import net.mcreator.orderofobsidian.block.ElectriqueFurnaceBlock;
import net.mcreator.orderofobsidian.block.DiamondbookshelfBlock;
import net.mcreator.orderofobsidian.block.DiamondGlassBlock;
import net.mcreator.orderofobsidian.block.CopperbookshelfBlock;
import net.mcreator.orderofobsidian.block.CaveblockBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeWoodBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeStairsBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeSlabBlock;
import net.mcreator.orderofobsidian.block.BurnedtreePressurePlateBlock;
import net.mcreator.orderofobsidian.block.BurnedtreePlanksBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeLogBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeLeavesBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeFenceGateBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeFenceBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeButtonBlock;
import net.mcreator.orderofobsidian.block.BauheriteOreBlock;
import net.mcreator.orderofobsidian.block.BauheriteBlockBlock;
import net.mcreator.orderofobsidian.block.Batterie1Block;
import net.mcreator.orderofobsidian.block.AvenroniteOreBlock;
import net.mcreator.orderofobsidian.block.AvenroniteBlockBlock;
import net.mcreator.orderofobsidian.block.AluminiumOreBlock;
import net.mcreator.orderofobsidian.block.AikigiteOreBlock;
import net.mcreator.orderofobsidian.block.AikigiteBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OrderofobsidianModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block OXYS_ORE = register(new OxysOreBlock());
	public static final Block OXYS_BLOCK = register(new OxysBlockBlock());
	public static final Block BURNEDTREE_WOOD = register(new BurnedtreeWoodBlock());
	public static final Block BURNEDTREE_LOG = register(new BurnedtreeLogBlock());
	public static final Block BURNEDTREE_PLANKS = register(new BurnedtreePlanksBlock());
	public static final Block BURNEDTREE_LEAVES = register(new BurnedtreeLeavesBlock());
	public static final Block BURNEDTREE_STAIRS = register(new BurnedtreeStairsBlock());
	public static final Block BURNEDTREE_SLAB = register(new BurnedtreeSlabBlock());
	public static final Block BURNEDTREE_FENCE = register(new BurnedtreeFenceBlock());
	public static final Block BURNEDTREE_FENCE_GATE = register(new BurnedtreeFenceGateBlock());
	public static final Block BURNEDTREE_PRESSURE_PLATE = register(new BurnedtreePressurePlateBlock());
	public static final Block BURNEDTREE_BUTTON = register(new BurnedtreeButtonBlock());
	public static final Block OBSIDIAN_GOLEMHEAD = register(new ObsidianGolemheadBlock());
	public static final Block NETHERITE_GOLEM_HEAD = register(new NetheriteGolemHeadBlock());
	public static final Block FORGE = register(new ForgeBlock());
	public static final Block FORGEON = register(new ForgeonBlock());
	public static final Block BATTERIE_1 = register(new Batterie1Block());
	public static final Block FAN = register(new FanBlock());
	public static final Block ELECTRIQUE_FURNACE = register(new ElectriqueFurnaceBlock());
	public static final Block ALUMINIUM_ORE = register(new AluminiumOreBlock());
	public static final Block NYLIUM_WOOD = register(new NyliumWoodBlock());
	public static final Block NYLIUM_LOG = register(new NyliumLogBlock());
	public static final Block NYLIUM_PLANKS = register(new NyliumPlanksBlock());
	public static final Block NYLIUM_LEAVES = register(new NyliumLeavesBlock());
	public static final Block NYLIUM_STAIRS = register(new NyliumStairsBlock());
	public static final Block NYLIUM_SLAB = register(new NyliumSlabBlock());
	public static final Block NYLIUM_FENCE = register(new NyliumFenceBlock());
	public static final Block NYLIUM_FENCE_GATE = register(new NyliumFenceGateBlock());
	public static final Block NYLIUM_PRESSURE_PLATE = register(new NyliumPressurePlateBlock());
	public static final Block NYLIUM_BUTTON = register(new NyliumButtonBlock());
	public static final Block RICE_STAGE_0 = register(new RiceStage0Block());
	public static final Block RICE_STAGE_1 = register(new RiceStage1Block());
	public static final Block RICE_STAGE_2 = register(new RiceStage2Block());
	public static final Block RICE_STAGE_3 = register(new RiceStage3Block());
	public static final Block RICE_STAGE_4 = register(new RiceStage4Block());
	public static final Block RICE_STAGE_5 = register(new RiceStage5Block());
	public static final Block RICE_STAGE_6 = register(new RiceStage6Block());
	public static final Block RICE_STAGE_7 = register(new RiceStage7Block());
	public static final Block SILVER_ORE = register(new SilverOreBlock());
	public static final Block GRAPHITE_ORE = register(new GraphiteOreBlock());
	public static final Block DIAMOND_GLASS = register(new DiamondGlassBlock());
	public static final Block GRAPHITE_GLASS = register(new GraphiteGlassBlock());
	public static final Block AIKIGITE_ORE = register(new AikigiteOreBlock());
	public static final Block AIKIGITE_BLOCK = register(new AikigiteBlockBlock());
	public static final Block CAVEBLOCK = register(new CaveblockBlock());
	public static final Block XPBUSH_1 = register(new Xpbush1Block());
	public static final Block XP_BUSH_2 = register(new XpBush2Block());
	public static final Block IRONBOOKSHELF = register(new IronbookshelfBlock());
	public static final Block COPPERBOOKSHELF = register(new CopperbookshelfBlock());
	public static final Block GOLDBOOKSHELF = register(new GoldbookshelfBlock());
	public static final Block OBSIDIANBOOKSHELF = register(new ObsidianbookshelfBlock());
	public static final Block DIAMONDBOOKSHELF = register(new DiamondbookshelfBlock());
	public static final Block EMERALDBOOKSHELF = register(new EmeraldbookshelfBlock());
	public static final Block BAUHERITE_ORE = register(new BauheriteOreBlock());
	public static final Block BAUHERITE_BLOCK = register(new BauheriteBlockBlock());
	public static final Block AVENRONITE_ORE = register(new AvenroniteOreBlock());
	public static final Block AVENRONITE_BLOCK = register(new AvenroniteBlockBlock());
	public static final Block X_PBUSH_ORE = register(new XPbushOreBlock());
	public static final Block LAZARUS_TNT = register(new LazarusTNTBlock());
	public static final Block OCULUS_TNT = register(new OculusTNTBlock());
	public static final Block INFAMY_TNT = register(new InfamyTNTBlock());
	public static final Block EPILOGUE_TNT = register(new EpilogueTNTBlock());
	public static final Block MITRIL_ORE = register(new MitrilOreBlock());
	public static final Block MITRIL_BLOCK = register(new MitrilBlockBlock());
	public static final Block THERMALGENERATOR = register(new ThermalgeneratorBlock());
	public static final Block SOLAR_PANEL = register(new SolarPanelBlock());
	public static final Block SOLAR_PANEL_LOW = register(new SolarPanelLowBlock());
	public static final Block SOLAR_PANEL_MEDIUM = register(new SolarPanelMediumBlock());
	public static final Block SOLAR_PANEL_HIGH = register(new SolarPanelHighBlock());
	public static final Block SOLAR_PANEL_NIGHT = register(new SolarPanelNightBlock());
	public static final Block MATERIALBREAKER = register(new MaterialbreakerBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			NyliumLeavesBlock.registerRenderLayer();
			RiceStage0Block.registerRenderLayer();
			RiceStage1Block.registerRenderLayer();
			RiceStage2Block.registerRenderLayer();
			RiceStage3Block.registerRenderLayer();
			RiceStage4Block.registerRenderLayer();
			RiceStage5Block.registerRenderLayer();
			RiceStage6Block.registerRenderLayer();
			RiceStage7Block.registerRenderLayer();
			DiamondGlassBlock.registerRenderLayer();
			GraphiteGlassBlock.registerRenderLayer();
			CaveblockBlock.registerRenderLayer();
			Xpbush1Block.registerRenderLayer();
			XpBush2Block.registerRenderLayer();
			XPbushOreBlock.registerRenderLayer();
		}
	}
}
