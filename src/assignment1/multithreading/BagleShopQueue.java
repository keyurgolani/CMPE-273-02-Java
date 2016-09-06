package assignment1.multithreading;

public class BagleShopQueue {
	
	public static void main(String[] args) {
		/*
		 * Topic: Queues in Java
		 * Problem: In a bagle shop, customers keep coming in on their
		 * 		own accord and need to be served in the same order as
		 * 		they arrive in the shop. But however, it is necessary
		 * 		that each customer is saved in a list which will give
		 * 		their names back in the same order as they arrived at
		 * 		the time of serving them.
		 * Solution: Queues are the data structures that are defined to
		 * 		be accessed at the head of it. Single element is queued in
		 * 		a queue at a time and single element is accessed from it
		 * 		at a time. Here, the elements are returned in the same order
		 * 		as they are queued in the queue. The customers are queued
		 * 		in the queue when they arrive one at a time. A batch of
		 * 		bagles is prepared every 20 seconds and contains 5 bagles
		 * 		at once. Hence, 5 customers can be served at once. 5 customers
		 * 		are dequeued at once and served while others in line wait
		 * 		for the next batch of the bagles.
		 */
		Thread collectorThread = new Thread(new QueueCollector());
		collectorThread.start();
		Thread serverThread = new Thread(new BagleServer());
		serverThread.start();
	}

}
