public class ArrayStack {
    private int[] stack;

    private int size;
    public ArrayStack(int capacity)
    {
        this.stack =new int[capacity];
    }
    public void push(int data)
    {
        if(size==stack.length)
        {
            int[] newArr=new int[stack.length*2];
            System.arraycopy(stack,0,newArr,0,stack.length);
            stack=newArr;
        }
        stack[size++]=data;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("List is already empty");
            return -1;
        }
        else {


            int val = stack[size - 1];
            stack[--size] = 0;
            return val;
        }

    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("List is already empty");
            return -1;
        }
        return stack[size-1];
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public void print_stack()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(stack[i]);
        }
    }
}
