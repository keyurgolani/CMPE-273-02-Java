package assignment1.queues;

import java.util.Queue;

import utility.ProjectUtility;

public class ShortTermScheduler implements Runnable {

	@Override
	public void run() {
		int p = 0;
		while (true) {
			try {
				Queue<Long> waitingQueue = ProcessWaitingQueue.getWaitingQueue();
				Long currentProcess = waitingQueue.poll();
				for (int i = 0; i < 1; i++) {					
					if (currentProcess != null) {
						System.out.println(ProjectUtility.getTimeStamp() + "\t" + "Executing Process P" + p++ + " for burst time of " + currentProcess);
						Thread.sleep(currentProcess);
					} else {
						break;
					}
				}
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
