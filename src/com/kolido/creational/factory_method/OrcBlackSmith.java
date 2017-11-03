package com.kolido.creational.factory_method;

public class OrcBlackSmith implements BlackSmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		// TODO Auto-generated method stub
		return new OrcWeapon(weaponType);
	}

}
