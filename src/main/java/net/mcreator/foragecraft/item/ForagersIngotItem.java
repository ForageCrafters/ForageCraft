
package net.mcreator.foragecraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.foragecraft.init.ForagecraftModTabs;

public class ForagersIngotItem extends Item {
	public ForagersIngotItem() {
		super(new Item.Properties().tab(ForagecraftModTabs.TAB_FORAGE_CRAFT_TOOLS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
