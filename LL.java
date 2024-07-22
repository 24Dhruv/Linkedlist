import java.util.*;
public class LL{
    private Node Head;
    private Node tail;
    private int size;
    
    public LL(){
        this.size =0;
    }

    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = Head;
        Head = node;

        if(tail == null){
            tail = Head;
        }
        size +=1;
    }

    public void insertlast(int val){
        if(tail == null){
            insertfirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value,int idx){
        if(idx == 0){
            insertfirst(value);
            return;
        }
        if(idx == size){
            insertlast(value);
            return;
        }

        Node temp = Head;
        for(int i =0;i<idx;i++){
            temp.next = temp;
        }
        Node node = new Node(valuee,temp.next);
        temp.next = node;
        size++;
    }

    public void display(){
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public Node get(int idx) {
        Node node = Head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node;
    }

    public void deletelast(){
        Node secondlast = get(size-2);
        // int val = tail.val;
        tail = secondlast;
        tail.next = null;
        size--;
        // return val;
    }

    public int delete(int idx){
        Node prev = get(idx -1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    public void deletefirst(){
        Head = Head.next;
        size--;
    }
public class Node{ 
     int val ;
     Node next ;

    public Node(int val){
        this.val = val;
    }
    public Node (Node next,int val){
        this.next = next;
        this.val = val;
    }
}
}
