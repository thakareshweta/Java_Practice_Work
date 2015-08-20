
public class Node {
	int data;
	Node nextNode;
	
	public Node()
	{
		this.data = 0;
		nextNode = null;
	}
	
	public Node(int data)
	{
		this.data = data;
		nextNode = null;
	}
	
	public Node(int data,Node node)
	{
		this.data = data;
		this.nextNode = node;
	}

	public int getData() {
		return data;
	}

	public Node getNextNode() {
		return nextNode;
	}
	
	


}
