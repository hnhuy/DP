package com.kolido.structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StrengthPotion implements Potion {
	private static final Logger LOGGER = LoggerFactory.getLogger(StrengthPotion.class);
	
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		LOGGER.info("You feel string. (Potion = {})", System.identityHashCode(this));
	}

}
