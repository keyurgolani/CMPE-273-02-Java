package assignment1.queues;

public class ShortTermScheduler implements Runnable {

	@Override
	public void run() {
		Long i = 0l;
		while (true) {
			try {
				while(ProcessCollector.getProcessWaitingQueue().peek() == null);
				System.out.println("Process Burst Arrived");
				Long nextProcessBurst = ProcessCollector.getProcessWaitingQueue().poll();
				if(nextProcessBurst != null) {
					System.out.println("Serving Process P" + i++ + " for burst time of " + nextProcessBurst + " miliseconds");
					Thread.sleep(nextProcessBurst);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
