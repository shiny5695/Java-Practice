package streamsAndFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadSafetyInParallelStreamsDemo {

	public static void main(String[] args) {
		
		//created one list
		List<Integer> list = new ArrayList<>();
		
		//created another 
		List<Integer> list2 = new ArrayList<>();
		
		for(int i = 0; i <1000; i++) {
			list.add(i);
			
		}
		
		//list.stream().map(elem->elem*elem).forEach(num->list2.add(num)); //prints 1000
		//list.parallelStream().map(elem->elem*elem).forEach(num->list2.add(num)); //varies each time u run
		//fix for above : use Collectors.toList
		System.out.println(list.parallelStream().map(elem->elem*elem).collect(Collectors.toList()).size());
	
		

	}

}
