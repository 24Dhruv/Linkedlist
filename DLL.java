public class DLL{

    public Node head;
    public Node tail;
    public int size;

    public DLL(){
        this.size =0;
    }

    public void insertfirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null; 
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.print("END");
      // Reverse 
        System.out.println("reverse");
        while (last != null) {
            System.out.print(last.val +" ->");
            last = last.prev;
        }
        System.out.print("START");
    }

    public void deletefirst(){
        head = head.next;
        head.prev = null;
    }



    public class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val,Node prev,Node next){
             this.val = val;
             this.prev = prev;
             this.next = next;
        }
        public Node(int val){
            this.val = val;
        }
    }
}
