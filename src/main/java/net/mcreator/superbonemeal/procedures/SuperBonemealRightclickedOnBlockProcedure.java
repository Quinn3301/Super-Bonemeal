package net.mcreator.superbonemeal.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class SuperBonemealRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 200, 6, 1.6, 6, 1);
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_SAPLING || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_SAPLING
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_SAPLING) {
			for (int index0 = 0; index0 < 20; index0++) {
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_SAPLING || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_SAPLING
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_SAPLING) {
			for (int index1 = 0; index1 < 20; index1++) {
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_PROPAGULE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_SAPLING
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SUGAR_CANE) {
			for (int index2 = 0; index2 < 20; index2++) {
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BAMBOO) {
			for (int index3 = 0; index3 < 20; index3++) {
				if (world instanceof Level _level) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
			}
		}
		sx = x - 25;
		sy = y - 1;
		sz = z - 25;
		for (int index4 = 0; index4 < 50; index4++) {
			for (int index5 = 0; index5 < 8; index5++) {
				for (int index6 = 0; index6 < 50; index6++) {
					if (!((world.getBlockState(BlockPos.containing(sx, sy, sz))).getBlock() == Blocks.SHORT_GRASS) && Math.random() < 0.1) {
						if (world instanceof Level _level) {
							BlockPos _bp = BlockPos.containing(sx, sy, sz);
							if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
								if (!_level.isClientSide())
									_level.levelEvent(2005, _bp, 0);
							}
						}
					}
					sz = sz + 1;
				}
				sz = z - 25;
				sy = sy + 1;
			}
			sy = y - 1;
			sx = sx + 1;
		}
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			itemstack.shrink(1);
		}
	}
}