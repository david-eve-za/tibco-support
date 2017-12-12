package org.citi.threading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class ThreadManager {
	private static ThreadManager _TM = new ThreadManager();

	public static synchronized ThreadManager getInstance() {
		return _TM;
	}

	private Map<String, ListeningExecutorService> executors = new HashMap<String, ListeningExecutorService>();

	public ListeningExecutorService getExecutor(String Reference) {
		return executors.get(Reference);
	}

	public void createExecutor(String Reference, Integer numThreads) {
		executors.put(Reference, MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(numThreads)));
	}

	public void killAllThreads() {
		for (Thread T : Thread.getAllStackTraces().keySet()) {
			if (T.getName().contains("ProcessRequest") || T.getName().contains("UpdateStored")
					|| T.getName().contains("monitor")) {
				// System.out.println("Sending Stop Signal to thread");
				T.interrupt();
			}
		}
	}
}
