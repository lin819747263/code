package linkedlist;

import java.util.Stack;

public class LinkList {
	public Node head;
	public Node current;
	
	/**
	 * 增加节点
	 * @param data
	 */
	public void add(int data) {
		if(head==null) {
			head=new Node(data);
			current=head;
		}else {
			current.next=new Node(data);
			current=current.next;
		}
	}
	public void add(Node node) {
		if(node == null) {
			return;
		}
		
		if(head ==null) {
			head=node;
			current=head;
		}else {
			current.next=node;
			current=current.next;
		}
	}
	
	/**
	 * 打印节点
	 * @param node
	 */
	public void print(Node node) {
		if(node==null) {
			return;
		}
		current=node;
		
		while(current !=null) {
			System.out.println(current.data);
			
			current=current.next;
		}
	}
	
	/**
	 * 得到链表长度
	 * @param head
	 * @return
	 */
	public int getLength(Node head) {
		if(head==null) {
			return 0;
		}
		int length=0;
		Node current=head;
		while(current!=null) {
			length++;
			current=current.next;
		}
		return length;
	}
	
	/**
	 * 节点结构
	 * @author lin819747263
	 *
	 */
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	public Node findNode(Node head,int k) {
		if(k==0||head==null) {
			return null;
		}
		Node first=head;
		Node second=head;
		
		for(int i=0;i<k-1;i++) {
			second=second.next;
			if(second==null) {
				return null;
			}
		}
		while(second.next!=null) {
			first=first.next;
			second=second.next;
		}
		return first;
	}
	
	public Node findMidNode(Node head) {
		if(head==null) {
			return null;
		}
		Node first=head;
		Node second=head;
		
		while(second!=null&&second.next!=null) {
			first=first.next;
			second=second.next.next;
		}
		
		return first;
	}
	
	
	public Node mergeLinkList(Node head1,Node head2) {
		if(head1 ==null&&head2==null) {
			return null;
		}
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		Node head;
		Node current;
		
		if(head1.data<head2.data) {
			head=head1;
			current=head1;
			head1=head1.next;
		}else {
			head=head2;
			current=head2;
			head1=head2.next;
		}
		
		
		while(head1!=null && head2!=null) {
			if(head1.data<head2.data) {
				current.next=head1;
				current=current.next;
				head1=head1.next;
				
			}else {
				current.next=head2;
				current=current.next;
				head2=head2.next;
			}
		}
		
		if(head1!=null) {
			current.next=head1;
		}
		
		if(head2!=null) {
			current.next=head2;
		}
		
		return head;
	}
	
	
	public Node reverseList(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node current=head;
		Node next=null;
		Node reverseHead=null;
		
		while(current!=null) {
			next=current.next;
			current.next=reverseHead;
			reverseHead=current;
			current=next;
			
		}
		return reverseHead;
		
	}
	
	
	public void  reversePrint(Node head) {
		if(head==null) {
			return;
		}
		
		Stack<Node> stack=new Stack<>();
		Node current=head;
		
		while(current!=null) {
			stack.push(current);
			current=current.next;
		}
		
		while(stack.size()>0) {
			System.out.println(stack.pop().data);
		}
		
	}
	
	public boolean hasCycle(Node head) {
		if(head==null) {
			return false;
		}
		
		Node first=head;
		Node second=head;
		
		
		while(second!=null) {
			first=first.next;
			second=second.next.next;
			
			if(first==second) {
				return true;
			}
		}
		
		return false;
	}
	
	
}
