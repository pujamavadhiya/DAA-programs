import java.util.*;
class Node {
    Node next;
    int val;
    Node(int val){
        this.val=val;
    } }
public class addLL {
    Node createLink(int data)
    { Node head=null;
        Node trav=null;
        while(data>0) {
            int temp=data%10;
            Node node=new Node(temp);
            if(head==null){
                head=node;
                trav=head;
            }
            else{ trav.next=node;
                trav=trav.next;
            }
            data=data/10;
        }
        return head;
    }
    Node performaddition(Node head1,Node head2)
    { int carry=0;
        Node head=null;
        Node trav=head;
        while(head1!=null && head2!=null )
        { Node node;
            if((head1.val+head2.val+carry)>9) {
                node=new Node((head1.val+head2.val+carry)%10);
                carry=1;
            }
else{
            node=new Node(head1.val+head2.val+carry);
            carry=0; }
            if(head==null) {
                head=node;
                trav=node; }
            trav.next=node;
            trav=trav.next;
            head1=head1.next;
            head2=head2.next; }

        while(head1!=null) {
            Node node=new Node((head1.val+carry)%10);
            if((head1.val+carry)>9==false)carry=0;
            trav.next=node;
            trav=trav.next;
            head1=head1.next; }

        while(head2!=null) {
            Node node=new Node((head2.val+carry)%10);
            if((head2.val+carry)>9==false)carry=0;
            trav.next=node;
            trav=trav.next;
            head2=head2.next; }

        if(carry==1) {
            Node node=new Node(carry);
            trav.next=node; }
        return head; }
    void print(Node head)
    { Node prev=null;

        Node curr=head;
        Node next=null;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next; }
        head=prev;
        while(head!=null) {
            System.out.print("->"+head.val);
            head=head.next;
        } }

    public static void main(String args[]) {
        addLL add=new addLL();
        Scanner sc=new Scanner(System.in);
        int data1=sc.nextInt();
        int data2=sc.nextInt();
        Node head1=add.createLink(data1);
        Node head2=add.createLink(data2);
        Node head=add.performaddition(head1,head2);
        add.print(head);
    }
}
