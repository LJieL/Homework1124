package stream_java8;

import java.util.function.Supplier;

public class FibonacciSupplier implements Supplier<Long>{
		private long previous = 1; 
		private long mid = 2;
		 private long current =4 ;
	@Override
	public Long get() {
		
		long p = previous;	
		long next =  previous + mid +current ;
	    previous = mid;
	    mid = current ;
		current = next;
		return p;
	}

}
