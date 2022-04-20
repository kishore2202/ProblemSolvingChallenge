package practice;

public class LinkedList {
public static Node<Integer> creatingList()
{
	Node<Integer> n1=new Node<>(10);
	Node<Integer> n2=new Node<>(20);
	Node<Integer> n3=new Node<>(30);
	Node<Integer> n4=new Node<>(40);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	return n1;
}
public static void printList(Node<Integer> head)
{
	while(head!=null)
	{
		System.out.println(head.data+" ");
		head=head.next;
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=creatingList();
		printList(head);
	}

}
