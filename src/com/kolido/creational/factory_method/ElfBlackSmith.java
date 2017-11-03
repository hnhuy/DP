package com.kolido.creational.factory_method;

public class ElfBlackSmith implements BlackSmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		// TODO Auto-generated method stub
		return new ElfWeapon(weaponType);
	}

}
