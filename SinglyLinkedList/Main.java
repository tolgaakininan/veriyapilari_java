public class Main {
    public static void main(String[] args) {
        LinkedList zort=new LinkedList();
        zort.add(15);
        zort.add(75);
        zort.add(65);
        zort.add(5);
        zort.add(13);
        zort.add(12);
        zort.print();
        System.out.println(zort.getSize());

        zort.remove();
        zort.remove();
        zort.remove();
        zort.remove();
        zort.remove();
        zort.remove();
        zort.remove();
        zort.remove();
        zort.remove();
        System.out.println("------------------");
        zort.print();

    }
}