package practice;
import java.util.Scanner;
public class NodeAtGivenIndexFromEndInLinkedList {
	private ListNode head=null;
	private ListNode tail=null;
	public class ListNode
	{
		int data;
		ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void add(int data)
	{
		ListNode x=new ListNode(data);
		if(head==null)
		{
			head=x;
			tail=x;
		}
		else
		{
			tail.next=x;
			tail=x;
		}
	}
	public int len()
	{
		int i=0;
		ListNode current=head;
		while(current!=null)
		{
			i++;
			current=current.next;
		}
		return i;
	}
	public void nthNodeEnd(int n,int len)
	{
		ListNode f=head;
		int le=len-n;
		int r=0;
		if(le>=0) {
		while(f!=null)
		{
			if(r==le)
			{
				break;
			}
			r++;
			f=f.next;
		}
		System.out.println(f.data);
		}
		else {
			System.out.println(-1);
		}
	}
	public static void main(String[] args)throws Exception
	{
		Scanner s=new Scanner(System.in);
		NodeAtGivenIndexInLinkedList obj=new NodeAtGivenIndexInLinkedList();
		obj.add(4);
		obj.add(5);
		obj.add(72);
		obj.add(44);
		obj.add(45);
		obj.add(33);
		int j=obj.len();
		System.out.print("Enter the nth index fromend of linkedList:");
		int n=s.nextInt();
		obj.nthNodeEnd(n,j);
	}

}
