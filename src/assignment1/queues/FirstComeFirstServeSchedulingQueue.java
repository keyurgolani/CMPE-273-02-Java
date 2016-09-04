package assignment1.queues;

import java.util.LinkedList;
import java.util.Queue;

public class FirstComeFirstServeSchedulingQueue implements Runnable {
	
	public static Queue<Integer> processQueue = new LinkedList<Integer>();
	
	@Override
	public void run() {
		while(processQueue.peek() != null) {
			try {
				int processBurst = processQueue.poll();
				System.out.println("Serving Process for burst time of: " + processBurst);
				Thread.sleep(processBurst);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		processQueue.add(1000);
		processQueue.add(10000);
		processQueue.add(5000);
		processQueue.add(3000);
		processQueue.add(8000);
		processQueue.add(25000);
		processQueue.add(5000);
		
		Thread t1 = new Thread(new FirstComeFirstServeSchedulingQueue());
		t1.start();
		
	}

}
