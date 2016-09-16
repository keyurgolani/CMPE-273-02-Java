package assignment1.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueCollector implements Runnable {
	
	public static Queue<String> customersInLine = new LinkedList<String>();
	
	public static Queue<String> getCustomersInLine() {
		return customersInLine;
	}

	public static void setCustomersInLine(Queue<String> customersInLine) {
		QueueCollector.customersInLine = customersInLine;
	}

	@Override
	public void run() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the name of next customer in line: ");
			customersInLine.add(sc.nextLine());
		}
	}
}
