public class Tree {
    private TreeNode root;
    public void insert(int value)
    {
        if(root==null)
        {
            root=new TreeNode(value);
        }
        else
        {
            root.insert(value);
        }
    }
    public void print()
    {
        if(root!=null)
        {
            root.print();
        }
    }
    public void getMax()
    {
        System.out.println(root.getMax());
    }
    public void getMin()
    {
        System.out.println(root.getMin());
    }
}
