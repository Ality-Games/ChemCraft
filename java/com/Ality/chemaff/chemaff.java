package com.Ality.chemaff;

import com.Ality.chemaff.configuration.ConfigurationHandler;
import com.Ality.chemaff.proxy.IProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid="Chemaff", name="Chemical Affinity", version="1.0.1")

public class chemaff {
	
	@SidedProxy(clientSide = "com.Ality.chemaff.proxy.ClientProxy", serverSide = "com.Ality.chemaff.proxy.ServerProxy")
	public static IProxy proxy;
	

	@Mod.Instance("chemaff")
	public static chemaff instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		
		
		
	}
	
	@Mod.EventHandler
		public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
