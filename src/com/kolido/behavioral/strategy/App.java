package com.kolido.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		LOGGER.info("Green dragon spotted ahead!");
		DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
		dragonSlayer.goBattle();
		
		LOGGER.info("Red dragon emerges.");
		dragonSlayer.changeStrategy(new ProjectileStrategy());
		dragonSlayer.goBattle();
		
		LOGGER.info("Black dragon lands before you.");
		dragonSlayer.changeStrategy(new SpellStrategy());
		dragonSlayer.goBattle();
		
	}

}
