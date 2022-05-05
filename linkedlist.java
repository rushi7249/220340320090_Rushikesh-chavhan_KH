class linkedlist{
Node head;
static class Node{
	int data;
	Node next;
	Node prev;
	Node(int d){
		data=d;
		next=null;
		prev=null;
	}
}
void insert(int new_data){
	Node new_node=new Node(new_data);
	new_node.next=head;
	new_node.prev=null;
	if(head!=null)
		head.prev=new_node;
	head=new_node;
}


void delete(Node d)
{
	if(head==null || d==null ){
		return;
	}
	if (head==d){
		head=d.next;
	}
	if(d.next!=null){
		d.next.prev=d.prev;
	}
	if(d.prev!=null){
		d.prev.next=d.next;
	}
	return;
	
	
}


void print(Node n){
	Node p=null;
	System.out.println("forward print");
	while(n!=null)
	{
	System.out.println(n.data+"---");
	p=n;
	n=n.next;
	}
	System.out.println("=========");
	System.out.println("revers print");
	while(p!=null)
	{
		System.out.println(p.data+"---");
		p=p.prev;
	}
}
	
	public static void main(String args[]){
	linkedlist l1= new linkedlist();
l1.insert(1);	
l1.insert(5);
l1.insert(1);
l1.insert(2);
l1.insert(3);
l1.insert(4);
l1.insert(5);
l1.print(l1.head);
l1.delete(l1.head.next.next.next.next.next.next);
l1.delete(l1.head.next.next.next.next.next);

l1.print(l1.head);
	}
}

