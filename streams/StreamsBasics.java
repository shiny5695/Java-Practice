package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsBasics {


	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		List<Employee> empList = Arrays.asList(new Employee("Abhishek", "Tech", 10),
				new Employee("Rani", "Finance", 7000),
				new Employee("Raj", "Finance", 8000),
				new Employee("Shiny", "Tech", 20),
				new Employee("Harsha", "Sales", 300));
		
		//print only even numbers using filter and foreach
		//list.stream().filter(n -> n%2==0).forEach(System.out::println);
		
		//print square of all nums using map
		
		//list.stream().map(n->n*n).forEach(System.out::println);
		
		//print sum of all nums
		//list.stream().mapToInt();
		
		//print count of all nums
		//list.stream()
		
		//print all Employees
		empList.stream().map(e->e.getName()).forEach(System.out::println);
		
		//find all Employees with dept as tech
		
		//find all employees with names starting with A
		
		//print all employees with uppercase
		
		//find all employees with names starting with A
		
		//list = new ArrayList<>(Arrays.asList(5,3,3,1,6,1));
		
		//remove all duplicates from above and sort in ascending order
		//list.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		//remove all duplicates from above and sort in descending order
		//list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//remove all duplicates from above and sort in descending order without using Comparator.reverseOrder
		//list.stream().distinct().sorted((a,b)-> b-a).forEach(System.out::println);
		
		//list = new ArrayList<>(Arrays.asList(5,4,3,1,2));
		
		//find all odd nums and print their squares
		//list.stream().filter(x-> x%2!=0).map(x->x*x).forEach(System.out::println);
		
		list = Arrays.asList(5,4,3,1,2);
		
		//only take 2nd and 3rd element from the list and return in a list
		//System.out.println(list.stream().skip(1).limit(2).toList());
		
		//find second highest no in a list
//		Optional<Integer> t = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst();
//		System.out.println(t.get());
		
		//Divide list into odd and even
		//Map<Boolean,List<Integer>> map = list.stream().collect(Collectors.partitioningBy(elem->elem%2==0));
		//System.out.println(map);
		
		//Find the longest string
		List<String> stringlist = Arrays.asList("API", "Spring", "Springboot");
		//System.out.println(stringlist.stream().sorted((a,b) -> b.length()-a.length()).limit(1).toList());
		//option 2 :
		System.out.println(stringlist.stream().max(Comparator.comparing(elem->elem.length())));
		
		
		//find first employee whose salary/ ID is greater than 2
		Optional<String> opt = empList.stream().filter(e->e.getId()>2).map(e->e.getName()).findFirst();
		if(opt.isPresent() ) {
			System.out.println(opt.get());
		}
		
		//find top 2 highest paid employees
		System.out.println("Top 2 highest paid : " + empList.stream().sorted((a,b)-> b.getId() - a.getId()).map(e->e.getName()).limit(2).toList());
		
		//sort employees by salary then name
		//todo
		
		//count frequency of nos 
		list = new ArrayList<>(Arrays.asList(5,3,3,1,6,1));
		Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		System.out.println("Frequency is : " + map);
		
		
		//find employees in each dept
		System.out.println("Employees in each dept" + empList.stream().collect(Collectors.groupingBy(e->e.getDept(),Collectors.counting())));
		
		//average expenses in each category
		List<Transactions> transList = Arrays.asList(new Transactions("Food",100.00),
				new Transactions("Food",200.00),
				new Transactions("Shopping",2000.00),
				new Transactions("Vacation",15000.00),
				new Transactions("Vacation",12000.00)
				);
		
		System.out.println("Avergae expenses in each category" + transList.stream().collect(Collectors.groupingBy(e->e.getCategory(), Collectors.averagingDouble(e->e.getAmount()))));
		
		
		//total expenses in each category
		System.out.println("Total expenses in each category" + transList.stream().collect(Collectors.groupingBy(e->e.getCategory(), Collectors.summingDouble(e->e.getAmount()))));
		
		
		//highest paid employee in each dept
		System.out.println("Highest paid employee in each dept" +  empList.stream().collect(Collectors.groupingBy(e->e.getDept(),Collectors.maxBy(Comparator.comparingInt(e->e.getId())))));
		//option 2 :
		System.out.println("Part 2 Highest paid employee in each dept" +  empList.stream().collect(Collectors.groupingBy(Employee::getDept,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getId)), kya->kya.get().getName()))));
	
		
		//Convert list of employees into comma separated values of just employee names
		System.out.println("Converting list of employees to csv of emp names :" + empList.stream().map(e->e.getName()).collect(Collectors.joining(",")));
		
		//COmmon elements between two lists
		List<Integer> list1 = Arrays.asList(5,4,3,1,2);
		List<Integer> list2 = Arrays.asList(8,9,1,2);
		
		Set<Integer> set = new HashSet<>(list1);
		
		System.out.println("Common elements" + list2.stream().filter(e->set.contains(e)).toList());
		
	    //combine multiple lists and remove duplicates
		
		
		//sum of all salaries and operation should be fast

	}
	
	

}

class Employee {
	
	String name;
	String dept;
	Integer salary;
	
	public Employee(String name,String dept,int id) {
		this.name = name;
		this.dept = dept;
		this.salary = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getId() {
		return salary;
	}
	public void setId(Integer id) {
		this.salary = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}


class Transactions {

	String category;
	Double amount;
	
	Transactions(String category,Double amount) {
		this.category=category;
		this.amount=amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	
}

