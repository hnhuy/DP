package com.kolido.creational.factory_method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	private final BlackSmith blackSmith;
	
	
	
	public App(BlackSmith blackSmith) {
		super();
		this.blackSmith = blackSmith;
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App(new OrcBlackSmith());
		app.manufactureWeapon();
		
		app = new App(new ElfBlackSmith());
		app.manufactureWeapon();
	}
	
	private void manufactureWeapon() {
		Weapon weapon;
		weapon = blackSmith.manufactureWeapon(WeaponType.AXE);
		LOGGER.info(weapon.toString());
		weapon = blackSmith.manufactureWeapon(WeaponType.SPEAR);
		LOGGER.info(weapon.toString());
	}
}
