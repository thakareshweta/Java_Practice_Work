
public class Queue {
	Node firstNode;
	String name;
	
	public Queue()
	{
		this.name = "queue"; 
	}
	
	public Queue (String name )
	{
		this.name = name;
		firstNode = null;
	}
	
	public void addToQueue(int data)
	{
		if(isEmpty())
		{
			firstNode = new Node(data);
		}
		else
		{
			//firstNode = new Node(data,firstNode);
			Node currentNode = firstNode;
			while(currentNode.getNextNode()!=null)
			{
				currentNode = currentNode.getNextNode();
			}
			
			currentNode.nextNode = new Node(data);
			
		}
	}

	public int remove() throws EmptyListException
	{
		int data =0;
		if(!isEmpty())
		{
			data =  firstNode.data;
			firstNode = firstNode.getNextNode();			
		}
		else
		{
			throw new EmptyListException(name) ;
		}
		
		return data;
	}
	private boolean isEmpty() {
	    if(firstNode==null)
	    	return true;
	    else
	    	return false;
	}
	
	public void print() throws EmptyListException
	{
		System.out.println(name + " is :");
		if(isEmpty())
		{
			throw new EmptyListException(name);
		}
		else
		{
			Node currentNode = firstNode;
			while(currentNode != null)
			{
				System.out.println(currentNode.data);
				currentNode = currentNode.getNextNode();
			}
		}
	}
	
	

}
