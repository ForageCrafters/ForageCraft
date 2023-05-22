
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foragecraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.foragecraft.client.gui.WickerBasketGUIScreen;
import net.mcreator.foragecraft.client.gui.ForagersManualPage2Screen;
import net.mcreator.foragecraft.client.gui.ForagersManualPage1Screen;
import net.mcreator.foragecraft.client.gui.DehydratorUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForagecraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ForagecraftModMenus.WICKER_BASKET_GUI.get(), WickerBasketGUIScreen::new);
			MenuScreens.register(ForagecraftModMenus.DEHYDRATOR_UI.get(), DehydratorUIScreen::new);
			MenuScreens.register(ForagecraftModMenus.FORAGERS_MANUAL_PAGE_1.get(), ForagersManualPage1Screen::new);
			MenuScreens.register(ForagecraftModMenus.FORAGERS_MANUAL_PAGE_2.get(), ForagersManualPage2Screen::new);
		});
	}
}
