import java.util.*;

public class leetcode1441 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int target[]=new int[n];
        for(int i=0;i<n;i++){
            target[i]=ob.nextInt();
        }
        ob.close();
        HashSet<Integer>set=new HashSet<>();
        for(int num:target){
            set.add(num);
        }
        ArrayList<String>list=new ArrayList<>();
        for(int i=1;i<=target[target.length-1];i++){
            if(set.contains(i))
            list.add("Push");
            else{
                list.add("Push");
                list.add("Pop");
            }
        }
        System.out.println(list);
    }
}
