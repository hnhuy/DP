package com.kolido.creational.singleton;

/**
 * Enum based singleton implementation. Effective Java 2nd Edition (Joshua
 * Bloch) p. 18 Since java5 the best way to do it is to use an enum:
 */
public enum EnumIvoryTower {
	INSTANCE;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getDeclaringClass().getCanonicalName() + "@" + hashCode();
	}

}
