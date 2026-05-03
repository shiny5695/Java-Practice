package streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ParallelStreamsUseForkJoin {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,7,8,9,10);
		//list.parallelStream().forEach(num-> System.out.println(Thread.currentThread().getName()));
		
		//By default all cores of a system - 1 is the no of cores handling this request
		
		//but if u want to change it : 
		ForkJoinPool fork = new ForkJoinPool(3);
		fork.submit(()-> {
			list.parallelStream().forEach(num-> System.out.println(Thread.currentThread().getName()));
		});
		
		fork.shutdown();
		try {
			fork.awaitTermination(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
