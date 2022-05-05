import java.util.*;

class stack{
int arr[];
int size;
int top1,top2;
stack(int n)
{
size=n;
arr=new int[n];
top1=n/2+1;
top2=n/2;
}
void push(int x)
{
if(top1>=1)
{
top1--;
arr[top1]=x;
}
else
{
System.out.println(x+"overflow");
return;
}
}


void push1(int x){
	if(top2<size-1)
	{
		top2++;
		arr[top2]=x;
	}
	else{
System.out.println(x+"overflow");
return;
}
}

	
int pop()
{
	if(top1<=size/2)
	{
 int x=arr[top1];
top1++;
return x;
}
else
{
System.out.println("underflow");

}
return 0;
}

int pop1()
{
	if(top2>=size/2+1)
	{
		int x= arr[top2];
		top2--;
		return x;
	}
	else{
		System.out.println("underflow");
		
}
return 1;
}
};
		
class TS{
public static void main(String args[]){
stack t1= new stack(5);
t1.push(5);
t1.push1(10);
t1.push1(40);
t1.push(11);
t1.push1(7);
System.out.println("popped element from stack1 is" +t1.pop());
t1.push1(15);
System.out.println("popped element from stack2 is" +t1.pop1());
}
}