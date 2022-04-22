package class2;

import java.util.Scanner;

public class ListRecursion {
public static Node<Integer> input()
{
	//it takes input till -1
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
public static void printR(Node<Integer> head)
{
	if(head==null)
	{
		return;
	}
	System.out.println(head.data+" ");
	printR(head.next);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = input();
		printR(head);
	}

}
