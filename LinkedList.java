public class LinkedList {
    Node head=null;
    Node tail=null;
    int size=0;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void add(int d){
        Node n=new Node(d);
        if(head==null){
            head=n;
            tail=n;
        }else{
            tail.next=n;
            tail=n;
        }
        size++;
    }
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(1);
        l.add(2);
        System.out.println(l.size);
        while(head!=null){
            System.out.println(head);
            head=head.next;
        }
    }
}
