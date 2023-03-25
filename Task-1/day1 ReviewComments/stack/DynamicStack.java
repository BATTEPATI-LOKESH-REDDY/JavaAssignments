package day1.stack;

class DynamicStack implements StackMethod {
	int top;
	int arr[];
	int size;

	DynamicStack(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;

	}

	public void push(int data) {
		if (top == arr.length - 1) {
			int[] newArray = new int[2 * arr.length];
			System.arraycopy(arr, 0, newArray, 0, arr.length);
			arr = newArray;
			top++;
			arr[top] = data;
			System.out.println("Successfully pushed:" + data);
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

	void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}
}