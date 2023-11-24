import java.util.HashSet;
import java.util.Scanner;

public class leetcode349 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of arrs");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter size of new arr");
        int n1=ob.nextInt();
        int arr2[]=new int[n1];
        for(int i=0;i<n;i++){
            arr2[i]=ob.nextInt();
        }
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        for(int i:arr2){
            if(set.contains(i))
            set2.add(i);
        }
        System.out.println(set2);
        ob.close();
    }
}
