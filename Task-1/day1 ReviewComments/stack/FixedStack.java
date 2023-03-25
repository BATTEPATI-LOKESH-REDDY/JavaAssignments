package day1.stack;

class FixedStack implements StackMethod {
	int top;
	int arr[];
	int size;

	FixedStack(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}

	public void push(int data) {
		if (top == arr.length - 1) {
			System.out.println("stack is overflow");
		} else {
			top = top + 1;
			arr[top] = data;
			System.out.println("succesfully pushed: " + data);

		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is Underflow");
		} else {
			int value = arr[top];
			top = top - 1;
			System.out.println("deleting value is:" + value);

		}
	}
}