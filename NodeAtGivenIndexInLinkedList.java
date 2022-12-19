package practice;
import java.util.*;
public class NodeAtGivenIndexInLinkedList {
	private ListNode head=null;
	private ListNode tail=null;
	public class ListNode{
		int data;
		ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void addNode(int d)
	{
		ListNode newNode=new ListNode(d);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void print()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	public void nodeAtIndex(int n)
	{
		int c=1;
		ListNode node=head;
		while(node!=null && c!=n)
		{
			node=node.next;
			c+=1;
		}
		if(c==n && node!=null)
		System.out.println("value at index"+" "+n+" is "+node.data);
		else
			System.out.println("node is not present at given index");
	}
	public static void main(String[] args)throws Exception
	{
		Scanner s=new Scanner(System.in);
		NodeAtGivenIndexInLinkedList obj=new NodeAtGivenIndexInLinkedList();
		obj.addNode(4);
		obj.addNode(5);
		obj.addNode(34);
		obj.addNode(22);
		obj.addNode(98);
		obj.print();
		System.out.println("Enter the nth index node:");
		int n=s.nextInt();
		obj.nodeAtIndex(n);
	}

}
