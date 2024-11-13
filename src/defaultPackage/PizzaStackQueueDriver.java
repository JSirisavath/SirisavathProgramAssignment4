package defaultPackage;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PizzaStackQueueDriver {

	public static void main(String[] args) {
		// stackToInt tests:
		System.out.println("stackToInt tests: ");
		// Test Case 1: 
		Stack <Pizza> testCaseStack1 = new Stack<>();
		
		testCaseStack1.push(new Pizza("Pepperoni Pizza", 5));
		testCaseStack1.push(new Pizza("Sausage Pizza", 4));
		testCaseStack1.push(new Pizza("New York Style Pizza", 7));
		testCaseStack1.push(new Pizza("Meat Lovers Pizza", 8));
		
		
		System.out.println( "test output for case 1, (expect 5478) : " + stackToInt(testCaseStack1));

		
		// Test case 2: 
		Stack <Pizza> testCaseStack2 = new Stack<>();
		
		testCaseStack2.push(new Pizza("Pan Style  with 3 meats Pizza", 5));
		
		
		System.out.println( "test output for case 2, (expect 5) : " + stackToInt(testCaseStack2));
		
		
		// Test case 3: 
		Stack <Pizza> testCaseStack3 = new Stack<>();
		
		testCaseStack3.push(new Pizza("Sausage Pizza", 0));
		testCaseStack3.push(new Pizza("New York Style Pizza", 7));
		testCaseStack3.push(new Pizza("Meat Lovers Pizza", 4));
		
		
		System.out.println( "test output for case 3, (expect 74) : " + stackToInt(testCaseStack3));
		
		
		
		
		// popSome test cases: 
		System.out.println("popSome test cases: ");
		
		// test case 1: 
	Stack <Pizza> testCaseStack4 = new Stack<>();
		
	testCaseStack4.push(new Pizza("Pepperoni Pizza", 5));
	testCaseStack4.push(new Pizza("Sausage Pizza", 4));
	testCaseStack4.push(new Pizza("New York Style Pizza", 2));
		
		System.out.println( "test output for case 1, (expect 11) : " + popSome(testCaseStack4, 3));
		
		
		
		// Test case 2: 
		Stack <Pizza> testCaseStack5 = new Stack<>();
		
		
		testCaseStack5.push(new Pizza("Pepperoni Pizza", 5));
		testCaseStack5.push(new Pizza("Sausage Pizza", 4));
		testCaseStack5.push(new Pizza("New York Style Pizza", 6));
		testCaseStack5.push(new Pizza("Vegi Pizza", 7));

		
		System.out.println( "test output for case 2, (expect 17) : " + popSome(testCaseStack5, 3));
		
		
		
		// Test case 3: 

		System.out.println( "test output for case 3, (expect -1) : " + popSome(testCaseStack2, 3));
		
		
		// Test case 4: 
		Stack <Pizza> testCaseStack6 = new Stack<>();
		
		System.out.println( "test output for case 4, (expect -1) : " + popSome(testCaseStack6, 3));
		
		
		// Test case 5: 
		System.out.println( "test output for case 5, (expect 0) : " + popSome(testCaseStack5, 0));
		
		
		// Test case 6: 
		System.out.println( "test output for case 6, (expect -1) : " + popSome(testCaseStack5, -2));
		
		
		
		
		// extractFromStack tests: 
		System.out.println("extractFromStack cases:");
		
		// test case 1: 
		Pizza vegiPizza = new Pizza("Vegi Pizza", 7);
		
		testCaseStack4.push(vegiPizza);
		
		System.out.println( "test output for case 1, (expect 1) : " + extractFromStack(testCaseStack4,vegiPizza ));

		
		// test case 2: 
		testCaseStack4.push(vegiPizza);
		testCaseStack4.push(vegiPizza);
		System.out.println( "test output for case 2, (expect 2) : " + extractFromStack(testCaseStack4,vegiPizza ));

		
		//test case 3: 
		System.out.println( "test output for case 3, (expect 0) : " + extractFromStack(testCaseStack3,vegiPizza ));
		
		
		// test case 4: 
		System.out.println( "test output for case 4, (expect 0) : " + extractFromStack(testCaseStack6,vegiPizza ));
		
		
		
		System.out.println( "equal Stacks cases: ");
		
		
		//test case 1
		Stack <Pizza> testCaseStack9 = new Stack<>();
		Stack <Pizza> testCaseStack10 = new Stack<>();
		
		
		testCaseStack9.push(new Pizza("Vegi Pizza", 7));
		
		testCaseStack10.push(new Pizza("Vegi Pizza", 7));
		
		System.out.println( "test output for case 1, (expect True) : " + equalStacks(testCaseStack9,testCaseStack10));

		
		//test case 2
		System.out.println( "test output for case 2, (expect false) : " + equalStacks(testCaseStack5,testCaseStack6));
	
	
		// test case 3
		System.out.println( "test output for case 3, (expect false) : " + equalStacks(testCaseStack6,testCaseStack10));
	
	
		// test case 4
		
		Stack <Pizza> testCaseStack11 = new Stack<>();
		
		System.out.println( "test output for case 4, (expect true) : " + equalStacks(testCaseStack6,testCaseStack11));
		
		
		
		// QUEUE
		
		System.out.println( "Replace method: ");
		
		// test 1
		Pizza oldVal = new Pizza("Meat Lover", 5);
		
		Pizza newVal = new Pizza("Veggie Pizza", 7);
		
		 Queue<Pizza> queue1 = new LinkedList<>();
		 
		 queue1.add(new Pizza("Mozza Pizza", 4));
		 
		queue1.add(oldVal);

		
		System.out.println("Test Case 1:");
		
		replace(queue1,oldVal, newVal);
		
		System.out.println(queue1);
		
		
		// test 2:
		
		 Queue<Pizza> queue2 = new LinkedList<>();

		 
		 queue2.add(new Pizza("Meat Lovers",5));
		 
		 queue2.add(new Pizza("M Lovers",5));
		 
		 queue1.add(oldVal);
		 
		 queue1.add(oldVal);
		 
		replace(queue2,oldVal, newVal);
		 
		System.out.println(queue2);
		
		
		
		// test 3
		
		 Queue<Pizza> queue3 = new LinkedList<>();
		 queue3.add(oldVal);
		 
		 queue3.add(new Pizza("Meat Lovers",5));
		 
		 queue3.add(new Pizza("M Lovers",5));
		 
		 replace(queue3,oldVal, newVal);
		 
		 
		 
		 // test 4
		 
		 Queue<Pizza> queue4 = new LinkedList<>();
		 
	    queue4.add(new Pizza("Meat Lovers",5));
		 
		 queue4.add(new Pizza("M Lovers",5));
		 
		 queue4.add(oldVal);
		 
		 replace(queue4,oldVal, newVal);
		 
		 
		 // test 5
		 Queue<Pizza> queue5 = new LinkedList<>();
		    queue5.add(new Pizza("Meat Lovers",5));
			 
			 queue5.add(new Pizza("M Lovers",5));
			 
			 replace(queue5,oldVal, newVal);
			 
			 
		// test 6
	 Queue<Pizza> queue6 = new LinkedList<>();
	 replace(queue6,oldVal, newVal);
	 
	 
	 
	 
	 // swap cases
	 
	 System.out.println("Swap Cases:");
	 
     Stack<Pizza> stack1 = new Stack<>();
     Queue<Pizza> queue01 = new LinkedList<>();
	 
	 
	 // test 1: 
     stack1.push(new Pizza("M Lovers",5));
     
     stack1.push(new Pizza("Vegg Lovers",5));
     
     stack1.push(new Pizza("Pepper Lovers",5));
     
     
     queue01.add(new Pizza("Mozzi",6));
     queue01.add(new Pizza("NY Pizza",8));
     
     queue01.add(new Pizza("Sausage Pizza",7));
     
     
     swap(stack1,queue01);
     
	 System.out.println("s"+stack1);
	 
	 System.out.println("q" +queue01);
     
     
	 System.out.println();
	 // test 2
	 Queue<Pizza> queue02 = new LinkedList<>();
     queue02.add(new Pizza("Mozzi",6));
     queue02.add(new Pizza("NY Pizza",8));
			 
     
     swap(stack1,queue02);
     
	 System.out.println("s"+stack1);
	 
	 System.out.println("q" +queue02);
	 
	 
	 System.out.println();
	 //test 3 
	 Stack<Pizza> stack2 = new Stack<>();
	 
	 swap(stack2,queue02);
	 
	 System.out.println("s"+stack2);
	 
	 System.out.println("q" +queue02);
	 
	 System.out.println();
	 //test 4
	 Queue<Pizza> queue03 = new LinkedList<>();
	 
	 swap(stack1,queue03);
	 
	 System.out.println("s"+stack1);
	 
	 System.out.println("q" +queue03);
	 
	 
	 System.out.println();
	 // test 5
	 
	   Stack<Pizza> stack5 = new Stack<>();
       Queue<Pizza> queue05 = new LinkedList<>();
	 
	 swap(stack5,queue05);
	 
     System.out.println("s"+stack5);
	 
	 System.out.println("q" +queue05);
	 
	 
	 
	 //Queue cases
	 System.out.println("Queue Cases: ");
	 
	 
	 // test 1
	 
	 // String extraToppingName, String PizzaName, Integer NumberOfPizza, Integer extraToppingQuantity
	 Topping pizzaTopping1 = new Topping("Extra Cheese", "NY Pizza", 5, 6);
	 
	 
	 Topping pizzaTopping2 = new Topping("Extra Cheese", "Pepperoni Pizza", 7, 9);
	 
	 // String PizzaName, Integer NumberOfPizza, Boolean StuffedCrust, Integer CheeseQuantityToAdd
	 StuffedCrust sfPizza1 = new StuffedCrust("Meat Lovers Pizza", 6, true, 5);
	 
	 
	 StuffedCrust sfPizza2 = new StuffedCrust("Veggie Lovers Pizza", 11, true, 4);
	 
	 
	 Pizza pizza1 = new Pizza("Mozzi",6);
	 
	 
	 Pizza pizza2 = new Pizza("Sausage Pizza",7);
	 
	 
	 
	 // test case 1
	 
	 Queue<Pizza> q01 = new LinkedList<>();
	 
	 q01.add(pizzaTopping1);
	 
	 q01.add(sfPizza1);
	 
	 q01.add(pizza2);
	 
	 
	 
	 // test case 2 
	 Queue<Pizza> q02 = new LinkedList<>();
	 
	 q02.add(sfPizza1);
	 
	 
	 
	 //test case 3
	 
	 Queue<Pizza> q03 = new LinkedList<>();
	 
	 q03.add(pizzaTopping2);
	 
	 
	 
	 //test 4
	 Queue<Pizza> q04 = new LinkedList<>();
	 
	 q04.add(pizza1);
	 
	 
	 // test 5
	 Queue<Pizza> q05 = new LinkedList<>();
	 
	 System.out.println(q05);
	 
	}
	
	 public static int stackToInt(Stack<Pizza> s) {
		 // Create a new stack: https://www.geeksforgeeks.org/stack-class-in-java/
		Stack <Pizza> temporoaryStack = new Stack<>();
		
		int result = 0;
		
		// Given stack will pop each item (from the top) and added to the temporary stack in reverse order( Top item from s stack will be placed in the bottom of temp stack)
		while(!s.isEmpty()) {
			// pop() - Removes the object at the top of this stack and returns that object as the value of this function https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#pop--
			// push() - Pushes an item onto the top of this stack. This has exactly the same effect as addElement(item) https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#push-E- 
			temporoaryStack.push(s.pop());
		}
		
		// Add into the original stack (s) from the temporoaryStack stack by giving each popped item a ref. variable and adding that pizza into the s stack.
		while (!temporoaryStack.isEmpty()) {
			Pizza pizza = temporoaryStack.pop();
			
			// add the popped pizza item into the s stack
			s.push(pizza);
			
			// integer creation
			result = result *10 + pizza.getNumberOfPizza();
		}
		
		return result;
		
	 }


	 public static int popSome( Stack<Pizza> s, int count ) {
		 
		 // return -1 if count is less than 0
		 if (count <0) {
			 return -1; 
		 }
		 
		 // return -1 if size of stack is less than count
		 if (s.size() < count) {
			 return -1;
		 }
		 
		 
		 int sumValue = 0; // init. value of all poppedPizzas' number of piazzas attributes combined
		 
		 for (int i =0; i < count; i++) {
			 // based on the amount of the count, pop that many while storing the pop values into a pizza object.
			 Pizza poppedPizza = s.pop();
			 
			 // sumValue is the accumulator of the poppedPizza's number of piazzas added together and returned
			 sumValue += poppedPizza.getNumberOfPizza();
		 }
		 
		 return sumValue;
		 
	 }
	 
	 
	 public static int extractFromStack( Stack<Pizza> s, Pizza i ) {
			Stack <Pizza> temporoaryStack = new Stack<>();
			
			int count = 0;
			
			
			// Remove items from s param, and check if they are equal to given item, else put them in temp stack
			
			while (!s.isEmpty()) {
				Pizza topPizza = s.pop();
				
				if (topPizza.equals(i)) {
					count++; // count the occurrence of how many piazzas matched
				} else {
					temporoaryStack.push(topPizza);
				}
			}
			
			
			// keep original order of stack
			
			while (!temporoaryStack.isEmpty()) {
				s.push(temporoaryStack.pop());
			}
			
			return count;
	 }
	 
	 
	 // Original statement wants to return boolean but given method is void, changed it to boolean
	 public static boolean equalStacks( Stack<Pizza> s1, Stack<Pizza> s2 ) {
		 // If both are not the same size, return false
		 if (s1.size() != s2.size()) {
			 return false;
		 }
		 
		 
		 Stack <Pizza> temporoaryStack1 = new Stack<>();
		 
		 Stack <Pizza> temporoaryStack2 = new Stack<>();
		 
		 boolean isEqualOrNot = true;
		 
		 // compare each pizza items from both stacks and evaluate if they are equal
		 while(!s1.isEmpty()) {
			 Pizza pizza1 = s1.pop();
			 
			 Pizza pizza2 = s2.pop();
			 
			 
			 // If they are not equal, change boolean var. to false
			 if(!pizza1.equals(pizza2) ) {
				 isEqualOrNot = false;
			 }
			 
			 temporoaryStack1.push(pizza1);
			 
			 temporoaryStack2.push(pizza2);
			 
		 }
		 
		 
		 // put items back to original order
		 
		 while(!temporoaryStack1.isEmpty()) {
			 s1.push(temporoaryStack1.pop());
			 
			 s2.push(temporoaryStack2.pop());
		 }
		 
		 return isEqualOrNot;
	 }
	 
	 
	public static void replace( Queue<Pizza> queue, Pizza oldVal, Pizza newVal ) {
		int size = queue.size();
		
		
		for (int i = 0; i < size; i++) {
			Pizza currentPizza = queue.remove();
			
			// Replace old value with new
			
			if (currentPizza.equals(oldVal)) {
				queue.add(newVal);
			} else {
				queue.add(currentPizza);
			}
		}
	}

	
	public static void swap( Stack<Pizza> s, Queue<Pizza> q ) {
		Stack <Pizza> temporoaryStack = new Stack<>();
		
		
	// items go to temp stack reveresed
	    while (!s.isEmpty()) {
	    	temporoaryStack.push(s.pop());
	    }
	
	    
	    // que to stack
	    while (!q.isEmpty()) {
	    	s.push(q.remove());
	    }
	    
	    // temp stack to que
	    while (!temporoaryStack.isEmpty()) {
	    	q.add(temporoaryStack.pop());
	    }
		
	}


    @SuppressWarnings("unchecked")
    // Gave weird warnings on return statements- added the @SupressWarnings via IDE suggestions
	public static Queue<Pizza>[] split( Queue<Pizza> q ) {
    	   Queue<Pizza> itemAQueue = new LinkedList<>();
           Queue<Pizza> itemBQueue = new LinkedList<>();
           Queue<Pizza> temporoaryQ = new LinkedList<>();
           
           
           while(!q.isEmpty()) {
        	   Pizza pizza = q.remove();
        	      
        	   // check type of items and add to right q list
               if (pizza instanceof StuffedCrust) {
                   itemAQueue.add(pizza);
               } else if (pizza instanceof Topping) {
                   itemBQueue.add(pizza);
               } else {
                   // If the item is neither toping nor stuffed crust, add it back to temporoaryQ
            	   temporoaryQ.add(pizza);
               }
        	   
           }
           
           // add back items that are not either into param q
           
           while (!temporoaryQ.isEmpty()) {
        	   q.add(temporoaryQ.remove());
           }
           
           
           // return both q lists
           return new Queue[] {itemAQueue, itemBQueue};
    }

}

	 

