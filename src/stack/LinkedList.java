package stack;


public class LinkedList<T> implements List {
   private Node head;
   private int size;

   public LinkedList(){
       this.size = 0;
       this.head = new Node();
   }




    @Override
    public boolean isEmpty() {
        if(size==0){
            return  true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(Object data) {
        Node newNode = new Node();
        newNode.setdata(data);
        newNode.setNextNode(head);
        head = newNode;
        size++;

    }

    @Override
    public Object removeFirst() throws EmptyListException {
       Node temp = new Node();
       try{
                temp = head;
                head = head.getNext();
                size--;
        return temp.getData();
        }
        catch(Exception e){
            throw new EmptyListException("Empty list!");
        }
    }
}
