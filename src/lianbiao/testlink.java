package lianbiao;

public class testlink {
	public static void main(String[] args) {
		LinkList list1=new LinkList();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(7);
		list1.add(list1.head);
		System.out.println(list1.hasCycle(list1.head));
		
		
	}
}
