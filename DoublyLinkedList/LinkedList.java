public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public void add_front(int data)
    {
        Node new_node=new Node(data);
        if(isEmpty())
        {
            head=new_node;
            tail=new_node;
            head.next=tail;
            tail.previous=head;
            head.previous=null;
            tail.next=null;
        }
        else
        {
            Node old_node=head;
            head=new_node;
            head.next=old_node;
            old_node.previous=head;
            head.previous=null;
        }
        size++;
    }
    public void print()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.println(current);
            current=current.next;
        }
    }
    public void add_after_val(int val,int data)
    {
        Node new_node=new Node(data);
        if(isEmpty())
        {
            head=new_node;
            tail=new_node;
            head.next=tail;
            tail.previous=head;
            size++;
        }
        Node current=head;
        while(current!=null)
        {
            if(current.data==val)
                {

                    Node data_next=current.next;
                    current.next=new_node;
                    new_node.previous=current;
                    new_node.next=data_next;
                    data_next.previous=new_node;
                    size++;
                }
            current=current.next;
        }

    }
    public void delete_by_val(int data)
    {
        Node current=head;
        while(current!=null)
        {
            if(current.data==data)
            {
                current.previous.next=current.next;
                Node previous_node=current.previous;
                current=current.next;
                current.previous=previous_node;
                size--;
            }
            current=current.next;
        }
    }
    public void add_before(int val,int data)
    {
        Node add_node=new Node(data);
        if(isEmpty())
        {
            System.out.println("There is no element in list");
        }
        else
        {
            Node current = head;
            while(current!=null)
            {
                if(current.data==val)
                {
                    Node old_node=current.previous;
                    old_node.next=add_node;
                    current.previous=add_node;
                    add_node.previous=old_node;
                    add_node.next=current;
                    size++;
                }
                current=current.next;
            }
        }
    }
    public void remove_tail()
    {
        tail=tail.previous;
        tail.next=null;
    }
    public int getSize()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return getSize()==0;
    }
}
