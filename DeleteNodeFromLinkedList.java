package practice;

public class DeleteFirstNode {

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
	public void add(int data)
	{
		ListNode x=new ListNode(data);
		if(head==null)
		{
			head=x;
			tail=x;
		}
		else {
			tail.next=x;
			tail=x;
		}
	}
	public void print()
	{
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	public void deleteFirst()
	{
		head=head.next;
	}
	public void deleteLast()
	{
		ListNode curnt=head;
		while(curnt.next!=tail)
		{
			curnt=curnt.next;
		}
		tail=curnt;
		tail.next=null;
	}
	public int deletemiddle(int mid)
	{
		int df=0;
		if(head.data!=mid)
		{
			ListNode pre=head;
			ListNode cur=head.next;
				while(cur.data!=mid)
				{
					cur=cur.next;
					pre=pre.next;
				}
				if(cur.data==mid) {
				pre.next=cur.next;
				df=1;
				}
				
		}
		if(df==1)
		return 0;
		else
			return -1;
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		DeleteFirstNode s=new DeleteFirstNode();
		s.add(3);
		s.add(18);
		s.add(272);
		s.add(163);
		s.print();
		s.deleteFirst();
		System.out.println("After delete first node:");
		s.print();
		s.deleteLast();
		System.out.println("After delete last node:");
		s.print();
		s.deletemiddle(272);
		System.out.println("After delete mid node:");
		s.print();
	}

}
