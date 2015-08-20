
public class Stack {

	Node firstNode;
	String name;
	
	public Stack()
	{
		this.name = "stack"; 
	}
	
	public Stack (String name )
	{
		this.name = name;
		firstNode = null;
	}
	
	public void push(int data)
	{
		if(isEmpty())
		{
			firstNode = new Node(data);
		}
		else
		{
			firstNode = new Node(data,firstNode);
		}
	}

	public int pop() throws EmptyListException
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
