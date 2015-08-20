
public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList = new LinkedList("myFirst List");
		myList.insertAtFront(1);
		//myList.print();
		myList.insertAtFront(2);
		//myList.print();
		myList.insertAtBack(5);
		//myList.print();
		myList.insertAtBack(1);
		myList.insertAtBack(2);
		myList.insertAtBack(7);
		myList.insertAtBack(5);
		myList.insertAtBack(8);
		myList.insertAtBack(1);
		myList.print();
		/*System.out.println("Let's Remove the elements");
		
		try {
			myList.removeFromBack();
			myList.print();
			
			myList.removeFromFront();
			myList.print();
			
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myList.print();*/
		/*try {
			myList.removeFromBack();
			myList.print();
			
			myList.removeFromBack();
			myList.print();
			
			myList.removeFromBack();
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}*/
		
		//myList.removeDuplicates();
	//	System.out.println("----After removing duplicates----");
	//	myList.print();
		
		//myList.removeValue(7);
		
		myList.findSize();

	}

}
