package com.kolido.structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HealingPotion implements Potion {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HealingPotion.class);
	
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		LOGGER.info("You feel healed. (Potion = {})", System.identityHashCode(this));
	}
}
