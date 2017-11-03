package com.kolido.creational.singleton;

public class ThreadSafeLazyLoadedIvoryTower {
	private static ThreadSafeLazyLoadedIvoryTower instance;
	
	private ThreadSafeLazyLoadedIvoryTower() {
		if (instance != null) {
			throw new IllegalAccessError("Already initialized!");
		}
	}
	
	
	public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {
		if (instance != null) {
			instance = new ThreadSafeLazyLoadedIvoryTower();
		}
		
		return instance;
	}
}
