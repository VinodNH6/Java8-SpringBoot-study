package study.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Java8_ThreadPoolExecutor {

	public Java8_ThreadPoolExecutor() { 
		this.SingleThread();
		this.TenThreads();
	}
	
	
	public void SingleThread() {
		AtomicInteger counter = new AtomicInteger();
		 
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {
		    counter.set(1);
		});
		executor.submit(() -> {
			System.out.println(counter);
		    counter.compareAndSet(1, 2);
		    System.out.println(counter);
		});
	}
	
	
	
	public void TenThreads() {
		AtomicInteger counter = new AtomicInteger();
		 
		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.submit(() -> {
		    counter.set(1);
		});
		executor.submit(() -> {
			System.out.println(counter);
		    counter.compareAndSet(1, 2);
		    System.out.println(counter);
		});
	}

}
