public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value)
    {
        if(value==data)
        {
            return;
        }
        else
        {
            if(value>data)
            {
                if(left==null)
                {
                    left=new TreeNode(value);
                }
                else
                {
                    left.insert(value);
                }
            }
            else
            {
                if(right==null)
                {
                    right=new TreeNode(value);
                }
                else
                {
                    right.insert(value);
                }
            }
        }
    }
    public void print()
    {
        if(right!=null)
        {
            right.print();
        }

        System.out.println(data);
        if(left!=null)
        {
            left.print();
        }

    }
    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
    public int getMax()
    {
        if(left==null)
        {
            return data;
        }
        else
        {
            return left.getMax();
        }
    }
    public int getMin()
    {
        if(right==null)
        {
            return data;
        }
        else
        {
            return right.getMax();
        }
    }
}
