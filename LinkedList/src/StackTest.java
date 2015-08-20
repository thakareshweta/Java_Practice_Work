
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack = new Stack("my Stack");
		
		try {
			myStack.push(5);
			System.out.println("added 5--");
			myStack.print();
			myStack.push(4);
			System.out.println("added 4--");
			myStack.print();
			myStack.push(3);
			System.out.println("added 3--");
			myStack.print();
			myStack.push(2);
			System.out.println("added 2--");
			myStack.print();
			myStack.push(1);
			System.out.println("added 1--");
			myStack.print();
			//start removing
			
			System.out.println("Start Removing...");
			myStack.pop();
			myStack.print();
			System.out.println("second pop");
			myStack.pop();
			System.out.println("third pop");
			myStack.print();
			myStack.pop();
			System.out.println("fourth pop");
			myStack.print();
			myStack.pop();
			System.out.println("fifth pop");
			myStack.print();
			myStack.pop();
			System.out.println("sixth pop");
			myStack.print();
			
			
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
