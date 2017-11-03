package com.kolido.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeleeStrategy implements DragonSlayingStrategy{
	private static final Logger LOGGER = LoggerFactory.getLogger(MeleeStrategy.class);
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		LOGGER.info("With your Excalibur you sever the dragon's head!");
	}

}
