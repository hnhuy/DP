package com.kolido.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwarvenTunnelDigger extends DwarvenMineWorker {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DwarvenTunnelDigger.class);
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Dwarven tunnel digger";
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		LOGGER.info("{} creates another promising tunnel.", name());
	}

}
