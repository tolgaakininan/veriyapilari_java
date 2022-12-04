public class Queue {
    private int[] arr;
    private int size;
    public Queue(int capacity)
    {
        arr=new int[capacity];
    }
    public void add(int data)
    {
        if(size==arr.length)
        {
            int[] tempArr=new int[arr.length*2];
            System.arraycopy(arr,0,tempArr,0,arr.length);
            arr=tempArr;
        }
        arr[size++]=data;
    }
    public int peek()
    {
        return arr[0];
    }
    public void remove()
    {
        if(isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
        for(int i=0;i<size-1;i++)
        {
            arr[i]=arr[i+1];
        }
        size--;
    }
    public void print()
    {
        if(isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public boolean isEmpty()
    {
        return size==0;
    }
}
