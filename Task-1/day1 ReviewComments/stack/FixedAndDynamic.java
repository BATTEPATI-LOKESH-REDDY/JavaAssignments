package day1.stack;

public class FixedAndDynamic {

	public static void main(String[] args) {
		FixedStack fixedstack = new FixedStack(5);
		DynamicStack dynamicstack = new DynamicStack(4);
		fixedstack.push(1);
		fixedstack.push(2);
		fixedstack.push(3);
		fixedstack.push(4);
		fixedstack.push(5);
		fixedstack.push(4);

		fixedstack.pop();
		dynamicstack.push(1);
		dynamicstack.push(2);
		dynamicstack.push(3);
		dynamicstack.push(4);
		dynamicstack.push(5);
		dynamicstack.push(6);
		dynamicstack.pop();

	}

}