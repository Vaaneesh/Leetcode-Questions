import java.util.Scanner;

public class leetcode2816 {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(){}    
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
        ListNode(int data, ListNode next) { 
             this.data =data;
             this.next = next;
         }

    }
    public static ListNode doubleIt(ListNode head){
        if(head.data>4){
            head=new ListNode(0,head);
        }
        for(ListNode node=head;node!=null;node=node.next){
            node.data=(node.data*2)%10;
            if(node.next!=null && node.next.data>4){
                node.data++;
            }
        }
        return head.next;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        ListNode node=new ListNode(0);
        ListNode current=node;
        System.out.println("Enter input");
        int n=0;
        while (n != -1) {
            n = ob.nextInt();
            if (n != -1) { // Only create a new node if n is not -1
                current.next = new ListNode(n);
                current = current.next; // Move the current pointer forward
                
            }
        }
        doubleIt(node.next);
        while(node.next!=null){
            System.out.println(node.next.data);
            node=node.next;
        }
        ob.close();
    }
}
