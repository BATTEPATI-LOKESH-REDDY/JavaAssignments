package day1;
interface StackMethod{
	void push(int data);
	void pop();
	
}
class FixedStack implements StackMethod{
	int top;
	int arr[];
	int size;
	FixedStack(int size){
		this.size=size;
		arr=new int[size];
		top=-1;
	}
	public void push(int data) {
		if(top==arr.length-1) {
			System.out.println("stack is overflow");
		}
		else {
			top=top+1;
			arr[top]=data;
			System.out.println("succesfully pushed");
			
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is Underflow");
		}
		else {
			int value=arr[top];
			top=top-1;
			System.out.println("deleting value is:"+value);
			
		}
	}
}
class DynamicStack implements StackMethod{
	int top;
	int arr[];
	int size;
	DynamicStack(int size){
		this.size=size;
		arr=new int[size];
		top=-1;
		
	}
	public void push(int data) {
		if(top==arr.length-1) {
			int[] newArray=new int[2*arr.length];
			System.arraycopy(arr, 0, newArray, 0, arr.length);
			arr=newArray;
			top++;
			arr[top]=data;
			System.out.println("Successfully pushed:"+data);
		}
		else {
			top=top+1;
			arr[top]=data;
			System.out.println("succesfully pushed: "+data);
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is Underflow");
		}
		else {
			int value=arr[top];
			top=top-1;
			System.out.println("deleting value is:"+value);
			
		}
	}
	void display(){
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}
}

public class FixedAndDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedStack fs=new FixedStack(5);
		DynamicStack ds=new DynamicStack(4);
		ds.push(1);
		ds.push(2);
		ds.push(3);
		ds.push(4);
		ds.push(5);
		ds.push(6);
		ds.pop();
		
		

	}

}
