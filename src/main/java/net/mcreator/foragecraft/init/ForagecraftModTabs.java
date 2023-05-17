
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foragecraft.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ForagecraftModTabs {
	public static CreativeModeTab TAB_FORAGE_CRAFT_BLOCKS;
	public static CreativeModeTab TAB_FORAGE_CRAFT_PLANTS;
	public static CreativeModeTab TAB_FORAGE_CRAFT_TOOLS;
	public static CreativeModeTab TAB_FORAGE_CRAFT_ANIMALS;
	public static CreativeModeTab TAB_FORAGE_CRAFT_TREES;

	public static void load() {
		TAB_FORAGE_CRAFT_BLOCKS = new CreativeModeTab("tabforage_craft_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForagecraftModItems.BASKET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FORAGE_CRAFT_PLANTS = new CreativeModeTab("tabforage_craft_plants") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForagecraftModBlocks.NETTLE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FORAGE_CRAFT_TOOLS = new CreativeModeTab("tabforage_craft_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForagecraftModItems.FORAGERS_INGOT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FORAGE_CRAFT_ANIMALS = new CreativeModeTab("tabforage_craft_animals") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.CREEPER_SPAWN_EGG);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FORAGE_CRAFT_TREES = new CreativeModeTab("tabforage_craft_trees") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForagecraftModBlocks.COMMON_BEECH_SAPLING.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
