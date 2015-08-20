
public class LinkedList {
	Node firstNode ;
	Node lastNode ;
	String name;
	
	
	public LinkedList()
	{
		this.name = "List";
	}
	
	public LinkedList(String listName)
	{
		this.name = listName;
		firstNode = lastNode = null;
	}
	
	public void insertAtFront(int data)
	{
		if (isEmpty())
		{
			firstNode =lastNode= new Node(data);
			
		}
		else
		{
			firstNode = new Node(data , firstNode);
		}
	}
	
	
	public void insertAtBack(int data)
	{
		if(isEmpty())//isempty
		{
			firstNode = lastNode = new Node(data);
		}
		else
		{
			
			lastNode =lastNode.nextNode = new Node(data); 
		}
	}
	
	public int removeFromFront() throws EmptyListException
	{
		int returnData;
		if(isEmpty())//isEmpty
		{
			throw new EmptyListException(name);
		}
		else
		{
			 returnData = firstNode.data;
			if(firstNode==lastNode)
			{
				firstNode=lastNode=null;
			}
			else
			{
				firstNode = firstNode.nextNode;
			}
		}
		return returnData;
	}
	
	public int  removeFromBack() throws EmptyListException
	{
		int returnData;
		if(isEmpty())//isEmpty
		{
			throw new EmptyListException(name);
		}
		else
		{
			 returnData = lastNode.data;
			if(firstNode==lastNode)
			{
				firstNode=lastNode=null;
			}
			else
			{
			
				Node currentNode = firstNode;
				while(currentNode.nextNode!=lastNode)
				{
					currentNode= currentNode.nextNode;
				}
				lastNode = currentNode;
				lastNode.nextNode = null;
			}
		}
		return returnData;
	}
	
	public boolean isEmpty()
	{
		return firstNode==null;
		
	}
	
	public void print()
	{
		if(isEmpty())
		{
			System.out.printf("%s is Empty/n" ,name);
			return;
		}
		Node currentNode = firstNode;
		while(currentNode!=null)
		{
			if (currentNode.nextNode == null)
			{
				System.out.printf("%d ",currentNode.data );
			}
			else
			{
				System.out.printf("%d -->",currentNode.data );
			}
			currentNode = currentNode.nextNode;
		}
		System.out.println();
	}

	public void removeDuplicates() {
		// TODO Auto-generated method stub
		int i;
		Node prevNode,currentNode;
		int val;
		
		for(i=0;i<this.size();i++)
		{
			currentNode = prevNode = this.getIndex(i);
			val = currentNode.getData();
			while(currentNode!=null)
			{
				if(val==currentNode.getData())
				{
					currentNode = currentNode.nextNode;
					prevNode.nextNode = currentNode;
				}
				else
				{
					currentNode = currentNode.nextNode;
					prevNode = prevNode.nextNode;
					
				}
			}
		}
		
		
		
	}
	
	private Node getIndex(int index)
	{
		Node indexNode = null;
		int curreIndex = 0;
		if(isEmpty())
		{
			
			return null;
		}
		Node currentNode = firstNode;
		while(currentNode!=null)
		{
			if (curreIndex == index)
			indexNode = currentNode;
			else				
			currentNode = currentNode.nextNode;
			curreIndex ++;
		}
		
		return indexNode;
	}
	
	private int size()
	{
		int size = 0;
		if(isEmpty())
		{
			
			return 0;
		}
		Node currentNode = firstNode;
		while(currentNode!=null)
		{
			size = size +1;
			currentNode = currentNode.nextNode;
		}
		
		return size;
	}
	
	public void findSize()
	{
		int length = 0;
		Node currNode = firstNode;
		length = recursiveSize(currNode );
		System.out.println("Size using recursive function is : " + length);
	}
	
	private int recursiveSize(Node currNode )
	{
		int size = 0;
		if(currNode!=null)
		{
			size = size+1;
			System.out.println("My Node is : " + currNode.data + " and size is : " + size);
			size = size + recursiveSize(currNode.nextNode);
			System.out.println("Size is " +size);
		}		
		return size;		
	}
	
	//This is a sum from Cracking the coding interview 
	// IT des not make any sense in the linked list example

	public void removeValue(int i) {
		// TODO Auto-generated method stub
		
	}
	

}
