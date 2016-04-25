package threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Countdown {

	public static void main(String[] args) throws InterruptedException {

		CountDownLatch latch = new CountDownLatch(4);

		ExecutorService execute = Executors.newFixedThreadPool(4);

		for (int i = 0; i < 4/* Try changing the value of i */; i++) {
			execute.submit(new Process(latch));
		}

		/**
		 * Implementation without ThreadPool
		 * 
		 * Thread t1=new Thread(new Process()); Thread t2=new Thread(new
		 * Process()); Thread t3=new Thread(new Process()); Thread t4=new
		 * Thread(new Process());
		 * 
		 * t1.start(); t2.start(); t3.start(); t4.start(); try { t1.join();
		 * t2.join(); t3.join(); t4.join(); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 * 
		 */

		latch.await(); /*
						 * Never Executes further statements unless all the
						 * threads return
						 */
		System.out.println("Continue with main");
		execute.shutdown();
	}
}

class Process implements Runnable {

	private CountDownLatch latch;

	public Process(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Starting...");
		latch.countDown();
	}
}