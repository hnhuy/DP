package com.kolido.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwarvenGoldDigger extends DwarvenMineWorker {
	private static final Logger LOGGER = LoggerFactory.getLogger(DwarvenGoldDigger.class);
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Dwarf gold digger";
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		LOGGER.info("{} digs for gold.", name());
	}

}
