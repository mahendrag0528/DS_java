package practice;
import java.util.Scanner;
public class InsertNodeAtBeginOfLinkedList {
     private ListNode head=null;
     private ListNode tail=null;
     public static class ListNode{
    	 int data;
    	 ListNode next;
    	 public ListNode(int data)
    	 {
    		 this.data=data;
    		 this.next=null;
    	 }
     }
     public void addNode(int x)
     {
    	 ListNode newNode=new ListNode(x);
    	 if(head==null) {
    		 head=newNode;
    	     tail=newNode;
     }
    	 else {
    		 tail.next=newNode;
    		 tail=newNode;
    	 }
     }
    public void insertFirst(int day)
     {
    	 ListNode y=new ListNode(day);
    	 y.next=head;
    	 head=y;
     }
     public void print()
     {
    	 ListNode current=head;
    	 while(current!=null)
    	 {
    		 System.out.print(current.data+"-->");
    		 current=current.next;
    	 }
    	 System.out.println("nuLL");
     }
     public static void main(String[] args) throws Exception
     {
    	 InsertNodeAtBeginOfLinkedList g=new InsertNodeAtBeginOfLinkedList();
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("enter no.nodes you inserted");
    	 int n=s.nextInt();
    	 System.out.println("enter data");
    	 for(int i=0;i<n;i++)
    	 {
    		 g.addNode(s.nextInt());
    	 }
    	 System.out.println("enter data that insert at begining of List");
    	 g.insertFirst(s.nextInt());
    	 System.out.println("after add at beginning");
    	 g.print();
     }
}
