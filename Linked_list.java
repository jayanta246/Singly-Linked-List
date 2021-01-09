package com.linked.list;

public class Linked_list
{
	private Node head=null;
	private int count=0;
	
	//add node at END
	public void addToEnd(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node current=head;
			while(current.getNext()!=null)
			{
				current=current.getNext();
			}
			current.setNext(node);
		}
	}
	
	//remove node from END
	public Node removeFromEnd()
	{
		if(head==null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node current=head;
			while(current.getNext().getNext()!=null)
			{
				current=current.getNext();
			}
			current.setNext(null);
		}
		return head;
	}
	
	//add node to FRONT
	public void addToFront(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node current=head;
			head=node;
			head.setNext(current);
		}
	}
	
	//remove node from FRONT
	public Node removeFromFront()
	{
		if(head==null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node current=head;
			current=head.getNext();
			head=current;
		}
		return head;
	}
	
	//size && no. of nodes
	public int noOfNodes()
	{
		if(head==null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node current=head;
			while(current!=null)
			{
				current=current.getNext();
				count++;
			}
		}
		return count;
	}

	//print node
	public void print()
	{
		if(head==null)
		{
			System.out.println("Empty Node");
		}
		else
		{
			Node current=head;
			while(current!=null)
			{
				System.out.println(current.getData());
				current=current.getNext();
			}
		}
		System.out.println("Null");
	}
}
