import java.util.Scanner;
/**
 *  @brief stack size 10 structrue code 
 *  @author SangHoon Kim(github.com/runajoker)
 */
public class Stack {
	private static int[] stack;
	private static final int STACKSIZE = 10;
	private static int size = 0;
	
	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.setStack();
	}
	
	public void setStack() {
		stack = new int[STACKSIZE];
		Scanner sc = new Scanner(System.in);
		int commandSize = sc.nextInt();
		String command;
/*
push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/
	
		for(int index=0;index < commandSize; index++) {
			Scanner scannerCommand = new Scanner(System.in);
			 command = scannerCommand.nextLine(); 
			if(command.equals("pop")) {
				pop();
			} else if(command.equals("size")) {
				size();
			} else if(command.equals("empty")) {
				empty();
			} else if(command.equals("top")) {
				top();
			} else if(command.substring(0, 4).equals("push")) {
				try {
				int inputValue = Integer.parseInt(command.substring(5));
				push(inputValue);
				} catch (NumberFormatException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.println("Stack Command End");
	}
	
	public void push(int x) { 
		if(size >= STACKSIZE) {
			System.out.println("this stack is full size");
		} else {
			stack[size] = x;
			size++;
		}
		
	}
	public void pop() {
		if(size == 0) {
			System.out.println("-1");
		} else {
			System.out.println(stack[size-1]);
			int tmpStack[] = new int[size-1];
		
			for(int index = 0; index < size-1;index++) {
				tmpStack[index] = stack[index];
			}
			stack = new int[STACKSIZE];
			size--;
			for(int index = 0; index < size;index++) {
				stack[index] = tmpStack[index];
			}
		}
	}
	public void size() {
		System.out.println(size);
	}
	public void empty() {
		if(size == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
	public void top() {
		System.out.println(stack[size-1]);
	}
}
