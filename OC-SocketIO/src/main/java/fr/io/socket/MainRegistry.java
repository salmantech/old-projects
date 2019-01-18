package fr.io.socket;

import net.minecraft.init.Blocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import fr.io.block.SocketIOAdapter;
import fr.io.lib.RefStrings;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)

public class MainRegistry {

	@SidedProxy(clientSide = RefStrings.CLIENTSIDE , serverSide = RefStrings.SERVERSIDE)
	
	public static ServerProxy proxy;
    
    @EventHandler
    
    public static void PreLoad(FMLInitializationEvent PreEvent){
    	SocketIOAdapter.mainRegistry();
    	proxy.registerRenderInfo();
    	
    }
    
    public static void load(FMLInitializationEvent Event){
    	
    	
    }

    public static void PostLoad(FMLInitializationEvent PostEvent){
	
	
    }
    
    public void init(FMLInitializationEvent event)
    {
		// some example code
    }
	
}
