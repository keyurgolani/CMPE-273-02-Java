package assignment1.multithreading;

public class BagleShopMultithreading {
	
	public static void main(String[] args) {
		Thread collectorThread = new Thread(new QueueCollector());
		collectorThread.start();
		Thread serverThread = new Thread(new BagleServer());
		serverThread.start();
	}

}
