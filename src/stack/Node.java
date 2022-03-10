package stack;

public class Node<T> {
    private T data;
    private Node next;

    public void setdata(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }

    public void setNextNode(Node node){
        this.next = node;
    }
    public Node getNext(){
        return next;
    }


}
