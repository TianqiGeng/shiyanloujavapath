package J2SE;

import java.util.LinkedList;

public class EnumGenericStack<T> {
	private LinkedList<T> stackContainer=new LinkedList<T>();
	public void push(T t){
		stackContainer.addFirst(t);
	}
	public T pop(){
		return stackContainer.removeFirst();
	}
	public boolean isEmpty(){
		return stackContainer.isEmpty();
	}
}
