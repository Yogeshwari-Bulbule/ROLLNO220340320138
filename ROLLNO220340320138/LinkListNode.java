  import java.util.*;
  class LinkList{
	  public static  class node{
		  int data;
		  Node Next;
		  public Node(int data)
		  {
			  this.data=data;
			  this.next=null;
		  }
	  }
	  Node head=null;
	  public void createNode()
	  {
		  scanner sc=new Scanner(system.in);
		  int data ,n;
		  do{
			  System.out.println("enter data");
			  data=sc.nextInt();
			  Node newnode=newNode(data);
			  if(head==null)
			  {
				  head=newnod;
			  }
			  else{
				  newNode.next=head;
				  head=newNode;
			  }
			 // System.out.println("");
			 n=sc.nextInt();
		  }
		  while(n==1);
		  
		  
		  public void traversar()
		  {
			  Node temp=head;
			  if(head==null)
			  {
				  System.out.println("link list does not exit");
			  }
			  else{
				   while(temp!=null)
				   {
					   system.out.println(temp.data);
					   temp=temp.next;
				   }
			  }
		  }
		  public void reverse( Node head)
		  {
			  
			  if(head ==null)
				  return;
			  reverse (head.next);
			  System.out.println(head.data+ "<---");
		  }
			  
			  
		  }
		  public static void main(String args[])
		  {
			  LinkList l1=new LinkList();
			  l1.createnode();
			  l1.reverse();
			  l1.traversar();
		  }
	  }
			  
		  