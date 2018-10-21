
public class StackImplementationExplained {

	public static void main(String[] args) {

		System.out.println("Stack Implementation Explained ....... ");

		Stack mys = new Stack();

		mys.push(1, "AA");
		mys.push(2, "BB");
		mys.push(3, "CC");
		mys.push(4, "DD");
		mys.push(5, "EE");

		mys.displayAllNodes();

		mys.pop();
		mys.pop();
		mys.pop();
		mys.pop();
		mys.pop();
		mys.pop();
		mys.pop();
		mys.pop();
		mys.pop();
		mys.pop();
		mys.peek();
		
		mys.displayAllNodes();

	}

}