
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class DiamondstoveItem extends SwordItem {
	public DiamondstoveItem() {
		super(new Tier() {
			public int getUses() {
				return 85;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 0.2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				3, -2.5f,

				new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

		setRegistryName("diamondstove");
	}

}