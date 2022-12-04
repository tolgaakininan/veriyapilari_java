import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    LinkedList<Integer> stack;
    public LinkedStack()
    {
        stack=new LinkedList<Integer>();
    }
    public void push(int val)
    {
        stack.push(val);
    }
    public int peek()
    {
        return stack.peek();
    }
    public int pop()
    {
        return stack.pop();
    }
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    public void print()
    {
        ListIterator<Integer> iterator= stack.listIterator();
        while(iterator.hasNext()) {System.out.println(iterator.next());}
    }
}
