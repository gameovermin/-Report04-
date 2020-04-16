import java.util.EmptyStackException;

public class ArrayStack<E> {
	private E s[];			//스택을 위한 배열
	private int top;		//스택의 top 항목의 배열 원소 인덱스
	public ArrayStack() {	//스택 생성자
		s = (E[]) new Object[1];	//초기에 1인 배열	 생성
		top = -1;
	}
	public int size() {
		return top+1;	//스택이 있는 항목의 수를 리턴
	}
	public boolean isEmpty() {
		return (top == -1);		//스택이 empty이면 true 리턴
	}
	//peek(), push(), pop(), resize() 메소드 선언
	
	public E peek() {	// 스택 top 항목의 내용만을 리턴
		if(isEmpty()) 
			throw new EmptyStackException();	//underflow 시 프로그램 정지
		return s[top];
	}
	public void push(E newItem) {	//push 연산	
		if(size()==s.length) {
			resize(2*s.length);		//스택을 2배의 크기로 확장
		}
		s[++top] = newItem;			//새 항목을 push
	}
	public E pop(){
		if (isEmpty())
			throw new EmptyStackException();
		E item = s[top];
		s[top--] = null;
		if(size() > 0 && size()==s.length/4)
			resize(s.length/2);
		return item;
		
	}
	
}
