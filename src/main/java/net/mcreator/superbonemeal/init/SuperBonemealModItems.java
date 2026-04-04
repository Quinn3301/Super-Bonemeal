/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superbonemeal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.superbonemeal.item.SuperBonemealItem;
import net.mcreator.superbonemeal.SuperBonemealMod;

public class SuperBonemealModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SuperBonemealMod.MODID);
	public static final RegistryObject<Item> SUPER_BONEMEAL;
	static {
		SUPER_BONEMEAL = REGISTRY.register("super_bonemeal", SuperBonemealItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}