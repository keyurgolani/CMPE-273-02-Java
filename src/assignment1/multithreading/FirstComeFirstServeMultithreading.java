package assignment1.multithreading;

public class FirstComeFirstServeMultithreading {
	
	public static void main(String[] args) {
		/*
		 * Topic: Multithreading in Java
		 * Problem: For a CPU scheduling algorithm like First Come First Serve
		 * 		the processes arrive at their own time randomly and are to be
		 * 		served sequentially whenever the previous process ends executing.
		 * 		Here the arrival of process and allowing the process to execute
		 * 		are two very independent but inter-connected tasks.
		 * Solution: Multithreading provides with the functionality where two
		 * 		tasks can be executing on their own and communicate with each
		 * 		other at the same time to synchronize the work. Here, process
		 * 		collector thread keeps executing in the background and keeps
		 * 		collecting the processes in the wait queue. Wait queue is the
		 * 		queue where the processes are waiting for their turn to execute.
		 * 		The cpu thread keeps collecting one(depending on the number of
		 * 		cpu cores) process at a time from the waiting queue and executes
		 * 		it for the burst time it has. After executing the process for it's
		 * 		burst time, it will get the next process in the queue and execute it. 
		 */
		Thread processCollectorThread = new Thread(new ProcessWaitingQueue());
		processCollectorThread.start();
		Thread cpuThread = new Thread(new ShortTermScheduler());
		cpuThread.start();
	}

}
