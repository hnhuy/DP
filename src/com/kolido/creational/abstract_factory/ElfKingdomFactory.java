package com.kolido.creational.abstract_factory;

public class ElfKingdomFactory implements KingdomFactory {

	@Override
	public King createKing() {
		// TODO Auto-generated method stub
		return new ElfKing();
	}

	@Override
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new ElfCastle();
	}

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new ElfArmy();
	}

}
