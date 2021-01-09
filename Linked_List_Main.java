package com.linked.list;

public class Linked_List_Main
{

	public static void main(String[] args)
	{
		Linked_list ll=new Linked_list();
		ll.addToEnd(5);
		ll.addToEnd(10);
		ll.print();
		System.out.println(ll.noOfNodes());
		System.out.println(ll.size());
		
		

	}

}
