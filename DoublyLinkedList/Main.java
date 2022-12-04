public class Main {
    public static void main(String[] args) {
        LinkedList zort=new LinkedList();
        zort.add_front(15);
        zort.add_front(75);
        zort.add_front(65);
        zort.add_front(5);
        zort.print();
        zort.delete_by_val(65);
        zort.add_after_val(75,23);
        zort.add_before(75,9349);
        zort.print();
    }
}