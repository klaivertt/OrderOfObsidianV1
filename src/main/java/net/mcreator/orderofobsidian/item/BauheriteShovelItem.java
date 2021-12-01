
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;

public class BauheriteShovelItem extends ShovelItem {
	public BauheriteShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrderofobsidianModItems.BAUHERITE_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("bauherite_shovel");
	}
}
