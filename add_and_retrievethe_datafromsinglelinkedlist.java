package com.ok;
import java.util.*;
public class SingleLinkedList {
    protected static ListNode head=null;
    protected static ListNode tail=null;
    public static class ListNode{
    	private int data;
    	private ListNode next;
    	public ListNode(int data)
    	{
    		this.data=data;
    		this.next=null;
    	}
    }
        void addNode(int data) {
    		ListNode newNode=new ListNode(data);
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
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        SingleLinkedList sll=new SingleLinkedList();
        for(int i=0;i<n;i++)
        {
        	int r=s.nextInt();
             sll.addNode(r);  
               
        }
       // sll.head.next=new ListNode(2);
        //sll.head.next.next=new ListNode(5);
        ListNode dis=sll.head;
        while(dis!=null)
        {
        	System.out.print(dis.data+"-->");
        	dis=dis.next;
        }
        System.out.println("null");
	}
}
