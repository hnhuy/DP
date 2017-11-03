package com.kolido.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleTroll implements Troll {

	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleTroll.class);
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		LOGGER.info("The troll tries to grab you!");
	}

	@Override
	public int getAttackPower() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void fleeBattle() {
		// TODO Auto-generated method stub
		LOGGER.info("The troll shrieks in horror and runs away!");
	}

}
