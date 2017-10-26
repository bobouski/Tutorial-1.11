package net.bobouski.tutorial.init;

import net.bobouski.tutorial.Tutorial;
import net.bobouski.tutorial.item.ItemTutorial;
import net.bobouski.tutorial.lib.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	public static ItemTutorial tutorialItem;
	
	public static void init() {
		
		tutorialItem = new ItemTutorial();
		tutorialItem.setRegistryName(new ResourceLocation(Tutorial.MOD_ID, Names.TUTORIAL_ITEM));
		GameRegistry.register(tutorialItem);
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		
		ModelResourceLocation model = new ModelResourceLocation(Tutorial.RESOURCE_PREFIX + Names.TUTORIAL_ITEM, "inventory");
		ModelLoader.registerItemVariants(tutorialItem, model);
		mesher.register(tutorialItem, 0, model);
	}

}
