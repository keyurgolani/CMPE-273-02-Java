package assignment1.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProcessWaitingQueue implements Runnable {
	
	public static Queue<Long> waitingQueue = new LinkedList<Long>();
	
	public static Queue<Long> getWaitingQueue() {
		return waitingQueue;
	}

	public static void setWaitingQueue(Queue<Long> waitingQueue) {
		ProcessWaitingQueue.waitingQueue = waitingQueue;
	}

	@Override
	public void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter burst time for next arriving process: ");
			waitingQueue.add(sc.nextLong());
		}
	}
}
