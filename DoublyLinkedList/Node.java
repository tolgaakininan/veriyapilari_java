public class Node {
    int data;
    Node next;
    Node previous;
    public Node(int data)
    {
        this.data=data;
    }

    @Override
    public String toString(){
        return ""+data;
    }
}
