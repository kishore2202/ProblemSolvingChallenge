package practice;

import java.util.Scanner;

public class InsertNode {
public static Node<Integer> takeInput()
{
	Scanner sc=new Scanner(System.in);
	int data=sc.nextInt();
	Node<Integer> head=null,tail=null;
	while(data!=-1)
	{
		Node<Integer> currNode=new Node<Integer>(data);
		if(head==null)
		{
			head=currNode;
			tail=currNode;
		}
		else
		{
			tail.next=currNode;
			tail=currNode;
		}
		data=sc.nextInt();
	}
	return head;
}
public static Node<Integer> insertNode(Node<Integer> head,int elem,int pos)
{
	if(head==null && pos>0)
	{
		return head;
	}
	if(pos==0)
	{
		Node<Integer> newNode=new Node<>(elem);
		newNode.next=head;
		return newNode;
	}
	else
	{
		head.next=insertNode(head.next,elem,pos-1);
		return head;
	}
}
public static void print(Node<Integer> head)
{
	if(head==null)
	{
		return;
	}
		System.out.println(head.data+" ");
		print(head.next);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		head=insertNode(head,5,0);
		print(head);
	}

}
