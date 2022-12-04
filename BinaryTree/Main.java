public class Main {
    public static void main(String[] args) {
        Tree agac=new Tree();
        agac.insert(35);
        agac.insert(3);
        agac.insert(39);
        agac.insert(-5);
        agac.insert(36);
        agac.insert(77);
        agac.insert(17);
        agac.print();
        System.out.println("**************************");
        agac.getMax();
        agac.getMin();

    }
}