package assignment1.multithreading;

import java.util.Queue;

public class BagleServer implements Runnable {

	@Override
	public void run() {
		while (true) {
			try {
				Queue<String> customersInLine = QueueCollector.getCustomersInLine();
				for (int i = 0; i < 5; i++) {
					String currentCustomer = customersInLine.poll();
					if (currentCustomer != null) {
						System.out.println("Serve: " + currentCustomer);
					} else {
						break;
					}
				}
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
