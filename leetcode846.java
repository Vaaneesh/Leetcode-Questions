import java.util.PriorityQueue;
import java.util.Scanner;

public class leetcode846 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size and ele");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter group size");
        int k=ob.nextInt();
        ob.close();
        if(n%k!=0){
            System.out.println(false);
            return;
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
        }
        while(!pq.isEmpty()){
            int h=pq.poll();
            for(int i=1;i<k;i++){
                if(!pq.remove(h+i)){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}