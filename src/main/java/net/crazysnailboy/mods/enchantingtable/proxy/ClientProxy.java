package net.crazysnailboy.mods.enchantingtable.proxy;

import net.crazysnailboy.mods.enchantingtable.tileentity.TileEntityEnchantmentTable;
import net.minecraft.client.renderer.tileentity.TileEntityEnchantmentTableRenderer;
import net.minecraftforge.fml.client.registry.ClientRegistry;


public class ClientProxy extends CommonProxy
{

	@Override
	public void preInit()
	{
		super.preInit();
	}

	@Override
	public void init()
	{
		super.init();
		registerTileEntitySpecialRenderers();
	}

	@Override
	public void postInit()
	{
		super.postInit();
	}


	private void registerTileEntitySpecialRenderers()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEnchantmentTable.class, new TileEntityEnchantmentTableRenderer());
	}

}