public class Main {
    public static void main(String[] args) {
        ArrayStack arrstack =new ArrayStack(5);
        arrstack.push(35);
        arrstack.push(13);
        arrstack.push(20);
        arrstack.push(41);
        arrstack.push(37);
        arrstack.push(26);
        arrstack.print_stack();
        System.out.println("-----------------------------");
        System.out.println(arrstack.pop());
        arrstack.print_stack();
        System.out.println("-----------------------------");
        System.out.println(arrstack.peek());
        arrstack.print_stack();
        System.out.println("--------------LINKED----------");
        LinkedStack linkedStack =new LinkedStack();
        linkedStack.push(35);
        linkedStack.push(13);
        linkedStack.push(20);
        linkedStack.push(41);
        linkedStack.push(37);
        linkedStack.push(26);
        linkedStack.print();
        System.out.println("-----------------------------");
        System.out.println(linkedStack.pop());
        linkedStack.print();
        System.out.println("-----------------------------");
        System.out.println(linkedStack.peek());
        linkedStack.print();
    }
}