package com.ok;

public class CountNodesInSingleLinkedList {
    private static LinkedList head=null;
    private static LinkedList tail=null;
    public static class LinkedList {
    	private int data;
    	private LinkedList next;
    	public LinkedList(int data) {
    		this.data=data;
    		this.next=null;
    	}
    }
    public void addNode(int data)
    {
    	LinkedList newNode=new LinkedList(data);
    	if(head==null)
    	{
    		head=newNode;
    		tail=newNode;
    	}
    	else {
    		tail.next=newNode;
    		tail=newNode;
    	}
    }
    public int countNodes()
    {
    	int c=0;
    	LinkedList current=head;
    	while(current!=null)
    	{
    		System.out.print(current.data+"-->");
    		c+=1;
    		current=current.next;
    	}
    	System.out.println("null");
    	return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNodesInSingleLinkedList x=new CountNodesInSingleLinkedList();
		x.addNode(5);
		x.addNode(6);
		x.addNode(7);
		/* for n node we make it as
		 * for(i=0;i<n;i++)
		 * {
		 * x.addNode(s.nextInt());
		 * }
		 * above 3 lines can like this
		 */
		int z=x.countNodes();
		System.out.println("No.of Nodes in  linkedList :"+z);
	}

}
