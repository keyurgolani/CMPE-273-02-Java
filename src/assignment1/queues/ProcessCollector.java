package assignment1.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProcessCollector implements Runnable {
	
	public static Queue<Long> processWaitingQueue = new LinkedList<Long>();

	public static Queue<Long> getProcessWaitingQueue() {
		return processWaitingQueue;
	}

	public static void setProcessWaitingQueue(Queue<Long> processWaitingQueue) {
		ProcessCollector.processWaitingQueue = processWaitingQueue;
	}

	@Override
	public void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter burst time of next process arriving: ");
			processWaitingQueue.add(sc.nextLong());
		}
	}
}
