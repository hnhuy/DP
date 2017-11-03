package com.kolido.structural.facade;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
		facade.startNewDay();
		facade.digOutGold();
		facade.endDay();
	}

}
