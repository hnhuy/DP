package com.kolido.creational.factory_method;

public class ElfWeapon implements Weapon {
	
	private WeaponType weaponType;
	
	
	
	public ElfWeapon(WeaponType weaponType) {
		super();
		this.weaponType = weaponType;
	}



	@Override
	public WeaponType getWeaponType() {
		// TODO Auto-generated method stub
		return weaponType;
	}



	@Override
	public String toString() {
		return "Elven " + weaponType;
	}
}
