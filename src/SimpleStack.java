import java.util.EmptyStackException;

public class SimpleStack {
	private int first;
	private String[] stack;
	private static final int CAPACITY = 20;
	
	public SimpleStack() {
		stack = new String[CAPACITY];
		first = -1;
	}
	//good	
	public boolean empty() {
		boolean empty = (first == -1);
		return (empty);
	}
	//good
	public String peek() {
		checkUnderflowError();
		return stack[first];
	}
	//good
	public String pop() {
		checkUnderflowError();
		String element = stack[first];
		first--;
		return element;
	}
	//good
	public void push(String s) {
		first++;
		stack[first] = s;
	}
	//good
	public int search(String s) {
		for(int i = 0; i < size(); i++) {
			if(stack[i].equals(s)) {
				return size() - i;
			}
		}
		return -1;
	}
	//good
	public int size() {
		return first + 1;
	}
	//good
	public String toString() {
		String s = "[";
		for(int i = 0; i < size()-1; i++) {
            s +=  stack[i];
            s += ", ";
        }
		if(size() != 0) {
			s += stack[size()-1];
		}
		s += "]";
		return s;
	}
	//good
	private void checkUnderflowError() {
		if(empty()) {
			throw new EmptyStackException();
		}
	}

}
