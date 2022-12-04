public class LinkedList {
    Node head;
    int size;
    public void add(int data)
    {
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
        this.size++;
    }
    public Node remove()
    {
        if(getSize()==0)
        {
            System.out.println("List is already empty");
            return null;
        }
        Node remove_node=head;
        head=head.next;
        this.size--;
        return remove_node;

    }
    public int getSize()
    {
        return size;
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
}
