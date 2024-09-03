package StructuralDesignPattern.FlyWeightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

	// caching players 
	private static Map<String,Player> cachedPlayers = new HashMap<String, Player>();
	
	public static Player getPlayer(String type) {
		type = type.toLowerCase();
		Player p = null;
		if(cachedPlayers.containsKey(type)) {
			p =  cachedPlayers.get(type);
		}
		else {
			
			
			
			switch(type) {
			case "terrorist":
				p = new Terrorist();
				break;
			case "hero":
				p = new Hero();
				break;
			default :
				System.out.println("Only Hero and Terrorist are allowed .");
			}
			
			// cache the object
			cachedPlayers.put(type, p);
			
		}
		return p;
	}
	
}
