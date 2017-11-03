package com.kolido.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	
	public static void main(String[] args) {
		// eagerly initialized singleton
		IvoryTower ivoryTower = IvoryTower.createInstance(), ivoryTower2 = IvoryTower.createInstance();
		LOGGER.info("ivory tower 1: {} ", ivoryTower);
		LOGGER.info("ivory tower 2: {} ", ivoryTower2);
		
		// lazily initialized singleton
		ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
		ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
		LOGGER.info("threadSafeIvoryTower1={}", threadSafeIvoryTower1);
		LOGGER.info("threadSafeIvoryTower2={}", threadSafeIvoryTower2);
		
		// enum singleton
		EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
		EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
		LOGGER.info("enumIvoryTower1={}", enumIvoryTower1);
		LOGGER.info("enumIvoryTower2={}", enumIvoryTower2);
	}
}
