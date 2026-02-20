/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superbonemeal.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.superbonemeal.item.SuperBonemealItem;
import net.mcreator.superbonemeal.SuperBonemealMod;

public class SuperBonemealModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SuperBonemealMod.MODID);
	public static final DeferredItem<Item> SUPER_BONEMEAL;
	static {
		SUPER_BONEMEAL = REGISTRY.register("super_bonemeal", SuperBonemealItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}