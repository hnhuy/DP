package com.kolido.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClubbedTroll implements Troll {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ClubbedTroll.class);
	
	private Troll decorated;
	
	
	
	public ClubbedTroll(Troll decorated) {
		super();
		this.decorated = decorated;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		decorated.attack();
		LOGGER.info("The troll swings at you with a club!");
	}

	@Override
	public int getAttackPower() {
		// TODO Auto-generated method stub
		return decorated.getAttackPower() + 10;
	}

	@Override
	public void fleeBattle() {
		// TODO Auto-generated method stub
		decorated.fleeBattle();
	}

}
