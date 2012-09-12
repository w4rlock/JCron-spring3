package com.w4rlock.jcron;

import org.apache.log4j.Logger;

public class CronAction {
	protected static Logger logger = Logger.getLogger(CronAction.class);

	public void performService() {
		String threadName = Thread.currentThread().getName();
		logger.debug("   " + threadName + " cron service performing important stuff..");
	}

}
