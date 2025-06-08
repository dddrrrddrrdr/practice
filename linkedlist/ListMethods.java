package linkedlist;

public class ListMethods<T> {

    public Node head;

    public void LinkMethods(T... data){
        if(data.length < 1){
            head = null;
        }
        else{
            for(int i = 0; i < data.length; i++){
                addFront(data[i]);
            }
        }
    }
    public void addFront(T data){
        if(head == null){
            head = new Node(data);
        }
        else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public void addTail(T data){
        if(head == null){
            head = new Node(data);
        }
        else{
            Node iterator = head;

            while(iterator.next != null){
                iterator = iterator.next;
            }
            iterator.next = new Node(data);
        }
    }

    public T popHead(){
        if(head == null){
            return null;
        }
        Node returnHead = head;
        head = head.next;
        return (T) returnHead.data;
    }


        public T popTail(){
            if(head == null){
                return null;
            }

            if(head.next == null){
                Node returnHead = head;
                head = null;
                return (T) returnHead.data;
            }

            Node iterator = head;
            Node previous = null;
            
            while(iterator.next != null){
                previous = iterator;
                iterator = iterator.next;
            }
            Node returnTail = iterator;
            previous.next = null;
            return (T) returnTail.data;
        }


    public void removeNode(T data){
        if(head == null){
            return;
        }
        
        if(head.data == data){
            popHead();
        }
        else{
            Node iterator = head;
            Node previous = null;
            while(iterator.data != data && iterator.next != null){
                previous = iterator;
                iterator = iterator.next;
            }
            if(iterator.next == null && iterator.data != data){
                System.out.println("The data you are trying to delete does not exist");
                return;
            }
            else if(iterator.next == null && iterator.data == data){
                popTail();
            }
            else{
                previous.next = iterator.next;
            }
        }
    }

    public void printList(){
        if(head == null){
            System.out.print("The list is empty");
        }
        else{
            Node iterator = head;
            while(iterator != null){
                System.out.print("|" + iterator.data + "| "+ " --> ");
                iterator = iterator.next;
            }
        }
    }
    
}
