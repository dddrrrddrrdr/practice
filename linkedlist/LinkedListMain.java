package linkedlist;

public class LinkedListMain {
    
    public static void main(String[] args){
        ListMethods<Integer> list = new ListMethods<>();
        list.addFront(1);
        list.addTail(2);
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);

        list.printList();
    }

}
