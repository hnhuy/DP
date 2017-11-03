package com.kolido.creational.abstract_factory;

public interface KingdomFactory {
	King createKing();
	Castle createCastle();
	Army createArmy();
}
