
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foragecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.foragecraft.world.inventory.WickerBasketGUIMenu;
import net.mcreator.foragecraft.world.inventory.ForagersManualPage2Menu;
import net.mcreator.foragecraft.world.inventory.ForagersManualPage1Menu;
import net.mcreator.foragecraft.world.inventory.DehydratorUIMenu;
import net.mcreator.foragecraft.ForagecraftMod;

public class ForagecraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ForagecraftMod.MODID);
	public static final RegistryObject<MenuType<WickerBasketGUIMenu>> WICKER_BASKET_GUI = REGISTRY.register("wicker_basket_gui", () -> IForgeMenuType.create(WickerBasketGUIMenu::new));
	public static final RegistryObject<MenuType<DehydratorUIMenu>> DEHYDRATOR_UI = REGISTRY.register("dehydrator_ui", () -> IForgeMenuType.create(DehydratorUIMenu::new));
	public static final RegistryObject<MenuType<ForagersManualPage1Menu>> FORAGERS_MANUAL_PAGE_1 = REGISTRY.register("foragers_manual_page_1", () -> IForgeMenuType.create(ForagersManualPage1Menu::new));
	public static final RegistryObject<MenuType<ForagersManualPage2Menu>> FORAGERS_MANUAL_PAGE_2 = REGISTRY.register("foragers_manual_page_2", () -> IForgeMenuType.create(ForagersManualPage2Menu::new));
}
