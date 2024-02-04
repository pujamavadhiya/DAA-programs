//import java.util.*;
//class Node1 {
//    Node1 next;
//    int val;
//    Node1(int val){
//        this.val=val; } }
//public class mulLL {
//    Node1 createLink(int data)
//    { Node1 head=null;
//        Node1 trav=null;
//        while(data>0) {
//            int temp=data%10;
//            Node1 node1=new Node1(temp);
//            if(head==null){head=node1;trav=head;}
//            else{ trav.next=node1;
//                trav=trav.next;}
//            data=data/10; }
//        return head; }
//    Node1 performaddition(Node1 head1,Node1 head2)
//    { int carry=0;
//        Node1 head=null;
//        Node1 trav=head;
//        while(head1!=null && head2!=null )
//        { Node1 node1;
//            if((head1.val+head2.val+carry)>9) {
//                node1=new Node1((head1.val*head2.val+carry)%10);
//                carry=1; }
//            else{
//                node1=new Node1(head1.val*head2.val+carry);
//                carry=0; }
//            if(head==null) {
//                head=node1;
//                trav=node1; }
//            trav.next=node1;
//            trav=trav.next;
//            head1=head1.next;
//            head2=head2.next; }
//        while(head1!=null) {
//            Node1 node1=new Node1((head1.val+carry)%10);
//            if((head1.val+carry)>9==false)carry=0;
//            trav.next=node1;
//            trav=trav.next;
//            head1=head1.next; }
//        while(head2!=null) {
//            Node1 node1=new Node1((head2.val+carry)%10);
//            if((head2.val+carry)>9==false)carry=0;
//            trav.next=node1;
//            trav=trav.next;
//            head2=head2.next; }
//        if(carry==1) {
//            Node1 node1=new Node1(carry);
//            trav.next=node1; }
//        return head; }
//    void print(Node1 head)
//    { Node1 prev=null;
//
//        Node1 curr=head;
//        Node1 next=null;
//        while(curr!=null) {
//            next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next; }
//        head=prev;
//        while(head!=null) {
//            System.out.print("->"+head.val);
//            head=head.next;
//        } } public static void main(String args[]) {
//        addLL add=new addLL();
//        Scanner sc=new Scanner(System.in);
//        int data1=sc.nextInt();
//        int data2=sc.nextInt();
//        Node head1=add.createLink(data1);
//        Node head2=add.createLink(data2);
//        Node head=add.performaddition(head1,head2);
//        add.print(head);
//    }
//}
//
