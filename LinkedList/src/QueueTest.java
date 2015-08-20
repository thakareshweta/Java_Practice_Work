
public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue myQueue = new Queue("my queue");
		//myQueue.addToQueue(1);
		try {
			myQueue.addToQueue(1);
			myQueue.print();
			myQueue.addToQueue(2);
			myQueue.addToQueue(3);
			myQueue.addToQueue(4);
			myQueue.addToQueue(5);
			myQueue.print();
			
			myQueue.remove();
			myQueue.remove();
			myQueue.remove();
			myQueue.print();
			myQueue.remove();
			myQueue.remove();
			
			myQueue.print();
			myQueue.remove();
			
			myQueue.print();
			
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
