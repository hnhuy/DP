package com.kolido.creational.factory_method;

public enum WeaponType {
	SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("undefined");
	
	private String title;

	WeaponType(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title;
	}
	
	
}
