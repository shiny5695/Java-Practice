package streamsAndFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//currently not working but it should
public class UseCaseOfParallelStreams {

	public static void main(String[] args) {
		
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100000000; i++) {
        	list.add(i);
        }
        
        long startTime = System.currentTimeMillis();
        list.parallelStream().map(element->heavyOperations(element)).collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

	}
	
	private static int heavyOperations(int i) {
		for(int j = 0; i <1000; j++) {
			i = j+i;
		}
		return i;
	}

}
