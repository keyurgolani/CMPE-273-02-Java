package assignment1.queues;

public class FirstComeFirstServeSchedulingMultithreading {
	
	public static void main(String[] args) {
		Thread processCollectorThread = new Thread(new ProcessCollector());
		processCollectorThread.start();
		Thread shortTermSchedulerThread = new Thread(new ShortTermScheduler());
		shortTermSchedulerThread.start();
	}

}
