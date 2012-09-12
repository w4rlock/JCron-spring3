package com.w4rlock.jcron;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;

public class sinSpring {
	private final Logger logger = Logger.getLogger(sinSpring.class);
	private static final long ONE_HOUR_DELAY = 1000 * 60 * 60;
	private Timer tarea1 = new Timer("Tarea1", true);
	
	
	public sinSpring() {
		Calendar startIni = Calendar.getInstance();
		startIni.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		startIni.set(Calendar.HOUR_OF_DAY, 23);
		startIni.set(Calendar.MINUTE, 20);
		startIni.set(Calendar.SECOND, 0);
		
		tarea1.scheduleAtFixedRate(new TimerTask() {
			
			private synchronized void runFunction(){
				logger.debug("Exec job without spring");
				
			}
			
			@Override
			public void run() {
				runFunction();
				
			}
		}, startIni.getTime(), ONE_HOUR_DELAY);
	}
}
