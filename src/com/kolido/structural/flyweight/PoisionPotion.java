package com.kolido.structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PoisionPotion implements Potion {
	private static final Logger LOGGER = LoggerFactory.getLogger(PoisionPotion.class);
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		LOGGER.info("Urg! This is poisonous. (Potion = {})", System.identityHashCode(this));
	}

}
