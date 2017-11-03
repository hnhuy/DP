package com.kolido.creational.factory_method;

public class OrcWeapon implements Weapon {
	private WeaponType weaponType;
	
	
	public OrcWeapon(WeaponType weaponType) {
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
		return "Orcish " + weaponType;
	}

}
