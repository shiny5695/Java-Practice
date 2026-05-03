package streamsAndFunctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//why would you create multiple Functional Interfaces for common use cases every damn time
//So java said let me handle the basic usecases and for niche/complex requirements you do you.

/**
 * main types are : Predicate(Bipredicate), Consumer(Biconsumer), Supplier(doesnt have a bi), Function(Bifunction).
 */
public class TypesOfInbuiltFunctionalInterfaces {

	public static void main(String[] args) {
	
		//1. Predicate takes one input and returns boolean
		//the generic is here the type of input u r gonna provide
		Predicate<Integer> predicate = num ->  (num==5);
		System.out.println("Predicate : " + predicate.test(5));
		
		BiPredicate<Integer,Integer> pred2 = (num1,num2) -> (num1+num2==0);
		System.out.println("Bipredicate : " + pred2.test(0,1));
		
		//2. Consumer just takes one input and doesnt return anything
		Consumer<String> consumer = (str)-> {
			System.out.print("Consumer " + str);
		};
		consumer.accept("Shiny");

		BiConsumer<String,String> biconsumer = (str1,str2)-> {
					System.out.println("BiConsumer is " + str1.concat(str2));
				};
		biconsumer.accept("Shiny ","is lost");
		
		//3. Supplier takes no input but still returns a value
		Supplier<Double> supplier = () -> {
			return (double)Math.random();
		};
		System.out.println("Supplier : " +  supplier.get());
		
		//4. Takes an input and gives an output -> used for transformation
		Function<Integer,String> function = (num)-> {
			return "Function called : " + num+" ::numStr";
		};
		System.out.println(function.apply(5));
		//Starting two generics are the inputs and third is the return type
		BiFunction<Integer,Integer,String> bifunction = (num1,num2)-> {
			return "BiFunction called : " + num1+" ::numStr" + num2;
		};
		System.out.println(bifunction.apply(5,6));
		
	}

}
