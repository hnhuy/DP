package com.kolido.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DwarvenMineWorker {
	private static final Logger LOGGER = LoggerFactory.getLogger(DwarvenMineWorker.class);

	public void goToSleep() {
		LOGGER.info("{} go to sleep", name());
	}

	public void wakeUp() {
		LOGGER.info("{} wake up", name());
	}
	
	public void goHome() {
		LOGGER.info("{} go home", name());
	}
	
	public void goToMine() {
		LOGGER.info("{} go to mine", name());
	}
	
	private void action(Action action) {
		switch (action) {
		case GO_TO_SLEEP:
			goToSleep();
			break;
		case WAKE_UP:
			wakeUp();
			break;
		case GO_HOME:
			goHome();
			break;
		case GO_TO_MINE:
			goToMine();
			break;
		case WORK:
			work();
			break;
		default:
			LOGGER.info("Undefined action");
			break;
		}
	}
	
	public void action(Action...actions) {
		for (Action action : actions) {
			action(action);
		}
	}
	
	public abstract String name();

	public abstract void work();

	static enum Action {
		GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
	}
}
