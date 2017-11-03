package com.kolido.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwarvenCartOperator extends DwarvenMineWorker {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(DwarvenCartOperator.class);
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Dwarf cart operator";
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		LOGGER.info("{} moves gold chunks out of the mine.", name());
	}

}
