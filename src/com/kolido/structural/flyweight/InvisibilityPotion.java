package com.kolido.structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvisibilityPotion implements Potion {
	private static final Logger LOGGER = LoggerFactory.getLogger(InvisibilityPotion.class);

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		LOGGER.info("You become invisible. (Potion = {})", System.identityHashCode(this));

	}

}
