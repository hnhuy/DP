package com.kolido.structural.facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.kolido.structural.facade.DwarvenMineWorker.Action;

public class DwarvenGoldmineFacade {
	private List<DwarvenMineWorker> workers;
	
	public DwarvenGoldmineFacade() {
		workers = new ArrayList<>();
		workers.add(new DwarvenGoldDigger());
		workers.add(new DwarvenCartOperator());
		workers.add(new DwarvenTunnelDigger());
	}
	
	public void startNewDay() {
		makeActions(workers, Action.WAKE_UP, Action.GO_TO_MINE);
	}
	
	public void digOutGold() {
		makeActions(workers, Action.WORK);
	}
	
	public void endDay() {
		makeActions(workers, Action.GO_HOME, Action.GO_TO_SLEEP);
	}
	
	private static void makeActions(Collection<DwarvenMineWorker> workers, DwarvenMineWorker.Action... actions) {
		for (DwarvenMineWorker worker : workers) {
			worker.action(actions);
		}
	}
}
