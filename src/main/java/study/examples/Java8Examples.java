package study.examples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Java8Examples {

	public Java8Examples() {
		this.java8CompletableFuture();
	}

	public void java8CompletableFuture() {
		try {
			
			Future<String> completableFuture = this.calculateAsync();
			System.out.println(completableFuture.get());
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	public Future<String> calculateAsync() throws InterruptedException {
	    CompletableFuture<String> completableFuture = new CompletableFuture<>();
	 
	    Executors.newCachedThreadPool().submit(() -> {
	        Thread.sleep(3000);
	        completableFuture.complete("Hello");
	        return null;
	    });
	 
	    return completableFuture;
	}
	
}
